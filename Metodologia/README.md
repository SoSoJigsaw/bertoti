
# Portfólio - Felipe Sobral

<div align="center">
<a href="#" target="_blank"><img style="margin: 10px" src="https://github.com/SoSoJigsaw/bertoti/blob/main/Metodologia/Imagens/profile.jpeg" height="500" /></a>
</div>

## Introdução

Estudante no 4º semestre em tecnologia de Banco de Dados pela FATEC de São José dos Campos (Prof. Jessen Vidal). Tenho prazer em codar, estimo desafios que promovam novos conhecimentos técnicos e habilidades interpessoais.

Ao longo da minha carreira acadêmica, tive experiência na resolução de problemas reais semestralmente por meio de uma metodologia de aprendizado própria da FATEC (a API), que utiliza metodologias ágeis (SCRUM), com validação externa por empresas parceiras, através das tecnologias Python, Java e SQL (Oracle, SQL Server e PostgreSQL). 


[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/SoSoJigsaw)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/sosojigsaw/)


## Meus Principais Conhecimentos

### Python
<div align="center">
<a href="#" target="_blank"><img style="margin: 10px" src="https://profilinator.rishav.dev/skills-assets/python-original.svg" height="100" /></a>
</div>
Desenvolvo em Python desde 2021. Já utilizei a linguagem nos paradigmas procedural e orientado ao objeto. Utilizei o Python tanto para desenvolvimento web, utilizando para isso o microserviço Flask, quanto para análise e tratamento de dados, utilizando o Pandas e Numpy. Em alguns momentos, utilizei o Python também para automatizar processos, como alimentar o banco de dados com uma rotina usando SQLAlchemy para a conexão, e automatizar o processo de baixar uma base de dados disponibilizado em um site através de um script que usa Selenium para simular as ações em um navegador.

### Java
<div align="center"> 
<a href="#" target="_blank"><img style="margin: 10px" src="https://profilinator.rishav.dev/skills-assets/java-original-wordmark.svg" height="100" /></a> 
</div>

Desenvolvo em Java desde 2022. Utilizei a linguagem principalmente para desenvolver o back-end de aplicações web, utilizando para isso o framework Spring Boot com o auxílio do Hibernate, e aplicações desktop, utilizando para isso o JavaFX.

### PL/SQL
<div align="center"> 
<a href="https://www.mysql.com/" target="_blank"><img style="margin: 10px" src="https://profilinator.rishav.dev/skills-assets/mysql-original-wordmark.svg" alt="MySQL" height="50" /></a>  
<a href="https://www.postgresql.org/" target="_blank"><img style="margin: 10px" src="https://profilinator.rishav.dev/skills-assets/postgresql-original-wordmark.svg" alt="PostgreSQL" height="50" /></a>  
<a href="https://www.oracle.com/in/index.html" target="_blank"><img style="margin: 10px" src="https://profilinator.rishav.dev/skills-assets/oracle-original.svg" alt="Oracle" height="50" /></a>
</div>

Utilizo o PL/SQL desde 2022, já tendo contato com comandos DDL, DCL e DML da linguagem. Relacionado a isso, eu já arquitetei a modelagem do banco de dados nos modelos Conceitual, Lógico e Físico. Em se tratando de SGBDs, tive experiência com os bancos Oracle, SQL Server e PostgreSQL, criando tabelas, fazendo o insert de novos dados, criando constraints e regras gerais do banco, e administrando o banco de uma forma geral.

### SCRUM
<div align="center">
<a href="#" target="_blank"><img style="margin: 10px" src="https://www.kindpng.com/picc/m/53-539760_scrum-logo-hd-png-download.png" height="100" /></a>
</div>
Tenho contato com o SCRUM desde o primeiro semestre da faculdade, em 2021, sendo que desde então todos os projetos acadêmicos em que participei utilizaram essa metodologia ágil para o gerenciamento da equipe como requisito. Tive experiência como Scrum Master da equipe, onde assumi o posto de líder responsável por organizar a equipe e buscar soluções para as dificuldades apresentadas. Fui também Product Owner (PO) em duas oportunidades, sendo responsável pelo desenvolvimento do produto ao criar o backlog, e pelo diálogo com o cliente em busca de atender as suas necessidades.

# Projeto Acadêmico (API) – 2º Semestre de 2022

## Parceiro Acadêmico: IACIT
<div align="center">
 <a href="#" target="_blank"><img style="margin: 10px" src="https://forcaaerea.com.br/wp-content/uploads/2023/03/IACIT_LOGO.png" height="100" /></a>
</div>
Projeto feito com a parceria da IACIT, uma empresa de São José dos Campos que presta consultoria meteorológica, sendo que um de seus serviços atuais é fornecer aos clientes relatórios customizados de dados meteorológicos.

## Visão do projeto
<div align="center">
<a href="#" target="_blank"><img style="margin: 10px" src="https://github.com/fluffyfatec/Iacit/blob/Sprint-2/GIT/VID-20221009-WA0013%20(2).gif" height="500" /></a>
</div>

Como a empresa trabalhava processando muitas informações manualmente, ela acabava por perder tempo, desperdiçando recursos com esse processo. Por isso, a empresa precisava da criação de um sistema que permitisse realizar a importação dos dados meteorológicos, bem como armazená-los em uma base de dados, para posteriormente gerar os relatórios desejados por seus clientes.
Dessa forma, o projeto visava desenvolver uma aplicação web para a empresa que possibilite a automatização desde o download, o processamento dos dados e a persistência dos dados no banco de dados de forma simplificada. Além disso, a aplicação aspirava possibilitar realizar a filtragem desses dados por temperatura, umidade, estações, vento, pressão atmosférica, radiação global e precipitação, além de possibilitar diversas visualizações desses dados. Por fim, a aplicação objetivava a criação de diferentes níveis de usuários juntamente com o painel administrativo, possibilitando a exportação dos relatórios a partir dos dados.
 
## Tecnologias adotadas na solução

### HTML5 / CSS3 / Javascript (EC6)
<div align="center">
 <a href="#" target="_blank"><img style="margin: 10px" src="https://www.pngfind.com/pngs/m/683-6834215_html-css-js-icon-hd-png-download.png" height="100" /></a>
</div>
O front-end da aplicação foi desenvolvida em HTML para marcação de hipertexto, CSS3 para estilização da página, e Javascript (EC6) para utilização do AJAX, permitindo assim enviar e receber dados assincronamente do servidor web e evitar o recarregamento da página inteira sem a necessidade de uma nova solicitação, também para criar paginação personalizada, utilizar jsPDF para a geração de PDFs dos gráficos, e enviar variáveis ao servidor por requisições GET através da url da página.

### Spring Boot
<div align="center">
 <a href="#" target="_blank"><img style="margin: 10px" src="https://profilinator.rishav.dev/skills-assets/springio-icon.svg" height="100" /></a>
</div>
O back-end da aplicação web foi realizada através do Spring Boot, onde foi definida toda a estrutura do projeto do lado servidor, criando para isso os packages controller, dto, modal, report, repository e service. Os controllers foram criados para gerenciar os endpoints e definir suas lógicas, o dto e o modal foram criados para mapear as entidades do banco de dados na aplicação, o report foi para definir classes que contém a lógica de criação dos PDFs que posteriormente seriam acessados em determinados endpoints dos controllers, o repository foi usado para criar interfaces que estendem o JpaRepository para declarar querys que serão utilizadas na lógica dos controllers, e o service foi usado para conter classes que encapsulam a lógica de negócios da aplicação e para expor serviços que podem ser acessados pelos controllers, como as ações de deletar e atualizar usuário ou a validação do login por um usuário.

### Python
<div align="center">
<a href="https://pandas.pydata.org/" target="_blank"><img style="margin: 10px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Pandas_logo.svg/2560px-Pandas_logo.svg.png" alt="Git" height="50" /></a> 
<a href="https://www.sqlalchemy.org/" target="_blank"><img style="margin: 10px" src="https://quintagroup.com/cms/python/images/sqlalchemy-logo.png/@@images/eca35254-a2db-47a8-850b-2678f7f8bc09.png" alt="Spring" height="25" /></a>  
</div>
O Python foi utilizado para analisar e tratar os dados meteorológicos que seriam utilizados na aplicação, e também para a criação de script de automação do povoamento do banco de dados por esses mesmos dados. Os dados precisaram primeiro serem tratados pelo Pandas para posteriormente serem analisados pela mesma biblioteca, e a criação do script de automação do povoamento foi realizado com o uso da biblioteca SQLAlchemy, que permitiu a utilização de comandos SQL dentro do Python, automatizando o processo de inserts à medida que os dados eram tratados. Foi utilizado o paradigma da orientação ao objeto nesse script, o que reduziu a reutilização de código e permitiu o processamento progressivo de toda a lógica do script ao permitir o acesso de uma classe às demais classes. 

### PostgreSQL
<div align="center">
 <a href="#" target="_blank"><img style="margin: 10px" src="https://profilinator.rishav.dev/skills-assets/postgresql-original-wordmark.svg" height="100" /></a>
</div>
O PostgreSQL foi o SGBD escolhido para a criação do banco de dados exigido no projeto. Através dele, foi feita toda a modelagem e administração do banco, que foi responsável por armazenar todos os dados meteorológicos que foram utilizados para o dashboard da aplicação e para o CRUD de usuários. Além da criação das tabelas e constraints, e inserts realizados, a aplicação necessitou do uso de views que limitavam o acesso aos dados pelo usuário final, triggers para permitir a criação de uma tabela de auditoria que faz um controle de todas as modificações realizadas por um usuário nas tabelas de interesse, e a criação de índices para as tabelas para melhorar o desempenho de consultas, redução de tempo de resposta, otimização da utilização de memória e, por fim, trazer melhorias em operações de junção, que foram muito utilizadas no projeto.

## Contribuições Individuais
Em grande parte do projeto eu trabalhei no back-end da aplicação, e em alguns momentos ajudei também no front-end. 
No back-end, fui responsável por criar um script no Python que recebia os dados meteorológicos de uma base de dados disponibilizado em um servidor web através de um request, toda vez que o script era executado ele fazia o request e verificava se havia novos dados para serem baixados. Se houvesse novos dados, ele os baixava para um diretório reservado do projeto. Depois, o script acessava em loop todos os dados baixados no diretório e fazia o tratamento deles utilizando Pandas, mudando seus tipos e formatação de forma que depois de tratados estivessem em um formato adequado à lógica das tabelas do banco de dados criado. Assim que terminava o tratamento desses dados, os dataframes eram enviados à outro método que por loop fazia a rotina de enviar esses dados ao banco de dados, fazendo inserts nas tabelas devidas, usando para isso o SQLAlchemy para criar a conexão com o banco e utilizar comandos de SQL puro dentro do Python. Essa rotina incluía tratamento de erros, evitando a duplicação de dados no banco, redundância, e quebra de constraints de chave primária. O script foi otimizado, permitindo que a tentativa de envio de dados ao banco, ou seja, a execução do comando SQL, só acontecesse caso o dataframe trouxesse novos dados, e assim o script terminava a sua execução em questão de minutos, mesmo tendo que lidar com arquivos CSVs que continham mais de quinze mil linhas cada um. Como cada CSV correspondia a uma estação meterológica, e os dados trabalhados deveriam ser de 2020 a 2022, a quantidade de arquivos chegava a novecentos, cada um com quinze mil linhas. Por fim, o script necessitava ser executado periodicamente a pedido do cliente, assim como o cliente não tinha interesse por executar ele próprio o script, portanto eu criei uma rotina que executava automaticamente o script uma vez por semana, utilizando para isso o Windows Task Scheduler, que executava um arquivo Shell Script contendo o script python.
Ainda no back-end, fui responsável por gerar os relatórios em PDF dos dados meteorológicos, que deveriam serem baixados dentro de um endpoint da aplicação Spring Boot. Para isso, utilizei a biblioteca iText do Java, e criei códigos no diretório “report” estilizando os relatórios e criando a lógica de recebimento dos dados que seriam printados no documento, que vinham de uma List do Modal de cada variável meteorológica. Por terem lógicas diferentes, foi criado um código para cada variável meteorológica. Depois, criei endpoints no controller de cada variável meteorológica onde recebia os parâmetros através da url dos dados requeridos no relatório, e então colocava esses parâmetros dentro da query do repository, criando uma variável com isso, e chamava o método criado no código do report, colocando como parâmetro a variável criada. Por fim, o método criava o PDF, que então no endpoint eu retornava o PDF. Ao acessar esse endpoint na aplicação, o download do PDF era realizado automaticamente.
No front-end, eu ajudei em partes na estilização das páginas. No entanto, fui responsável por criar o método que gerava o PDF dos gráficos. Para isso, eu usei uma biblioteca do JavaScript chamada jsPDF, que estilizou o PDF e incluiu o gráfico nele, gráfico esse que foi convertido de elemento canvas HTML em um arquivo de imagem PNG. 

### 1.Script de automação do povoamento do banco

#### automação.py

```python
import os
import requests
from datetime import date
import zipfile
import shutil
import logging
```
O módulo "os" foi usado para realizar operações no sistema operacional, como criação de diretórios e acesso a arquivos. O módulo "requests" foi utilizado para fazer solicitações HTTP, para puxar os dados meteorológicos de uma base de dados em um servidor web. "datetime" foi usado para lidar com datas, pois que no método que fazia o download dos dados passava-se a data como parâmetro para baixar os dados de um determinado ano. "zipfile" e "shutil" foram usados para extrair arquivos zip e manipular os arquivos e diretórios. Por fim, "logging" foi usado para criar um arquivo de log para registro de eventos, seja execuções bem-sucedidas ou quando um erro foi lançado. 

```python
class Automacao:
    
    logging.basicConfig(filename="log.txt", level=logging.DEBUG,
                        format="%(asctime)s %(message)s", filemode="a")
```
Essa parte do código define a classe "Automacao". O método "logging.basicConfig" é chamado para configurar o arquivo de log para registro de eventos a partir da execução do código, incluindo execuções bem-sucedidas e erros tratados. Especificamente, o arquivo "log.txt" é criado com o nível de registro "DEBUG". O formato do registro é definido para incluir a data e hora em que o registro foi feito e a mensagem registrada.

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
O método download_df é responsável por fazer o download do arquivo zip correspondente aos dados meteorológicos históricos do ano especificado pelo parâmetro "ano". A variável "url" é criada para especificar a URL do arquivo zip no site do INMET. A variável "endereco" é criada para especificar o caminho completo onde o arquivo zip será salvo.
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
O método extract é responsável por extrair o arquivo zip baixado anteriormente para o diretório especificado. Ele usa o módulo "zipfile" para abrir o arquivo zip.

#### leituraDfs.py

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
Nesse trecho do código, é importado as bibliotecas que serão utilizadas e criado a classe LeituraDfs. É também configurado o logging, que irá registrar informações sobre o que está acontecendo no programa. 

```python
def leitura_dfs(self, ano: str):

        cbd = ConexaoBD()

        cbd.conectar_banco()

        try:

            # Path dos dataframes
            files = glob.glob(fr"C:\Users\**\Iacit\CSVs\DF\{ano}\*.csv", recursive=True)

            i = 1
            for f in files:
                df = pd.read_csv(f, sep=';', encoding='latin-1', on_bad_lines='skip')
                df1 = pd.read_csv(f, sep=';', encoding='latin-1', skiprows=[0, 1, 2, 3, 4, 5, 6, 7], on_bad_lines='skip')
```
Neste trecho do código, é definido a função leitura_dfs que recebe o ano como parâmetro. É criada uma instância da classe ConexaoBD. Depois, é chamado o método conectar_banco para realizar a conexão com o banco de dados. Em seguida, é definido o caminho dos arquivos CSV utilizando o método glob.glob. Iteramos sobre cada arquivo CSV no diretório, e lemos os dados utilizando a biblioteca pandas: o parâmetro sep define o separador utilizado no arquivo CSV, o parâmetro encoding define a codificação utilizada no arquivo CSV, e o parâmetro on_bad_lines define a ação a ser tomada caso ocorra algum erro na leitura do arquivo. No segundo pd.read_csv, foi definido que as primeiras 8 linhas serão puladas, pois que nelas não contêm dados relevantes.

```python
# Criando colunas do cabeçalho vertical
                df['CODIGO (WMO)'] = df.loc[2][1]

                # Dando merge nos dataframes
                df = df1.assign(key=1).merge(df[['CODIGO (WMO)']].assign(key=1), on='key').drop('key', axis=1)
                del df1
```
Neste trecho de código, foi criada uma coluna com o código da estação meteorológica utilizando a função loc, e foi atribuído o valor a coluna a partir da segunda linha da primeira coluna (B1) do arquivo CSV. Em seguida, foi dado um merge nos dataframes df e df1, utilizando a coluna criada anteriormente. Por fim, foi excluído a variável df1 para liberar memória.

```python
# Tratamento dos dados e povoamento do banco de dados
                cleaningData = CleaningData()

                df = cleaningData.tratamento_dfs(df)

                cbd.povoar_banco(df.getRad(), 'radiacao_global')
                cbd.povoar_banco(df.getPrecip(), 'precipitacao')
```                
O trecho cleaningData = CleaningData() cria uma instância da classe CleaningData para tratar os dados antes de serem povoados no banco de dados. 
O método tratamento_dfs(df) recebe um DataFrame como entrada e retorna o DataFrame tratado. Esse tratamento envolve a remoção de linhas e colunas desnecessárias, a conversão de tipos de dados, a limpeza de valores faltantes e a renomeação de colunas.
Os DataFrames tratados são povoados no banco de dados por meio dos métodos povoar_banco(df.getRad(), 'radiacao_global'), povoar_banco(df.getPrecip(), 'precipitacao'), povoar_banco(df.getVento(), 'vento'), povoar_banco(df.getAtm(), 'pressao_atmosferica'), povoar_banco(df.getTemp(), 'temperatura') e povoar_banco(df.getUmi(), 'umidade'), que recebem o DataFrame tratado e o nome da tabela no banco de dados que será populada.

#### cleaningData.py
O cleaningData.py é um módulo que contém uma classe CleaningData que possui métodos para tratamento de dados em um DataFrame.

```python
import pandas as pd
import logging
from pandas.core.frame import DataFrame
```
O código começa importando as bibliotecas pandas, logging e DataFrame. A biblioteca pandas é utilizada para manipulação de dados em um DataFrame. Já a biblioteca logging é utilizada para exibir mensagens de depuração. Por fim, o DataFrame é importado para ser utilizado como type de algumas variáveis do código.

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
A seguir é definida a classe CleaningData, que possui um construtor com seis argumentos, que são atributos privados da classe.
Os métodos getRad(), getPrecip(), getVento(), getAtm(), getTemp() e getUmi() são utilizados para retornar os valores dos atributos privados da classe.

```python
def tratamento_dfs(self, df: DataFrame):

try:

pd.options.mode.chained_assignment = None

# Apagando as linhas duplicadas

df = df.drop_duplicates(subset=['Data', 'Hora UTC'], keep='first')

for col in df.columns:

mask = (df[col] == ',9')

df.loc[mask, col] = '0,9'

mask = (df[col] == ',8')

df.loc[mask, col] = '0,8'

mask = (df[col] == ',7')

df.loc[mask, col] = '0,7'

mask = (df[col] == ',6')

df.loc[mask, col] = '0,6'

mask = (df[col] == ',5')

df.loc[mask, col] = '0,5'

mask = (df[col] == ',4')

df.loc[mask, col] = '0,4'

mask = (df[col] == ',3')

df.loc[mask, col] = '0,3'

mask = (df[col] == ',2')

df.loc[mask, col] = '0,2'

mask = (df[col] == ',1')

df.loc[mask, col] = '0,1'

mask = (df[col] == ',0')

df.loc[mask, col] = '0'

# Ajustando Data ao padrão Br

df['Data'] = pd.to_datetime(df['Data'], errors='coerce')

df['Data'] = df['Data'].dt.strftime("%d/%m/%Y")

# Juntando a Data à Hora

df["DATAHORA DE CAPTAÇÃO"] = df["Data"] + ' ' + df["Hora UTC"]

df['DATAHORA DE CAPTAÇÃO'] = df['DATAHORA DE CAPTAÇÃO'].replace({'0000 UTC': '00', '0100 UTC': '01',

'0200 UTC': '02', '0300 UTC': '03',

'0400 UTC': '04', '0500 UTC': '05',

'0600 UTC': '06', '0700 UTC': '07',

'0800 UTC': '08', '0900 UTC': '09',

'1000 UTC': '10', '1100 UTC': '11',

'1200 UTC': '12', '1300 UTC': '13',

'1400 UTC': '14', '1500 UTC': '15',

'1600 UTC': '16', '1700 UTC': '17',

'1800 UTC': '18', '1900 UTC': '19',

'2000 UTC': '20', '2100 UTC': '21',

'2200 UTC': '22', '2300 UTC': '23',

}, regex=True)

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

df = df.rename({'CODIGO (WMO)': 'cod_wmo', 'RADIACAO GLOBAL (Kj/m²)': 'radiacao_global',

'DATAHORA DE CAPTAÇÃO': 'datahora_captacao',

'PRECIPITAÇÃO TOTAL, HORÁRIO (mm)': 'precipitacaototal',

'VENTO, VELOCIDADE HORARIA (m/s)': 'vento_velocidade',

'VENTO, RAJADA MAXIMA (m/s)': 'vento_rajada_max',

'VENTO, DIREÇÃO HORARIA (gr) (° (gr))': 'vento_direcao_horario',

'PRESSAO ATMOSFERICA AO NIVEL DA ESTACAO, HORARIA (mB)': 'pressao_atm_estacao',

'PRESSÃO ATMOSFERICA MIN. NA HORA ANT. (AUT) (mB)': 'pressao_atm_min',

'PRESSÃO ATMOSFERICA MAX.NA HORA ANT. (AUT) (mB)': 'pressao_atm_max',

'TEMPERATURA DO AR - BULBO SECO, HORARIA (°C)': 'temperatura_ar',

'TEMPERATURA MÍNIMA NA HORA ANT. (AUT) (°C)': 'temperatura_min',

'TEMPERATURA MÁXIMA NA HORA ANT. (AUT) (°C)': 'temperatura_max',

'TEMPERATURA DO PONTO DE ORVALHO (°C)': 'temperatura_ponto_orvalho',

'TEMPERATURA ORVALHO MIN. NA HORA ANT. (AUT) (°C)': 'temperatura_orvalho_min',

'TEMPERATURA ORVALHO MAX. NA HORA ANT. (AUT) (°C)': 'temperatura_orvalho_max',

'UMIDADE RELATIVA DO AR, HORARIA (%)': 'umidade_relativa_ar',

'UMIDADE REL. MIN. NA HORA ANT. (AUT) (%)': 'umidade_relativa_min',

'UMIDADE REL. MAX. NA HORA ANT. (AUT) (%)': 'umidade_relativa_max'}, axis=1)

# Desmembrando os dataframes por tabela do banco

cleaningData = CleaningData()

df = cleaningData.desmembrar_dfs(df)

return df

except:

logging.debug("- ERRO: tratamento dos CSVs não pode ser concluída (CSVs/cleaningData.py)")

raise


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
O método tratamento_dfs recebe um DataFrame como parâmetro e realiza diversas operações de limpeza nos dados.
O primeiro passo é desativar o modo "chained assignment" do pandas, que evita que o pandas emita um aviso quando uma operação de atribuição é realizada.
Em seguida, o método apaga as linhas duplicadas do DataFrame usando o método drop_duplicates(). É passado como parâmetro as colunas Data e Hora UTC e a opção keep='first', que mantém apenas a primeira linha duplicada e remove as outras.
O próximo passo é percorrer todas as colunas do DataFrame e substituir valores com vírgula por valores com ponto, utilizando o método replace() da biblioteca pandas. Isso foi feito para que o dataframe fosse formato conforme as regras de sintaxe do banco de dados, já que esses dados foram definidos no banco como tipo float, e o banco reconhece o tipo float utilizando ponto ao invés de vírgulas.
Depois é feito o ajuste da coluna Data para o padrão brasileiro. Isso é feito utilizando o método pd.to_datetime() para converter a coluna em formato de data. Em seguida, o método dt.strftime() é utilizado para formatar a data no padrão DD/MM/YYYY.
Em seguida, a coluna Data é juntada com a coluna Hora UTC utilizando o operador de soma + e o resultado é armazenado na coluna DATAHORA DE CAPTAÇÃO. Em seguida, o método replace() é utilizado para substituir os valores 0000 UTC, 0100 UTC, ..., 2300 UTC pelos valores 00, 01, ..., 23, respectivamente. Isso foi feito novamente para se adequar ao banco de dados, já que a coluna de data do banco de dados era do tipo datetime, então o formato UTC não era viável para o povoamento do banco.
Depois, as colunas Data e Hora UTC são removidas do DataFrame utilizando o método drop().
Em seguida, o método remove as vírgulas em sequência errôneas, utilizando o método replace() e a expressão regular ',,,,,,,,,,,,,' e ',,,,,,,,,,,,',. Em alguns arquivos CSVs, alguns dados vinham com uma sequência de vírgulas, e isso teve que ser retirado para tratar o dado e mandar ao banco de dados os dados na formatação correta.
Então, o método redefine os valores NaN (Not a Number) do DataFrame como None utilizando o método astype() em conjunto com a função pd.notnull(). Isso foi realizado porque o PostgreSQL define valores nulos como None e, caso a mudança não fosse feita, os inserts não seriam nulos, e ficariam registrados como NaN, o que tiraria a integridade dos dados.
Em seguida, a coluna DATAHORA DE CAPTAÇÃO é convertida para o tipo datetime utilizando o método pd.to_datetime().
Por fim, o método renomeia as colunas do DataFrame utilizando o método rename(). Isso foi realizado pra facilitar o processo de envio dos dataframes ao banco de dados, pois deixando o nome das colunas da mesma forma que é o nome das colunas no banco de dados, ao executar o comando de envio o método reconhece automaticamente a qual coluna o dado deve ser inserido.

#### cabeçalho.py

```python
import pandas as pd
import logging
from pandas.core.frame import DataFrame
```
O trecho de código começa com as importações necessárias para o funcionamento do código: "import pandas as pd" é usado para a manipulação de dados em formato de tabela, "import logging" é utilizado para registro de eventos em um arquivo de log, e "from pandas.core.frame import DataFrame" é usado para especificar o tipo DataFrame, que é um tipo de objeto que permite a manipulação de dados em formato de tabela.

```python
class Cabecalho:

logging.basicConfig(filename="log.txt", level=logging.DEBUG,

format="%(asctime)s %(message)s", filemode="a")

def __int__(self, estacao):

self.__estacao = estacao

def getEstacao(self):

return self.__estacao
```
Nesse trecho de código, é definida a classe "Cabecalho", que possui um método construtor "__init__" que recebe um parâmetro "estacao" e o armazena em um atributo privado "__estacao". Em seguida, é definido um método "getEstacao" que retorna o valor do atributo privado "__estacao".

```python
def tratamento_cabecalho(self, df: DataFrame):

try:

pd.options.mode.chained_assignment = None

df['REGIAO'] = df.loc[0][1]

df['UF'] = df.loc[1][1]

df['ESTACAO'] = df.loc[2][1]

df['CODIGO (WMO)'] = df.loc[3][1]

df['LATITUDE'] = df.loc[4][1]

df['LONGITUDE'] = df.loc[5][1]

df['ALTITUDE'] = df.loc[6][1]

df['DATA DE FUNDACAO'] = df.loc[7][1]

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

df = df.rename({'CODIGO (WMO)': 'cod_wmo', 'ESTACAO': 'estacao_nome',

'REGIAO': 'estacao_regiao', 'UF': 'estacao_estado',

'LONGITUDE': 'estacao_longitude',

'LATITUDE': 'estacao_latitude', 'ALTITUDE': 'estacao_altitude',

'DATA DE FUNDACAO': 'estacao_datafundacao'}, axis=1)

# Organizando o dataframe conforme a tabela do banco

cabecalho = Cabecalho()

df = cabecalho.organizar_cabecalho(df)

return df

except:

logging.debug("- ERRO: tratamento do cabeçalho não pode ser concluída (CSVs/cabeçalho.py)")

raise
```
O método "tratamento_cabecalho" recebe um objeto DataFrame "df" e realiza uma série de transformações nele. Primeiro, é definido que as mensagens de registro de eventos serão armazenadas em um arquivo de log chamado "log.txt". Em seguida, é criada uma nova coluna no DataFrame "df" para cada um dos seguintes campos: REGIAO, UF, ESTACAO, CODIGO (WMO), LATITUDE, LONGITUDE, ALTITUDE e DATA DE FUNDACAO. Os valores dessas colunas são extraídos do DataFrame "df" de acordo com as posições de linha e coluna especificadas. Em seguida, as linhas duplicadas do DataFrame "df" são removidas e as vírgulas extras são substituídas por pontos. Além disso, a coluna "DATA DE FUNDACAO" é convertida para o tipo datetime. 

```python
def organizar_cabecalho(self, df: DataFrame):

# Criando objeto e determinando atributos da instância

dfEstacao = Cabecalho()

dfEstacao.__estacao = df[['cod_wmo', 'estacao_nome', 'estacao_regiao', 'estacao_estado',

'estacao_longitude', 'estacao_latitude',

'estacao_altitude', 'estacao_datafundacao']]

return dfEstacao
```
O método "organizar_cabecalho" é chamado para organizar o DataFrame "df" de acordo com a tabela do banco de dados. O método recebe um objeto DataFrame "df" e cria um novo DataFrame "dfEstacao" com as colunas "cod_wmo", "estacao_nome", "estacao_regiao", "estacao_estado", "estacao_longitude", "estacao_latitude", "estacao_altitude" e "estacao_datafundacao". Em seguida, o DataFrame "dfEstacao" é retornado.

#### conexaoBD.py

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
O código começa importando as bibliotecas. Em seguida, é definida a classe ConexaoBD, que representa a conexão com o banco de dados PostgreSQL. A classe tem um atributo privado __db, que é uma instância da classe create_engine, que é responsável por criar uma conexão com o banco de dados.
A linha logging.basicConfig configura o log de eventos da aplicação, registrando execuções bem-sucedidas e também erros tratados.

```python
def __int__(self, db):
        self.__db = db

    def getDb(self):
        return self.__db
```
Esses métodos são responsáveis por criar um objeto de conexão com o banco de dados e disponibilizá-lo para as outras classes da aplicação. O método __int__ é um método especial de inicialização da classe, que recebe o objeto de conexão como parâmetro e o armazena no atributo __db. Já o método getDb retorna o objeto de conexão armazenado em __db.

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
Esse método verifica se a conexão com o banco de dados foi estabelecida com sucesso. Ele cria uma instância da classe ConexaoBD e verifica se é possível executar uma consulta SQL no banco de dados. Se a consulta retornar um valor não nulo, significa que a conexão foi estabelecida com sucesso. Caso contrário, é registrado um erro no arquivo de log e o programa é interrompido com o método sys.exit.

```python
def povoar_banco(self, df: DataFrame, tabela: str):

try:

conexaoBD = ConexaoBD()

cod_wmo = df.loc[0][0]

# Povoamento das tabelas

sql = f"SELECT datahora_captacao FROM {tabela} WHERE cod_wmo='{cod_wmo}' ORDER BY " \

f"datahora_captacao DESC LIMIT 1"

try:

df = df[~(df['datahora_captacao'] <= conexaoBD.getDb().execute(sql).scalar())]

except TypeError:

pass

if not df.empty:

df.to_sql(tabela, conexaoBD.getDb(), if_exists='append', index=False)

print(f"Há atualizações nos dados da Estação {cod_wmo} em {tabela}")

else:

print(f"Não há atualizações nos dados da Estação {cod_wmo} em {tabela}")

except:

logging.debug("- ERRO: falha na tentativa de povoar o banco com os dados dos CSVs (CSVs/conexaoBD.py)")

raise
```
O método povoar_banco é responsável por povoar a tabela de dados meteorológicos no banco de dados PostgreSQL com os dados contidos em um DataFrame pandas. Essa função recebe como parâmetros o DataFrame df que contém os dados a serem inseridos no banco de dados, e a string tabela que especifica o nome da tabela de destino no banco de dados.
A função começa criando uma instância da classe ConexaoBD, que estabelece a conexão com o banco de dados. Em seguida, ela extrai o código WMO da primeira linha do DataFrame df e usa esse código para construir uma consulta SQL que recupera o registro mais recente da tabela especificada no banco de dados.
Se a tabela não estiver vazia, a função compara a data/hora de captura dos dados do DataFrame com a data/hora do registro mais recente na tabela do banco de dados. Qualquer linha do DataFrame com uma data/hora de captura maior que a data/hora do registro mais recente na tabela é considerada uma nova atualização de dados e é inserida na tabela do banco de dados usando o método to_sql do pandas.
Se não houver dados novos no DataFrame, a função imprime uma mensagem informando que não há atualizações para essa estação na tabela especificada.
Caso ocorra uma exceção em qualquer ponto da execução da função, a exceção é capturada e uma mensagem de erro é registrada no log, informando que houve uma falha na tentativa de povoar o banco de dados com os dados do DataFrame. A exceção é então relançada para ser tratada por chamadores da função.

```python
def estacao_banco(self, df: DataFrame):

try:

conexaoBD = ConexaoBD()

try:

df.to_sql('estacao', conexaoBD.getDb(), if_exists='append', index=False)

except sqlalchemy.exc.IntegrityError:

print('Erro de integridade, esse código_wmo já existe no banco')

pass

except:

logging.debug("- ERRO: falha na tentativa de atualizar as estações cadastradas no banco (CSVs/conexaoBD.py)")

raise
```
O método estacao_banco é responsável por atualizar a tabela estacao do banco de dados com informações de estações meteorológicas presentes no DataFrame df.
Primeiro, ele cria uma instância da classe ConexaoBD para estabelecer a conexão com o banco de dados.
Em seguida, o método tenta inserir os dados da estação presentes em df na tabela estacao do banco de dados usando o método to_sql do Pandas. O parâmetro if_exists é definido como append, o que significa que os dados serão adicionados à tabela existente ao invés de substituí-la.
Se houver uma violação de integridade na inserção dos dados na tabela (por exemplo, se já houver uma estação com o mesmo codigo_wmo na tabela), o método to_sql lançará uma exceção do tipo IntegrityError. Nesse caso, o método imprime uma mensagem de erro e passa para a próxima estação, sem interromper a execução do programa.
Por fim, se ocorrer algum erro durante a execução do método, ele registra uma mensagem de erro no arquivo de log e relança a exceção para ser tratada em outro lugar do programa.

#### runFunctions.py

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
```
O arquivo runFunctions.py é o ponto de entrada do script principal, responsável por chamar as outras classes e funções necessárias para executar as tarefas de download, leitura e povoamento do banco de dados.
O script começa importando as classes LeituraDfs e Automacao dos módulos leituraDfs e automacao, respectivamente.
Em seguida, é verificado se o código está sendo executado como o script principal, ou seja, se o módulo é o arquivo sendo executado diretamente (e não sendo importado por outro módulo).
Se estiver sendo executado como o script principal, é criada uma instância da classe LeituraDfs com a variável ldfs.
Então, a função auto_run() da classe Automacao é chamada, iniciando o processo de download automático dos dados a partir da API. Essa função é implementada em outro módulo e não está presente neste arquivo.
Depois que o download é concluído, a função leitura_cabecalho() da instância ldfs é chamada para povoar a tabela de informações de cabeçalho do CSV no banco de dados para o ano de 2022. Em seguida, a função leitura_dfs() também da instância ldfs é chamada para povoar as tabelas de dados para o ano de 2022.
Cada etapa do processo é impressa na tela para que o usuário saiba em que parte do script o processo se encontra.

### 2.Criação de Relatórios PDF
Foi um arquivo criado para cada variável meteorológica, mas todos seguiram a mesma lógica. Por isso, utilizarei apenas o de Precipitação para ilustrar o que foi feito.

#### PdfPrecipitacao.java

```java
public class PdfPrecipitacao {

public static ByteArrayInputStream exportarPdfPrecipitacao (List<ViewPrecipitacaoModal> viewPrecipitacaoModals) throws IOException {

//Criando o documento PDF

Document document = new Document(PageSize.A4.rotate(), 25, 25, 25, 25);

ByteArrayOutputStream out = new ByteArrayOutputStream();

try {

    //Criando a tabela para o relatório

    PdfPTable table = new PdfPTable(2);

    table.setWidthPercentage(100);

    table.setWidths(new int[] { 4, 4});

    //Criando o cabeçalho da tabela

    Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.WHITE);

    PdfPCell hcell;

    hcell = new PdfPCell(new Phrase("Data/Hora", headFont));
    table.addCell(hcell);

    hcell = new PdfPCell(new Phrase("Precipitação Total (%)", headFont));
    table.addCell(hcell);
```
O código em questão é responsável pela geração de um relatório em formato PDF. O método exportarPdfPrecipitacao recebe como parâmetro uma lista de objetos do tipo ViewPrecipitacaoModal, que representam os dados a serem exibidos no relatório.
Na implementação, é criado um novo documento PDF. Em seguida, é criada uma tabela para o relatório, com duas colunas para exibir as informações de data/hora e precipitação total, respectivamente. O cabeçalho da tabela é definido com os nomes das colunas.

```java
for (ViewPrecipitacaoModal viewPrecipitacaoModal : viewPrecipitacaoModals) {

//Povoando as células da tabela

Font font = FontFactory.getFont(FontFactory.HELVETICA, 14, BaseColor.BLACK);

Font fontDataHora = FontFactory.getFont(FontFactory.HELVETICA, 14, BaseColor.BLACK);

PdfPCell cell;

cell = new PdfPCell(new Phrase(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(viewPrecipitacaoModal.getDatahoraCaptacao()), fontDataHora));
table.addCell(cell);

cell = new PdfPCell(new Phrase(viewPrecipitacaoModal.getPrecipitacaototal(), font));
table.addCell(cell);

}
```
Então, para cada objeto ViewPrecipitacaoModal na lista fornecida, são criadas linhas na tabela com as informações de data/hora e precipitação total correspondentes. Isso foi realizado utilizando um loop. A tabela é estilizada alternando a cor de fundo e da borda das células, definindo uma cor para o cabeçalho e permitindo que ele se repita em todas as páginas do documento gerado.

```java
//Abrindo o documento PDF para ser editado

PdfWriter.getInstance(document, out);

document.open();

//Adicionando imagem

Image img = Image.getInstance("https://raw.githubusercontent.com/fluffyfatec/Iacit/Sprint-4/API-IACIT/api/images/iacit.png");

img.setAbsolutePosition(635f, PageSize.A4.getHeight() - img.getScaledHeight() - 90);

img.scaleAbsolute(175f, 115f);

//Definindo parágrafos para o título do documento PDF

Paragraph textoEstacao = new Paragraph(new Phrase("Estação " + viewPrecipitacaoModals.get(0).getEstacaoNome()

+ ", " + "Estado de " + viewPrecipitacaoModals.get(0).getEstacaoEstado(), FontFactory.getFont(

FontFactory.HELVETICA_BOLD, 24, BaseColor.BLACK)));

textoEstacao.setAlignment(Element.ALIGN_LEFT);

Paragraph textoDataHora = new Paragraph(new Phrase("Dados de " + new SimpleDateFormat("dd/MM/yyyy HH:mm")

.format(viewPrecipitacaoModals.get(0).getDatahoraCaptacao()) + " até " +

new SimpleDateFormat("dd/MM/yyyy HH:mm").format(viewPrecipitacaoModals

.get(viewPrecipitacaoModals.size() - 1).getDatahoraCaptacao()),

FontFactory.getFont(FontFactory.HELVETICA, 21, BaseColor.BLACK)));

textoDataHora.setAlignment(Element.ALIGN_LEFT);

Paragraph textoDados = new Paragraph(new Phrase("Precipitação", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLACK)));

textoDados.setAlignment(Element.ALIGN_CENTER);

Paragraph pulaLinha = new Paragraph(new Phrase(" ", FontFactory.getFont(FontFactory.HELVETICA, 18, BaseColor.BLACK)));

//Adicionando os parágrafos, imagem e tabela ao documento PDF

document.add(img);

document.add(textoEstacao);

document.add(textoDataHora);

document.add(pulaLinha);

document.add(textoDados);

document.add(pulaLinha);

document.add(table);


document.close();

} catch (DocumentException ex) {

}

return new ByteArrayInputStream(out.toByteArray());

}

}
```
O documento PDF é aberto e são adicionados ao mesmo uma imagem, parágrafos com informações da estação meteorológica, período de dados coletados e o título do relatório, que é "Precipitação". O documento é fechado e retornado como um objeto ByteArrayInputStream para que possa ser manipulado posteriormente.

### 3.Método para enviar o relatório à aplicação

```java
@GetMapping(value = "/Precipitacao/pdf/{estNome}/{estEstado}/{estDTinicial}/{estDTfinal}", produces = MediaType.APPLICATION_PDF_VALUE)

public ResponseEntity<InputStreamResource> relatorioPrecipitacao (HttpServletResponse response,

@PathVariable("estNome") String estNome,

@PathVariable("estEstado") String estEstado,

@PathVariable("estDTinicial") String estDTinicial,

@PathVariable("estDTfinal") String estDTfinal) throws IOException {


    estNome = estNome.replace('*', ' ');

    estEstado = estEstado.replace('*', ' ');

    estDTinicial = estDTinicial.replace('*', ' ');

    estDTfinal = estDTfinal.replace('*', ' ');


    List<ViewPrecipitacaoModal> precipitacao = precipitacaorepository.listRange(estEstado, estNome,Timestamp.valueOf(estDTinicial),Timestamp.valueOf(estDTfinal));


    for (ViewPrecipitacaoModal objviewPrecipitacao : precipitacao) {

        if (objviewPrecipitacao.getPrecipitacaototal() == null) {

        objviewPrecipitacao.setPrecipitacaototal("N/A");

        }

    }

    ByteArrayInputStream bis = PdfPrecipitacao.exportarPdfPrecipitacao(precipitacao);

    HttpHeaders headers = new HttpHeaders();

    headers.add("Content-Disposition", "attachment;filename=Relatório Precipitação " +

    estNome + "(" + new SimpleDateFormat("dd-MM-yyyy")

    .format(precipitacao.get(0).getDatahoraCaptacao()) + " até " +

    new SimpleDateFormat("dd-MM-yyyy").format(precipitacao.get(precipitacao.size() - 1).getDatahoraCaptacao()) + ").pdf");

    return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bis));

}
```
Esse é um método de um controller que utiliza a anotação @GetMapping para mapear a URL "/Precipitacao/pdf/{estNome}/{estEstado}/{estDTinicial}/{estDTfinal}" para um relatório em formato PDF.
O método retorna um objeto ResponseEntity que contém um InputStreamResource que representa o arquivo PDF que será retornado ao usuário. Além disso, o método utiliza a anotação @PathVariable para obter os valores dos parâmetros estNome, estEstado, estDTinicial e estDTfinal a partir da URL e, em seguida, realiza uma série de operações em cima desses parâmetros.
Primeiramente, são realizadas operações de substituição de caracteres "*" por espaços em branco nos parâmetros estNome, estEstado, estDTinicial e estDTfinal. Em seguida, é realizada uma consulta no banco de dados através do objeto precipitacaorepository para recuperar uma lista de dados de precipitação que correspondem aos parâmetros especificados na URL.
A lista de dados é então percorrida para realizar uma verificação e atualização dos valores de precipitação total (caso estejam nulos).
Em seguida, o método utiliza um objeto PdfPrecipitacao (o código anterior) para exportar um arquivo PDF a partir da lista de dados de precipitação obtida. Este objeto é responsável por criar e popular o arquivo PDF.
Por fim, são definidos os cabeçalhos HTTP e os metadados do arquivo PDF, e o InputStreamResource é retornado no objeto ResponseEntity. O arquivo PDF é então baixado pelo cliente em seu navegador com o nome de arquivo especificado nos cabeçalhos HTTP.

### 4.Geração de PDFs dos gráficos

#### downloadPDF.js

```javascript
function jsGraficosPDF(chart1, chart2, tela) {

    const canvas = document.getElementById(chart1);

    const canvas2 = document.getElementById(chart2);

    //criando a imagem a partir do gráfico

    const canvasImage = canvas.toDataURL('image/png', 1);

    const canvasImage2 = canvas2.toDataURL('image/png', 1);

    //variáveis para o texto do PDF

    var estado = document.getElementById('estado');

    var estacao = document.getElementById('estacao');

    var dataMin = document.getElementById('dtMin');

    var dataMax = document.getElementById('dtMax');

    //passando a imagem para o pdf

    let pdf = new jsPDF('landscape');

    pdf.setFontSize(24);

    pdf.setFont('helvetica', 'bold');

    pdf.text(15, 15, ["Estação " + estacao.innerText + ", Estado de " + estado.innerText, " "]);

    pdf.setFont('helvetica', '');

    pdf.text(15, 15, [" ", "Dados de " + dataMin.innerText + " até " + dataMax.innerText]);

    pdf.addImage(canvasImage, 'PNG', 10, 35, 275, 150);

    pdf.addPage();

    pdf.addImage(canvasImage2, 'PNG', 10, 30, 275, 150);

    pdf.save('Gráficos ' + tela + ' (' + estacao.i
    nnerText + ').pdf');

}
```
O código JavaScript downloadPDF.js é uma função chamada jsGraficosPDF que é responsável por gerar um arquivo PDF a partir de dois gráficos gerados em um página da web.
A função recebe três parâmetros: chart1, chart2 e tela. chart1 e chart2 são os IDs dos elementos HTML que contém os gráficos que serão incluídos no PDF, e tela é um valor de texto que será incluído no nome do arquivo PDF gerado.
A função começa obtendo os elementos HTML canvas que contêm os gráficos a partir dos IDs passados como parâmetro. Em seguida, ela usa o método toDataURL do objeto canvas para gerar uma imagem em formato PNG a partir do conteúdo do gráfico.
Em seguida, a função obtém outros elementos HTML que contém informações sobre a estação, o estado e o intervalo de datas apresentados nos gráficos. Essas informações são usadas para criar um cabeçalho no arquivo PDF que será gerado.
Finalmente, a função usa a biblioteca jsPDF para criar um novo objeto PDF e adicionar as imagens dos gráficos e o texto do cabeçalho a ele. O PDF resultante é salvo com um nome de arquivo baseado nas informações da estação e do intervalo de datas, e a função retorna o objeto PDF.

## Aprendizados Efetivos

Nesse projeto, pela primeira vez trabalhei com códigos que interagem com banco de dados, o que se mostrou ser um desafio, mas foi uma oportunidade de eu melhorar as minhas habilidades de escrita de código, já que envolvia muitos detalhes e considerações. Dentro disso, tive que aprender a considerar questões de segurança e integridade dos dados, o que fez eu aprender mais sobre boas práticas de código nessa área, como a importância de validar dados de entrada e usar transações para garantir que as operações sejam concluídas com sucesso. Pude aprimorar também a minha soft skill de resolução de problemas e de depuração de erros, já que criar códigos que interagem com banco de dados podem apresentar vários desafios, desde questões de conectividade até erros de sintaxe SQL. Por fim, adquiri a habilidade de conectar com o banco de dados pelo Python, utilizando a biblioteca SQLAlchemy para isso, biblioteca essa que agora eu sei usar com propriedade.
Além disso, tive que aprender novos conceitos e tecnologias para atingir os meus objetivos no projeto, o que contribuiu para o meu desenvolvimento como programador, sendo que nessa área o aprendizado é contínuo, já que a programação está sempre em constante evolução.
Trabalhei também pela primeira vez com programação orientada a objetos (POO) em python. Antes disso, o paradigma que eu usava nessa linguagem era a procedural. Agora, eu tenho autonomia de aplicar os conceitos de POO em Python, pois que nesse projeto eu trabalhei com classes e defini métodos e atributos para cada uma delas, demonstrando compreensão dos conceitos de encapsulamento, herança e polimorfismo. Além disso, apliquei o conceito de reusabilidade de código do POO, reduzindo redundâncias no código ao utilizar parâmetros nos métodos.
Aprendi também a ter autonomia na manipulação de arquivos dentro do Python. No código da classe Automacao, eu usei o módulo "os" para manipular diretórios e arquivos, o módulo "zipfile" para extrair arquivos zipados e o módulo "shutil" para excluir pastas e diretórios. 
Ainda no código da classe Automacao, eu usei o módulo "requests" para fazer solicitações HTTP, o que mostra conhecimento em acessar recursos da web em Python. Além disso, baixei arquivos CSV e usei o módulo "pandas" para manipular esses dados, o que demonstra habilidades em manipulação de dados em formato CSV.
Agora tenho também autonomia em gerar logs em Python, para registrar informações de erros e também de execuções bem-sucedidas em um arquivo .txt, permitindo que os demais desenvolvedores e usuários tenham acesso ao resultado de todas as etapas da execução do script. Esse aprendizado será útil para outros projetos que eu vir a fazer parte, e agrega à qualidade do código adicionar essa funcionalidade que permite o controle e depuração do comportamento de cada trecho do código. Junto ao log, adquiri conhecimento em tratamento de exceções, utilizando try e except para lidar com erros possíveis em cada método construído nos códigos. Além disso, eu usei o comando raise para lançar exceções personalizadas. 
Eu já tinha conhecimentos em tratamento e análise de dados utilizando Pandas, mas nesse projeto eu pude aprimorar minhas habilidades. Nos códigos de tratamento de dados, eu usei o módulo "pandas" para transformar e reorganizar dados de um dataframe. Renomeei colunas, tratei valores nulos, converti tipos de dados e reorganizei o dataframe de acordo com a tabela do banco de dados, o que demonstra habilidades em transformação de dados usando o Pandas.
Geração de PDFs em Java: aprendi a como criar e manipular PDFs a partir do Java, estiliza-lo da forma que eu quiser, e povoar o documento com dados variáveis através do uso de loop e de uma lista de objetos do Modal que retorna dados meteorológicos. Ou seja, aprendi através disso a utilizar o Modal para retornar os dados que necessito, e agora sei usar com propriedade essa ferramenta do Spring.
Aprendi também a utilizar o Controller do Spring para criar métodos que faz requisições. Aprendi a utilizar anotações, como o "@GetMapping" para mapear uma requisição GET HTTP para o método "relatorioPrecipitacao" e definir a URL e os parâmetros da requisição. Também, aprendi a trabalhar com variáveis de caminho, usando a anotação "@PathVariable" para extrair os valores dos parâmetros da URL. Além disso, aprendi a usar retornos de resposta HTTP, ao utilizar a classe "ResponseEntity" para construir a resposta HTTP com o conteúdo do arquivo PDF gerado e os cabeçalhos configurados. 
Outrossim, aprendi a como criar e manipular PDFs a partir do JavaScript, estiliza-lo da forma que eu quiser, e então selecionar um canva HTML e convertê-lo à PNG e coloca-lo no documento. Consigo agora com propriedade gerar PDFs na linguagem e povoa-lo com qualquer objeto que for necessário.
Em resumo, tive aprendizados técnicos importantes na utilização de anotações, manipulação de tipos de dados, iteração sobre listas, condicionais, e geração de arquivos PDF. Esses conhecimentos podem ser aplicados em outros projetos do Spring Boot e em outras linguagens de programação que eu venha fazer no futuro. Por fim, no caso do python, adquiri conhecimentos em orientação ao objeto, manipulação de arquivos, requests, Pandas, log e tratamento de exceções. 

