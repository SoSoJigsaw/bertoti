# Script de automação do povoamento do banco

[1. automacão.py](# automacao)

[2. leituraDfs.py](# leituraDfs)

[3. cleaningData.py](# cleaningData)

[4. cabeçalho.py](# cabecalho)

[5. conexaoBD.py](# conexaoBD)

[6. runFunctions.py](# runFunctions)

## automação.py

```python
import os
import requests
from datetime import date
import zipfile
import shutil
import logging

```

O módulo `os` foi usado para realizar operações no sistema operacional, como criação de diretórios e acesso a arquivos. O módulo `requests` foi utilizado para fazer solicitações HTTP, para puxar os dados meteorológicos de uma base de dados em um servidor web. "datetime" foi usado para lidar com datas, pois que no método que fazia o download dos dados passava- se a data como parâmetro para baixar os dados de um determinado ano. `zipfile` e `shutil` foram usados para extrair arquivos zip e manipular os arquivos e diretórios. Por fim, `logging` foi usado para criar um arquivo de log para registro de eventos, seja execuções bem- sucedidas ou quando um erro foi lançado.

```python
class Automacao:

    logging.basicConfig(filename="log.txt", level=logging.DEBUG,
                        format="%(asctime)s %(message)s", filemode="a")

```

Essa parte do código define a classe `Automacao`. O método `logging.basicConfig` é chamado para configurar o arquivo de log para registro de eventos a partir da execução do código, incluindo execuções bem- sucedidas e erros tratados. Especificamente, o arquivo `log.txt` é criado com o nível de registro "DEBUG". O formato do registro é definido para incluir a data e hora em que o registro foi feito e a mensagem registrada.

```python
def download_df(self, ano: int):
    url = "https://portal.inmet.gov.br/uploads/dadoshistoricos/{}.zip".format(ano)
    endereco = os.path.join("DF","{}.zip".format(ano))
    try:
        os.mkdir("DF/{}".format(ano))
    except:
        shutil.rmtree(f"DF/{ano}", ignore_errors=False, onerror=None)
        os.mkdir("DF/{}".format(ano))
    status = requests.get(url)
    if status.status_code == requests.codes.OK:
        with open(endereco, "wb") as novo_arquivo:
            novo_arquivo.write(status.content)
    else:
        status.raise_for_status()
    return

```

O método `download_df` é responsável por fazer o download do arquivo zip correspondente aos dados meteorológicos históricos do ano especificado pelo parâmetro `ano`. A variável `url` é criada para especificar a URL do arquivo zip no site do INMET. A variável `endereco` é criada para especificar o caminho completo onde o arquivo zip será salvo.

Em seguida, o método tenta criar um diretório com o nome do ano especificado. Se o diretório já existir, ele é removido e criado novamente. Isso é feito para garantir que o diretório esteja vazio antes de salvar o arquivo zip.
O método faz uma solicitação HTTP para baixar o arquivo zip e verifica se a solicitação foi bem sucedida (código 200 OK). Se sim, o conteúdo do arquivo é salvo no caminho especificado. Caso contrário, uma exceção é gerada para lidar com o erro.

```python
def extract(self, ano: int):
    zip_ref = zipfile.ZipFile("DF/{}.zip".format(ano), "r")
    reference = ("DF/{}".format(ano))
    zip_ref.extractall(reference)
    zip_ref.close()
    os.remove("DF/{}.zip".format(ano))
    print("{} Extraido".format(ano))
    return

```

O método `extract` é responsável por extrair o arquivo zip baixado anteriormente para o diretório especificado. Ele usa o módulo `zipfile` para abrir o arquivo zip.

[Voltar ao topo](# voltar)

## leituraDfs.py

```python
import pandas as pd
from conexaoBD import ConexaoBD
from cleaningData import CleaningData
from cabeçalho import Cabecalho
import logging
import glob

class LeituraDfs:

    logging.basicConfig(filename="log.txt", level=logging.DEBUG,
                        format="%(asctime)s %(message)s", filemode="a")

```

Nesse trecho do código, é importado as bibliotecas que serão utilizadas e criado a classe LeituraDfs. É também configurado o `logging`, que irá registrar informações sobre o que está acontecendo no programa.

```python
def leitura_dfs(self, ano: str):

        cbd = ConexaoBD()

        cbd.conectar_banco()

        try:

            # Path dos dataframes
            files = glob.glob(fr"C:\Users\** \Iacit\CSVs\DF\{ano}\* .csv", recursive=True)

            i = 1
            for f in files:
                df = pd.read_csv(f, sep=';', encoding='latin- 1', on_bad_lines='skip')
                df1 = pd.read_csv(f, sep=';', encoding='latin- 1', skiprows=[0, 1, 2, 3, 4, 5, 6, 7], on_bad_lines='skip')

```

Neste trecho do código, é definido a função `leitura_dfs` que recebe o ano como parâmetro. É criada uma instância da classe `ConexaoBD`. Depois, é chamado o método `conectar_banco` para realizar a conexão com o banco de dados. Em seguida, é definido o caminho dos arquivos CSV utilizando o método `glob.glob`. Iteramos sobre cada arquivo CSV no diretório, e lemos os dados utilizando a biblioteca `pandas`: o parâmetro `sep` define o separador utilizado no arquivo CSV, o parâmetro `encoding` define a codificação utilizada no arquivo CSV, e o parâmetro `on_bad_lines` define a ação a ser tomada caso ocorra algum erro na leitura do arquivo. No segundo `pd.read_csv`, foi definido que as primeiras 8 linhas serão puladas, pois que nelas não contêm dados relevantes.

```python
# Criando colunas do cabeçalho vertical
                df['CODIGO (WMO)'] = df.loc[2][1]

                # Dando merge nos dataframes
                df = df1.assign(key=1).merge(df[['CODIGO (WMO)']].assign(key=1), on='key').drop('key', axis=1)
                del df1

```

Neste trecho de código, foi criada uma coluna com o código da estação meteorológica utilizando a função `loc`, e foi atribuído o valor a coluna a partir da segunda linha da primeira coluna (B1) do arquivo CSV. Em seguida, foi dado um merge nos dataframes `df` e `df1`, utilizando a coluna criada anteriormente. Por fim, foi excluído a variável `df1` para liberar memória.

```python
# Tratamento dos dados e povoamento do banco de dados
                cleaningData = CleaningData()

                df = cleaningData.tratamento_dfs(df)

                cbd.povoar_banco(df.getRad(), 'radiacao_global')
                cbd.povoar_banco(df.getPrecip(), 'precipitacao')

```

O trecho `cleaningData = CleaningData()` cria uma instância da classe `CleaningData` para tratar os dados antes de serem povoados no banco de dados.

O método `tratamento_dfs(df)` recebe um DataFrame como entrada e retorna o DataFrame tratado. Esse tratamento envolve a remoção de linhas e colunas desnecessárias, a conversão de tipos de dados, a limpeza de valores faltantes e a renomeação de colunas.

Os DataFrames tratados são povoados no banco de dados por meio dos métodos `povoar_banco(df.getRad(), 'radiacao_global')`, `povoar_banco(df.getPrecip(), 'precipitacao')`, `povoar_banco(df.getVento(), 'vento')`, `povoar_banco(df.getAtm(), 'pressao_atmosferica')`, `povoar_banco(df.getTemp(), 'temperatura')` e `povoar_banco(df.getUmi(), 'umidade')`, que recebem o DataFrame tratado e o nome da tabela no banco de dados que será populada.

[Voltar ao topo](# voltar)

## cleaningData.py

O cleaningData.py é um módulo que contém uma classe CleaningData que possui métodos para tratamento de dados em um DataFrame.

```python
import pandas as pd
import logging
from pandas.core.frame import DataFrame

```

O código começa importando as bibliotecas `pandas`, `logging` e `DataFrame`. A biblioteca `pandas` é utilizada para manipulação de dados em um DataFrame. Já a biblioteca `logging` é utilizada para exibir mensagens de depuração. Por fim, o `DataFrame` é importado para ser utilizado como type de algumas variáveis do código.

```python
class CleaningData:

logging.basicConfig(filename="log.txt", level=logging.DEBUG,

format="%(asctime)s %(message)s", filemode="a")

def __int__(self, rad, precip, vento, atm, temp, umi):

self.__rad = rad

self.__precip = precip

self.__vento = vento

self.__atm = atm

self.__temp = temp

self.__umi = umi

def getRad(self):

return self.__rad

def getPrecip(self):

return self.__precip

def getVento(self):

return self.__vento

def getAtm(self):

return self.__atm

def getTemp(self):

return self.__temp

def getUmi(self):

return self.__umi

```

A seguir é definida a classe `CleaningData`, que possui um construtor com seis argumentos, que são atributos privados da classe.
Os métodos `getRad()`, `getPrecip()`, `getVento()`, `getAtm()`, `getTemp()` e `getUmi()` são utilizados para retornar os valores dos atributos privados da classe.

```python
def tratamento_dfs(self, df: DataFrame):

try:

pd.options.mode.chained_assignment = None

# Apagando as linhas duplicadas

df = df.drop_duplicates(subset=['Data', 'Hora UTC'], keep='first')

for col in df.columns:

mask = (df[col] == ',9')

df.loc[mask, col] = '0,9' (...)

# Ajustando Data ao padrão Br

df['Data'] = pd.to_datetime(df['Data'], errors='coerce')

df['Data'] = df['Data'].dt.strftime("%d/%m/%Y")

# Juntando a Data à Hora

df["DATAHORA DE CAPTAÇÃO"] = df["Data"] + ' ' + df["Hora UTC"]

df['DATAHORA DE CAPTAÇÃO'] = df['DATAHORA DE CAPTAÇÃO'].replace({'0000 UTC': '00', '0100 UTC': '01', (...) }, regex=True)

# Apagando colunas

if 'Unnamed: 19' in df.columns:

df.drop('Unnamed: 19', inplace=True, axis=1)

if ',,,,,,' in df.columns:

df.drop(',,,,,,', inplace=True, axis=1)

df.drop('Data', inplace=True, axis=1)

df.drop('Hora UTC', inplace=True, axis=1)

# Apagando vírgulas em sequência errôneas

df = df.replace({',,,,,,,,,,,,,': ''}, regex=True)

df = df.replace({',,,,,,,,,,,,': ''}, regex=True)

# Apagando vírgulas de valores floating

df = df.replace({',': '.'}, regex=True)

# Redeterminando valores Nan

df = df.astype(object).where(pd.notnull(df), None)

# Convertendo a datetime

df['DATAHORA DE CAPTAÇÃO'] = pd.to_datetime(df['DATAHORA DE CAPTAÇÃO'], errors='raise', dayfirst=True)

# Renomeando Colunas

df = df.rename({'CODIGO (WMO)': 'cod_wmo', 'RADIACAO GLOBAL (Kj/m²)': 'radiacao_global', (...) }, axis=1)

# Desmembrando os dataframes por tabela do banco

cleaningData = CleaningData()

df = cleaningData.desmembrar_dfs(df)

return df

```

O método `tratamento_dfs` recebe um DataFrame como parâmetro e realiza diversas operações de limpeza nos dados.

O primeiro passo é desativar o modo `chained assignment` do `pandas`, que evita que o pandas emita um aviso quando uma operação de atribuição é realizada.

Em seguida, o método apaga as linhas duplicadas do DataFrame usando o método `drop_duplicates()`. É passado como parâmetro as colunas Data e Hora UTC e a opção `keep='first'`, que mantém apenas a primeira linha duplicada e remove as outras.

O próximo passo é percorrer todas as colunas do DataFrame e substituir valores com vírgula por valores com ponto, utilizando o método `replace()` da biblioteca `pandas`. Isso foi feito para que o dataframe fosse formato conforme as regras de sintaxe do banco de dados, já que esses dados foram definidos no banco como tipo float, e o banco reconhece o tipo float utilizando ponto ao invés de vírgulas.

Depois é feito o ajuste da coluna Data para o padrão brasileiro. Isso é feito utilizando o método `pd.to_datetime()` para converter a coluna em formato de data.

Em seguida, o método `dt.strftime()` é utilizado para formatar a data no padrão DD/MM/YYYY.

Em seguida, a coluna Data é juntada com a coluna Hora UTC utilizando o operador de soma `+` e o resultado é armazenado na coluna DATAHORA DE CAPTAÇÃO. Em seguida, o método `replace()` é utilizado para substituir os valores 0000 UTC, 0100 UTC, ..., 2300 UTC pelos valores 00, 01, ..., 23, respectivamente. Isso foi feito novamente para se adequar ao banco de dados, já que a coluna de data do banco de dados era do tipo datetime, então o formato UTC não era viável para o povoamento do banco.

Depois, as colunas Data e Hora UTC são removidas do DataFrame utilizando o método `drop()`.

Em seguida, o método remove as vírgulas em sequência errôneas, utilizando o método `replace()` e a expressão regular ',,,,,,,,,,,,,' e ',,,,,,,,,,,,'. Em alguns arquivos CSVs, alguns dados vinham com uma sequência de vírgulas, e isso teve que ser retirado para tratar o dado e mandar ao banco de dados os dados na formatação correta.

Então, o método redefine os valores `NaN` (Not a Number) do DataFrame como `None` utilizando o método `astype()` em conjunto com a função `pd.notnull()`. Isso foi realizado porque o PostgreSQL define valores nulos como None e, caso a mudança não fosse feita, os inserts não seriam nulos, e ficariam registrados como NaN, o que tiraria a integridade dos dados.

Em seguida, a coluna DATAHORA DE CAPTAÇÃO é convertida para o tipo datetime utilizando o método `pd.to_datetime()`.

O método renomeia as colunas do DataFrame utilizando o método `rename()`. Isso foi realizado pra facilitar o processo de envio dos dataframes ao banco de dados, pois deixando o nome das colunas da mesma forma que é o nome das colunas no banco de dados, ao executar o comando de envio o método reconhece automaticamente a qual coluna o dado deve ser inserido.

Por fim, o método cria um objeto da classe `CleaningData()` para chamar o próximo método definido no escopo do código que é o `desmembrar_dfs()`, colocando a variável `df` como parâmetro e armazenando o retorno do método na variáve `df`, que muda o seu valor. E, então, o método retorna a última versão da variável `df` como último ponto de seu script.

```python
def desmembrar_dfs(self, df: DataFrame):

# Criando objeto e determinando atributos da instância

dfFiltrado = CleaningData()

dfFiltrado.__rad = df[['cod_wmo', 'radiacao_global', 'datahora_captacao']]

dfFiltrado.__atm = df[['cod_wmo', 'pressao_atm_estacao', 'pressao_atm_min',

'pressao_atm_max', 'datahora_captacao']]

dfFiltrado.__umi = df[['cod_wmo', 'umidade_relativa_ar', 'umidade_relativa_min',

'umidade_relativa_max', 'datahora_captacao']]

dfFiltrado.__temp = df[['cod_wmo', 'temperatura_ar', 'temperatura_min',

'temperatura_max', 'temperatura_ponto_orvalho',

'temperatura_orvalho_min', 'temperatura_orvalho_max', 'datahora_captacao']]

dfFiltrado.__vento = df[['cod_wmo', 'vento_velocidade', 'vento_rajada_max',

'vento_direcao_horario', 'datahora_captacao']]

dfFiltrado.__precip = df[['cod_wmo', 'precipitacaototal', 'datahora_captacao']]

return dfFiltrado

```

O método `desmembrar_dfs()` recebe como parâmetro um objeto do tipo `DataFrame`, e então tem a função de desmembrá- lo em diversos DataFrames separados, salvando seus valores em atributos privados da classe que ele pertence, o `CleaningData()`. Isso é feito com a intenção de facilitar o processo de persintência dos dados no banco de dados quando esses atributos forem acessados pela classe de povoamento do banco de dados (`conexaoBD()`).

[Voltar ao topo](# voltar)

## cabeçalho.py

```python
import pandas as pd
import logging
from pandas.core.frame import DataFrame

```

O trecho de código começa com as importações necessárias para o funcionamento do código: `import pandas as pd` é usado para a manipulação de dados em formato de tabela, `import logging` é utilizado para registro de eventos em um arquivo de log, e `from pandas.core.frame import DataFrame` é usado para especificar o tipo DataFrame, que é um tipo de objeto que permite a manipulação de dados em formato de tabela.

```python
class Cabecalho:

logging.basicConfig(filename="log.txt", level=logging.DEBUG,

format="%(asctime)s %(message)s", filemode="a")

def __int__(self, estacao):

self.__estacao = estacao

def getEstacao(self):

return self.__estacao

```

Nesse trecho de código, é definida a classe `Cabecalho`, que possui um método construtor `__init__` que recebe um parâmetro `estacao` e o armazena em um atributo privado `__estacao`. Em seguida, é definido um método `getEstacao` que retorna o valor do atributo privado `__estacao`.

```python
def tratamento_cabecalho(self, df: DataFrame):

try:

pd.options.mode.chained_assignment = None

df['REGIAO'] = df.loc[0][1]

df['UF'] = df.loc[1][1] (...)

# Apagando duplicadas

df = df.drop_duplicates(subset=['REGIAO', 'UF'], keep='first')

# Apagando vírgulas extras

cols = ["REGIAO", "UF", "ESTACAO", "CODIGO (WMO)", "LATITUDE", "LONGITUDE", "ALTITUDE", "DATA DE FUNDACAO"]

df[cols] = df[cols].replace({',,,,,,,,,,,,,': ''}, regex=True)

df[cols] = df[cols].replace({',,,,,,,,,,,,': ''}, regex=True)

df[cols] = df[cols].replace({',': '.'}, regex=True)

# Convertendo a datetime

df['DATA DE FUNDACAO'] = pd.to_datetime(df['DATA DE FUNDACAO'], errors='coerce')

# Renomeando colunas

df = df.rename({'CODIGO (WMO)': 'cod_wmo', 'ESTACAO': 'estacao_nome', (...) }, axis=1)

# Organizando o dataframe conforme a tabela do banco

cabecalho = Cabecalho()

df = cabecalho.organizar_cabecalho(df)

return df

except:

logging.debug("- ERRO: tratamento do cabeçalho não pode ser concluída (CSVs/cabeçalho.py)")

raise

```

O método `tratamento_cabecalho` recebe um objeto DataFrame `df` e realiza uma série de transformações nele. Primeiro, é definido que as mensagens de registro de eventos serão armazenadas em um arquivo de log chamado `log.txt`. Em seguida, é criada uma nova coluna no DataFrame `df` para cada um dos seguintes campos: REGIAO, UF, ESTACAO, CODIGO (WMO), LATITUDE, LONGITUDE, ALTITUDE e DATA DE FUNDACAO. Os valores dessas colunas são extraídos do DataFrame `df` de acordo com as posições de linha e coluna especificadas. Em seguida, as linhas duplicadas do DataFrame `df` são removidas e as vírgulas extras são substituídas por pontos.

Além disso, a coluna "DATA DE FUNDACAO" é convertida para o tipo `datetime`.

```python
def organizar_cabecalho(self, df: DataFrame):

# Criando objeto e determinando atributos da instância

dfEstacao = Cabecalho()

dfEstacao.__estacao = df[['cod_wmo', 'estacao_nome', 'estacao_regiao', 'estacao_estado',

'estacao_longitude', 'estacao_latitude',

'estacao_altitude', 'estacao_datafundacao']]

return dfEstacao

```

O método `organizar_cabecalho` é chamado para organizar o DataFrame `df` de acordo com a tabela do banco de dados. O método recebe um objeto DataFrame `df` e cria um novo DataFrame `dfEstacao` com as colunas "cod_wmo", "estacao_nome", "estacao_regiao", "estacao_estado", "estacao_longitude", "estacao_latitude", "estacao_altitude" e "estacao_datafundacao". Em seguida, o DataFrame `dfEstacao` é retornado.

[Voltar ao topo](# voltar)

## conexaoBD.py

```python
import sqlalchemy
from sqlalchemy import create_engine
import logging
from pandas.core.frame import DataFrame
import sys

class ConexaoBD:

    __db = create_engine('postgresql://postgres:123@[localhost]/db_iacit_api')

    logging.basicConfig(filename="log.txt", level=logging.DEBUG,
                        format="%(asctime)s %(message)s", filemode="a")

```

O código começa importando as bibliotecas. Em seguida, é definida a classe `ConexaoBD`, que representa a conexão com o banco de dados PostgreSQL. A classe tem um atributo privado `__db`, que é uma instância da classe `create_engine`, que é responsável por criar uma conexão com o banco de dados.
A linha `logging.basicConfig` configura o log de eventos da aplicação, registrando execuções bem- sucedidas e também erros tratados.

```python
def __int__(self, db):
        self.__db = db

    def getDb(self):
        return self.__db

```

Esses métodos são responsáveis por criar um objeto de conexão com o banco de dados e disponibilizá- lo para as outras classes da aplicação. O método `__int__` é um método especial de inicialização da classe, que recebe o objeto de conexão como parâmetro e o armazena no atributo `__db`. Já o método getDb retorna o objeto de conexão armazenado em `__db`.

```python
def conectar_banco(self):

        conexaoBD = ConexaoBD()

        if conexaoBD.getDb().execute(
                "select * from pg_stat_activity WHERE state='active' and datname='db_iacit_api';").scalar() is not None:
            logging.debug("- BANCO CONECTADO COM SUCESSO")
        else:
            logging.debug("- ERRO NA CONEXÃO DO BANCO: verifique se o banco está conectado e tente novamente")
            sys.exit(0)

```

Esse método verifica se a conexão com o banco de dados foi estabelecida com sucesso. Ele cria uma instância da classe `ConexaoBD` e verifica se é possível executar uma consulta SQL no banco de dados. Se a consulta retornar um valor não nulo, significa que a conexão foi estabelecida com sucesso. Caso contrário, é registrado um erro no arquivo de log e o programa é interrompido com o método `sys.exit`.

````python
def povoar_banco(self, df: DataFrame, tabela: str):

try:

conexaoBD = ConexaoBD()

cod_wmo = df.loc[0][0]

# Povoamento das tabelas

sql = f"SELECT datahora_captacao FROM {tabela} WHERE cod_wmo='{cod_wmo}' ORDER BY " \

f"datahora_captacao DESC LIMIT 1"

try:

df = df[~(df['datahora_captacao']

## runFunctions.py

```python
from leituraDfs import LeituraDfs

from automacao import Automacao

class RunFunctions:

if __name__ == '__main__':

ldfs = LeituraDfs()
print("Iniciando script de download automático...\n")

Automacao.auto_run()
print("\nIniciando povoamento tabela estação...\n")

ldfs.leitura_cabecalho('2022')
print("\nIniciando povoamento das demais tabelas...\n")

ldfs.leitura_dfs('2022')

````

O arquivo `runFunctions.py` é o ponto de entrada do script principal, responsável por chamar as outras classes e funções necessárias para executar as tarefas de download, leitura e povoamento do banco de dados.

O script começa importando as classes `LeituraDfs` e `Automacao` dos módulos `leituraDfs` e `automacao`, respectivamente.

Em seguida, é verificado se o código está sendo executado como o script principal, ou seja, se o módulo é o arquivo sendo executado diretamente (e não sendo importado por outro módulo).

Se estiver sendo executado como o script principal, é criada uma instância da classe `LeituraDfs` com a variável `ldfs`.

Então, a função `auto_run()` da classe `Automacao` é chamada, iniciando o processo de download automático dos dados a partir da API. Essa função é implementada em outro módulo e não está presente neste arquivo.

Depois que o download é concluído, a função `leitura_cabecalho()` da instância `ldfs` é chamada para povoar a tabela de informações de cabeçalho do CSV no banco de dados para o ano de 2022. Em seguida, a função `leitura_dfs()` também da instância `ldfs` é chamada para povoar as tabelas de dados para o ano de 2022.

Cada etapa do processo é impressa na tela para que o usuário saiba em que parte do script o processo se encontra.

[Voltar ao topo](# voltar)
