# Portfólio - Felipe Sobral

## Introdução

Estudante no 5º semestre em tecnologia de Banco de Dados pela FATEC de São José dos Campos (Prof. Jessen Vidal). Tenho prazer em codar, estimo desafios que promovam novos conhecimentos técnicos e habilidades interpessoais.

Ao longo da minha carreira acadêmica, tive experiência na resolução de problemas reais semestralmente por meio de uma metodologia de aprendizado própria da FATEC (a API), que utiliza metodologias ágeis (SCRUM), com validação externa por empresas parceiras, através das tecnologias Python, Java e SQL (Oracle, SQL Server e PostgreSQL).

[![portfolio](https://img.shields.io/badge/my_portfolio- 000?style=for- the- badge&logo=ko- fi&logoColor=white)](https://github.com/SoSoJigsaw)
[![linkedin](https://img.shields.io/badge/linkedin- 0A66C2?style=for- the- badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/sosojigsaw/)

## Meus Principais Conhecimentos

### Python

Desenvolvo em Python desde 2021. Já utilizei a linguagem nos paradigmas procedural e orientado ao objeto. Utilizei o Python tanto para desenvolvimento web, utilizando para isso o microserviço Flask, quanto para análise e tratamento de dados, utilizando o Pandas e Numpy. Em alguns momentos, utilizei o Python também para automatizar processos, como alimentar o banco de dados com uma rotina usando SQLAlchemy para a conexão, e automatizar o processo de baixar uma base de dados disponibilizado em um site através de um script que usa Selenium para simular as ações em um navegador.

Logo, pode-se dizer que em Python eu tenho domínio na criação de scripts para automação de tarefas, análise de dados e desenvolvimento web:
- **Flask** : Experiência na construção de APIs RESTful e aplicações web escaláveis.
- **Pandas** : Habilidade em manipulação, análise e visualização de grandes volumes de dados.
- **NumPy** : Capacidade de realizar operações matemáticas complexas e manipulação de arrays.
- **Data Cleaning** : Competência na limpeza e transformação de dados para garantir análises precisas.
- **Automação** : Proficiência em automatizar processos de coleta e processamento de dados.
- **Visualização de Dados** : Criação de dashboards interativos para facilitar a interpretação de dados. Criação de visualizações gráficas e não-gráficas desses dados.

### Java

Desenvolvo em Java desde 2022. Utilizei a linguagem principalmente para desenvolver o back- end de aplicações web, utilizando para isso o framework Spring Boot com o auxílio do Hibernate, e aplicações desktop, utilizando para isso o JavaFX.

### PL/SQL

Utilizo o PL/SQL desde 2022, já tendo contato com comandos DDL, DCL e DML da linguagem. Relacionado a isso, eu já arquitetei a modelagem do banco de dados nos modelos Conceitual, Lógico e Físico. Em se tratando de SGBDs, tive experiência com os bancos Oracle, SQL Server e PostgreSQL, criando tabelas, fazendo o insert de novos dados, criando constraints e regras gerais do banco, e administrando o banco de uma forma geral.

### SCRUM

Tenho contato com o SCRUM desde o primeiro semestre da faculdade, em 2021, sendo que desde então todos os projetos acadêmicos em que participei utilizaram essa metodologia ágil para o gerenciamento da equipe como requisito. Tive experiência como Scrum Master da equipe, onde assumi o posto de líder responsável por organizar a equipe e buscar soluções para as dificuldades apresentadas. Fui também Product Owner (PO) em duas oportunidades, sendo responsável pelo desenvolvimento do produto ao criar o backlog, e pelo diálogo com o cliente em busca de atender as suas necessidades.

### JavaScript e TypeScript

Desenvolvo com javascript desde 2022, tendo pleno conhecimento tanto dos frameworks de backend quantos os de frontend.
Compreendo perfeitamente todos os conceitos web como o DOM, e conceitos específicos dos frameworks mais utilizados pelo 
mercado ultimamente, como a modularização, presente por exemplo no vue.js e react.

---

# Projeto Acadêmico (API) – 2º Semestre de 2021

## Parceiro Aacadêmico: Própria FATEC

**Projeto de Monitoramento e Análise de Dados da COVID- 19:** Este projeto foi desenvolvido em parceria com os docentes da faculdade ocupando o papel de clientes, com o objetivo de criar uma ferramenta robusta para monitoramento em tempo real dos dados relacionados à pandemia de COVID- 19 no estado de São Paulo. A ferramenta abrange a coleta, processamento e visualização de dados, permitindo uma análise detalhada e contínua da evolução da pandemia.

## Visão do Projeto

- O problema central abordado pelo projeto foi a necessidade de monitoramento contínuo e preciso da pandemia de COVID- 19. Com a grande quantidade de dados gerados diariamente, havia uma dificuldade em consolidar essas informações de forma acessível e útil para o cliente, que tinha um interesse por acompanhar o avanço da pandemia em nosso Estado.
- A solução entregue foi uma aplicação web que coleta, processa e visualiza dados da COVID- 19 em tempo real. Utilizando tecnologias como Flask, Pandas e diversas bibliotecas Python, a aplicação oferece dashboards interativos que mostram a evolução dos casos, óbitos, vacinação, ocupação de leitos e índices de isolamento social. Além disso, foram implementadas funcionalidades de filtragem de dados por data e município, proporcionando uma análise detalhada e customizada.

[Repositório do Projeto]()

## Tecnologias adotadas na solução

- **Python** : Fundamental para o desenvolvimento dos scripts de coleta e processamento de dados. A linguagem foi escolhida por sua simplicidade e poderosas bibliotecas para análise de dados.
- **Selenium** : Utilizado para automações de requests persistentes, onde era necessário fazer o download através de uma requisição web diariamente para atualizar com os dados mais atuais da pandemia. Como o dataset utilizado não dispunha de uma API, havia essa necessidade de reproduzir comandos humanos em um navegador, para assim poder baixar os dados atualizados pela identificação de certos elementos imutáveis na página.
- **Flask** : Utilizado para construir a API e o backend da aplicação web. Flask foi escolhido devido à sua flexibilidade e capacidade de criar aplicações web escaláveis.
- **Pandas** : Essencial para a manipulação e análise dos dados coletados. Pandas permitiu a transformação e limpeza dos dados de forma eficiente.
- **NumPy** : Utilizado para operações matemáticas e manipulação de arrays, complementando as funcionalidades do Pandas.
- **Glob** : Facilitou a manipulação de arquivos e diretórios, automatizando a coleta de novos dados.
- **DateTime** : Importante para a manipulação de datas e horários nos dados, permitindo análises temporais precisas.

## Contribuições Individuais

Minhas principais contribuições para o projeto incluíram:

- **Desenvolvimento de Scripts de Coleta de Dados** :
  Fui responsável por desenvolver scripts automatizados que coletam dados de diversas fontes, como arquivos CSV armazenados localmente e dados disponibilizados online. Utilizando a biblioteca `glob`, automatizei a identificação e leitura dos arquivos mais recentes, garantindo que a aplicação sempre tivesse acesso aos dados mais atualizados.

- **Processamento e Limpeza de Dados** :
  Utilizei `Pandas` para realizar operações de limpeza e transformação dos dados. Isso incluiu a remoção de duplicatas, tratamento de valores ausentes e padronização de formatos de data. A limpeza de dados é crucial para garantir a precisão das análises, e consegui implementar uma pipeline eficiente que trata grandes volumes de dados de forma rápida e precisa.

- **Desenvolvimento da Aplicação Flask** :
  No backend, utilizei o `Flask` para criar uma API RESTful que serve os dados processados para a interface web. Implementei rotas que permitem a consulta de dados filtrados por data e município, e configurei o servidor para suportar múltiplas requisições simultâneas, garantindo a escalabilidade da aplicação.

- **Visualização de Dados** :
  Criei dashboards interativos utilizando bibliotecas como `Matplotlib` e `Plotly`, que permitiram visualizar a evolução dos casos, óbitos, vacinação, ocupação de leitos e índices de isolamento social. As visualizações são atualizadas em tempo real, proporcionando uma ferramenta poderosa para a tomada de decisões informadas.

- **Integração de Múltiplas Fontes de Dados** :
  Combinei dados de diferentes fontes para criar um banco de dados unificado e coerente. Isso envolveu a junção de dataframes, o tratamento de colunas inconsistentes e a agregação de informações complementares. A integração de dados foi fundamental para fornecer uma visão holística da situação da pandemia.

## Aprendizados Efetivos

### Hard Skills

- **Python** : Desenvolvimento avançado de scripts e aplicações, especialmente para automação de tarefas e análise de dados.
- **Pandas** : Proficiência em operações complexas de limpeza e transformação de dados, manipulação de grandes datasets e geração de análises precisas.
- **Flask** : Desenvolvimento de APIs RESTful e backend de aplicações web, incluindo configuração de servidor e gerenciamento de rotas.
- **NumPy** : Realização de cálculos matemáticos avançados e manipulação de arrays multidimensionais.
- **Data Cleaning** : Habilidade de identificar e corrigir problemas nos dados, garantindo a integridade e a qualidade das análises.
- **Visualização de Dados** : Criação de gráficos e dashboards interativos que facilitam a interpretação de grandes volumes de dados.

### Soft Skills

- **Comunicação** : Durante o projeto, a comunicação foi essencial para alinhar as expectativas com a equipe e os stakeholders. Participei ativamente de reuniões semanais, apresentando o progresso e discutindo desafios técnicos. Minha habilidade de comunicar ideias complexas de maneira clara foi fundamental para o sucesso do projeto.
- **Gerenciamento de Tempo** : Trabalhei com prazos apertados e múltiplas tarefas simultâneas. Utilizei técnicas de gerenciamento de tempo, como a priorização de tarefas e o uso de listas de verificação, para garantir que todas as entregas fossem concluídas dentro dos prazos estabelecidos.
- **Pensamento Analítico** : A análise detalhada dos dados foi crucial para identificar padrões e tendências na evolução da pandemia. Utilizei minhas habilidades analíticas para interpretar os dados de forma crítica, proporcionando insights valiosos para a tomada de decisões.
- **Trabalho em Equipe** : Colaborei estreitamente com outros desenvolvedores, analistas de dados e especialistas em saúde pública. Minha capacidade de trabalhar bem em equipe, compartilhar conhecimento e apoiar meus colegas contribuiu para um ambiente de trabalho produtivo e colaborativo.

---

# Projeto Acadêmico (API) – 1º Semestre de 2022

## Parceiro Acadêmico: Dom Rock

[Logo DomRock]()

Projeto realizado em parceria com a Dom Rock, uma empresa especializada em soluções de Big Data e Inteligência Artificial.

## Visão do Projeto

- O objetivo foi desenvolver uma API robusta e eficiente para a gestão e análise de dados, que fosse capaz de suportar grandes volumes de informações e múltiplos usuários simultaneamente.
- O projeto consistiu na criação de uma API para integração, processamento e gerenciamento de dados provenientes de diversas fontes. A API foi projetada com foco em escalabilidade, segurança e performance, permitindo a geração de relatórios e análises avançadas para suportar a tomada de decisão dos clientes da Dom Rock.

[Repositório do Projeto]()

## Tecnologias Utilizadas

- **Java:** Escolhida pela sua robustez, portabilidade e vasto ecossistema de bibliotecas e frameworks, facilitando o desenvolvimento de aplicações escaláveis e de alta performance.
- **Spring Boot:** Framework que simplifica o desenvolvimento de aplicações Java, oferecendo configuração automática, suporte a segurança, e fácil gerenciamento de dependências.
- **JavaFX:** Utilizado para a criação de interfaces gráficas, proporcionando uma experiência de usuário rica e interativa.
- **PL/SQL:** Utilizado para a manipulação e gestão dos dados no banco de dados, garantindo eficiência nas operações e integridade dos dados.
- **SCRUM:** Metodologia ágil adotada para gerenciar o projeto de forma iterativa e incremental, promovendo a colaboração e a adaptabilidade da equipe.

## Contribuições Pessoais

Durante o desenvolvimento deste projeto, minhas contribuições foram diversas e abrangentes, focando em assegurar a entrega de uma solução técnica sólida e funcional.

### Desenvolvimento do Back-end

- **Criação de Serviços RESTful:** Utilizei Java e Spring Boot para desenvolver uma série de serviços RESTful. Esses serviços foram responsáveis por manipular e integrar dados provenientes de diversas fontes, garantindo escalabilidade e alta performance. Implementações específicas incluíram endpoints para criação, leitura, atualização e exclusão de dados (CRUD), bem como serviços para autenticação e autorização de usuários.
- **Implementação de Segurança:** Integrei o Spring Security para implementar medidas robustas de segurança na API. Isso incluiu a configuração de autenticação baseada em tokens JWT (JSON Web Tokens), controle de acesso baseado em roles (papéis) de usuário, e proteção contra ataques comuns como CSRF (Cross- Site Request Forgery).

### Integração com Banco de Dados

- **Modelagem de Dados:** Utilizando PL/SQL, fui responsável por modelar o banco de dados, criando tabelas, views, stored procedures e triggers. A modelagem foi projetada para otimizar o desempenho das consultas e garantir a integridade referencial dos dados.
- **Consultas Eficientes:** Escrevi queries complexas e otimizadas para suportar grandes volumes de dados. Utilizei técnicas como índices, joins eficientes e subconsultas para melhorar a performance das operações de leitura e escrita no banco de dados.

### Desenvolvimento de Interfaces Gráficas

- **Interfaces com JavaFX:** Desenvolvi interfaces gráficas utilizando JavaFX, permitindo uma interação intuitiva e responsiva com a aplicação. As interfaces incluíam dashboards para visualização de dados, formulários para entrada de informações, e componentes visuais para a navegação na aplicação.

### Gestão de Equipe e Metodologias Ágeis

- **Product Owner:** Assumi o papel de Product Owner, criando e priorizando o backlog do produto em alinhamento com os requisitos do parceiro acadêmico. Isso envolveu a definição de histórias de usuário, critérios de aceitação e a comunicação constante com os stakeholders para garantir que as entregas atendiam às expectativas.

## Aprendizados Efetivos

### Hard Skills

- **Java:** Aprimorei minhas habilidades em Java, focando em práticas avançadas de programação, como a utilização de padrões de design (Design Patterns) e a implementação de princípios SOLID para assegurar um código limpo e sustentável.
- **Spring Boot:** Dominei o desenvolvimento de APIs RESTful com Spring Boot, incluindo o uso de injeção de dependências, configuração automática e criação de testes unitários e de integração.
- **PL/SQL:** Aprofundei meus conhecimentos em PL/SQL, escrevendo scripts complexos para manipulação de dados e otimização de consultas.
- **JavaFX:** Desenvolvi interfaces gráficas avançadas, utilizando bindings, event handling e customização de componentes visuais para melhorar a experiência do usuário.

### Soft Skills 

- **Comunicação:** Melhorei minhas habilidades de comunicação, especialmente na articulação de requisitos técnicos e na facilitação de reuniões de equipe. A comunicação clara e eficaz foi crucial para alinhar expectativas e resolver impedimentos rapidamente.
- **Trabalho em Equipe:** Fomentei um ambiente de colaboração, trabalhando efetivamente com colegas de diferentes áreas de especialização para superar desafios técnicos e cumprir prazos.
- **Gestão de Tempo:** Aprimorei minhas habilidades de gestão de tempo, organizando tarefas e prazos para assegurar a entrega de funcionalidades dentro do cronograma estipulado. Utilizei técnicas de priorização como o método MoSCoW (Must have, Should have, Could have, and Won't have) para gerir o backlog de tarefas.

---

# Projeto Acadêmico (API) – 2º Semestre de 2022

## Parceiro Acadêmico: IACIT

Projeto feito com a parceria da IACIT, uma empresa de São José dos Campos que presta consultoria meteorológica, sendo que um de seus serviços atuais é fornecer aos clientes relatórios customizados de dados meteorológicos.

## Visão do projeto

Como a empresa trabalhava processando muitas informações manualmente, ela acabava por perder tempo, desperdiçando recursos com esse processo. Por isso, a empresa precisava da criação de um sistema que permitisse realizar a importação dos dados meteorológicos, bem como armazená- los em uma base de dados, para posteriormente gerar os relatórios desejados por seus clientes.

Dessa forma, o projeto visava desenvolver uma aplicação web para a empresa que possibilite a automatização desde o download, o processamento dos dados e a persistência dos dados no banco de dados de forma simplificada. Além disso, a aplicação aspirava possibilitar realizar a filtragem desses dados por temperatura, umidade, estações, vento, pressão atmosférica, radiação global e precipitação, além de possibilitar diversas visualizações desses dados. Por fim, a aplicação objetivava a criação de diferentes níveis de usuários juntamente com o painel administrativo, possibilitando a exportação dos relatórios a partir dos dados.

## Tecnologias adotadas na solução

- **HTML5 / CSS3 / Javascript (EC6)** : O front- end da aplicação foi desenvolvida em HTML para marcação de hipertexto, CSS3 para estilização da página, e Javascript (EC6) para utilização do AJAX, permitindo assim enviar e receber dados assincronamente do servidor web e evitar o recarregamento da página inteira sem a necessidade de uma nova solicitação, também para criar paginação personalizada, utilizar jsPDF para a geração de PDFs dos gráficos, e enviar variáveis ao servidor por requisições GET através da url da página.
- **Spring Boot** : O back-end da aplicação web foi realizada através do Spring Boot, onde foi definida toda a estrutura do projeto do lado servidor, criando para isso os packages controller, dto, modal, report, repository e service. Os controllers foram criados para gerenciar os endpoints e definir suas lógicas, o dto e o modal foram criados para mapear as entidades do banco de dados na aplicação, o report foi para definir classes que contém a lógica de criação dos PDFs que posteriormente seriam acessados em determinados endpoints dos controllers, o repository foi usado para criar interfaces que estendem o JpaRepository para declarar querys que serão utilizadas na lógica dos controllers, e o service foi usado para conter classes que encapsulam a lógica de negócios da aplicação e para expor serviços que podem ser acessados pelos controllers, como as ações de deletar e atualizar usuário ou a validação do login por um usuário.
- **Python** : O Python foi utilizado para analisar e tratar os dados meteorológicos que seriam utilizados na aplicação, e também para a criação de script de automação do povoamento do banco de dados por esses mesmos dados. Os dados precisaram primeiro serem tratados pelo Pandas para posteriormente serem analisados pela mesma biblioteca, e a criação do script de automação do povoamento foi realizado com o uso da biblioteca SQLAlchemy, que permitiu a utilização de comandos SQL dentro do Python, automatizando o processo de inserts à medida que os dados eram tratados. Foi utilizado o paradigma da orientação ao objeto nesse script, o que reduziu a reutilização de código e permitiu o processamento progressivo de toda a lógica do script ao permitir o acesso de uma classe às demais classes.
- **PostgreSQL** : O PostgreSQL foi o SGBD escolhido para a criação do banco de dados exigido no projeto. Através dele, foi feita toda a modelagem e administração do banco, que foi responsável por armazenar todos os dados meteorológicos que foram utilizados para o dashboard da aplicação e para o CRUD de usuários. Além da criação das tabelas e constraints, e inserts realizados, a aplicação necessitou do uso de views que limitavam o acesso aos dados pelo usuário final, triggers para permitir a criação de uma tabela de auditoria que faz um controle de todas as modificações realizadas por um usuário nas tabelas de interesse, e a criação de índices para as tabelas para melhorar o desempenho de consultas, redução de tempo de resposta, otimização da utilização de memória e, por fim, trazer melhorias em operações de junção, que foram muito utilizadas no projeto.

## Contribuições Individuais

Em grande parte do projeto eu trabalhei no back-end da aplicação, e em alguns momentos ajudei também no front- end.

### 1. Script de Automação do povoamento do banco

No back-end, fui responsável por:

- criar um script no Python que recebia os dados meteorológicos de uma base de dados disponibilizado em um servidor web através de um request, toda vez que o script era executado ele fazia o request e verificava se havia novos dados para serem baixados. Se houvesse novos dados, ele os baixava para um diretório reservado do projeto.

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

- O script acessava em loop todos os dados baixados no diretório e fazia o tratamento deles utilizando Pandas, mudando seus tipos e formatação de forma que depois de tratados estivessem em um formato adequado à lógica das tabelas do banco de dados criado.

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
# Tratamento dos dados e povoamento do banco de dados
                cleaningData = CleaningData()

                df = cleaningData.tratamento_dfs(df)

                cbd.povoar_banco(df.getRad(), 'radiacao_global')
                cbd.povoar_banco(df.getPrecip(), 'precipitacao')

```

O trecho `cleaningData = CleaningData()` cria uma instância da classe `CleaningData` para tratar os dados antes de serem povoados no banco de dados.

O método `tratamento_dfs(df)` recebe um DataFrame como entrada e retorna o DataFrame tratado. Esse tratamento envolve a remoção de linhas e colunas desnecessárias, a conversão de tipos de dados, a limpeza de valores faltantes e a renomeação de colunas.

Os DataFrames tratados são povoados no banco de dados por meio dos métodos `povoar_banco(df.getRad(), 'radiacao_global')`, `povoar_banco(df.getPrecip(), 'precipitacao')`, `povoar_banco(df.getVento(), 'vento')`, `povoar_banco(df.getAtm(), 'pressao_atmosferica')`, `povoar_banco(df.getTemp(), 'temperatura')` e `povoar_banco(df.getUmi(), 'umidade')`, que recebem o DataFrame tratado e o nome da tabela no banco de dados que será populada.

- Assim que terminava o tratamento desses dados, os dataframes eram enviados à outro método que fazia a rotina de enviar esses dados ao banco de dados, fazendo inserts nas tabelas devidas, usando para isso o SQLAlchemy para criar a conexão com o banco e utilizar comandos de SQL puro dentro do Python. Essa rotina incluía tratamento de erros, evitando a duplicação de dados no banco, redundância, e quebra de constraints de chave primária. O script foi otimizado, permitindo que a tentativa de envio de dados ao banco, ou seja, a execução do comando SQL, só acontecesse caso o dataframe trouxesse novos dados.

```python
def povoar_banco(self, df: DataFrame, tabela: str):

try:

conexaoBD = ConexaoBD()

cod_wmo = df.loc[0][0]

# Povoamento das tabelas

sql = f"SELECT datahora_captacao FROM {tabela} WHERE cod_wmo='{cod_wmo}' ORDER BY " \

f"datahora_captacao DESC LIMIT 1"

try:

df = df[~(df['datahora_captacao']  relatorioPrecipitacao (HttpServletResponse response, @PathVariable("estNome") String estNome, @PathVariable("estEstado") String estEstado, @PathVariable("estDTinicial") String estDTinicial, @PathVariable("estDTfinal") String estDTfinal) throws IOException {

    List precipitacao = precipitacaorepository.listRange(estEstado,estNome,Timestamp.valueOf(estDTinicial),Timestamp.valueOf(estDTfinal));

    ByteArrayInputStream bis = PdfPrecipitacao.exportarPdfPrecipitacao(precipitacao);

    HttpHeaders headers = new HttpHeaders();

    headers.add("Content- Disposition", "attachment;filename=Relatório Precipitação " + estNome + "(" + new SimpleDateFormat("dd- MM- yyyy").format(precipitacao.get(0).getDatahoraCaptacao()) + " até " + new SimpleDateFormat("dd- MM- yyyy").format(precipitacao.get(precipitacao.size() - 1).getDatahoraCaptacao()) + ").pdf");

    return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bis));

}

```

Esse é um método de um controller que utiliza a anotação `@GetMapping` para mapear a URL "/Precipitacao/pdf/{estNome}/{estEstado}/{estDTinicial}/{estDTfinal}" para um relatório em formato PDF.

O método retorna um objeto `ResponseEntity` que contém um `InputStreamResource` que representa o arquivo PDF que será retornado ao usuário. Além disso, o método utiliza a anotação `@PathVariable` para obter os valores dos parâmetros `estNome`, `estEstado`, `estDTinicial` e `estDTfinal` a partir da URL e, em seguida, realiza uma série de operações em cima desses parâmetros.

Primeiramente, são realizadas operações de substituição de caracteres "\* " por espaços em branco nos parâmetros do `@PathVariable`.

Em seguida, é realizada uma consulta no banco de dados através do objeto `precipitacaorepository` para recuperar uma lista de dados de precipitação que correspondem aos parâmetros especificados na URL.

A lista de dados é então percorrida para realizar uma verificação e atualização dos valores de precipitação total (caso estejam nulos).

Em seguida, o método utiliza um objeto `PdfPrecipitacao` (o código anterior) para exportar um arquivo PDF a partir da lista de dados de precipitação obtida. Este objeto é responsável por criar e popular o arquivo PDF.

Por fim, são definidos os cabeçalhos HTTP e os metadados do arquivo PDF, e o `InputStreamResource` é retornado no objeto `ResponseEntity`. O arquivo PDF é então baixado pelo cliente em seu navegador com o nome de arquivo especificado nos cabeçalhos HTTP.

[Veja mais detalhes](https://github.com/SoSoJigsaw/bertoti/blob/main/Metodologia/Detalhes%20das%20Contribui%C3%A7%C3%B5es/RelatoriosPDF.md)

### 3. Geração de PDFs dos gráficos

No front- end, eu ajudei em partes na estilização das páginas. No entanto, fui responsável por criar o método que gerava o PDF dos gráficos. Para isso:

- eu usei uma biblioteca do JavaScript chamada jsPDF, que estilizou o PDF e incluiu o gráfico nele, gráfico esse que foi convertido de elemento canvas HTML em um arquivo de imagem PNG e possibilitou dentro do mesmo método o download em PDF

```javascript
function jsGraficosPDF(chart1, chart2, tela) {
  const canvas = document.getElementById(chart1);
  const canvas2 = document.getElementById(chart2);

  //criando a imagem a partir do gráfico

  const canvasImage = canvas.toDataURL("image/png", 1);
  const canvasImage2 = canvas2.toDataURL("image/png", 1);

  //variáveis para o texto do PDF

  var estado = document.getElementById("estado");
  var estacao = document.getElementById("estacao");
  var dataMin = document.getElementById("dtMin");
  var dataMax = document.getElementById("dtMax");

  //passando a imagem para o pdf

  let pdf = new jsPDF("landscape");
  pdf.setFontSize(24);
  pdf.setFont("helvetica", "bold");
  pdf.text(15, 15, [
    "Estação " + estacao.innerText + ", Estado de " + estado.innerText,
    " ",
  ]);
  pdf.setFont("helvetica", "");
  pdf.text(15, 15, [
    " ",
    "Dados de " + dataMin.innerText + " até " + dataMax.innerText,
  ]);

  pdf.addImage(canvasImage, "PNG", 10, 35, 275, 150);
  pdf.addPage();
  pdf.addImage(canvasImage2, "PNG", 10, 30, 275, 150);
  pdf.save("Gráficos " + tela + " (" + estacao.innerText + ").pdf");
}
```

O código JavaScript `downloadPDF.js` é uma função chamada `jsGraficosPDF` que é responsável por gerar um arquivo PDF a partir de dois gráficos gerados em um página da web.

A função recebe três parâmetros: `chart1`, `chart2` e `tela`. `chart1` e `chart2` são os IDs dos elementos HTML que contém os gráficos que serão incluídos no PDF, e tela é um valor de texto que será incluído no nome do arquivo PDF gerado.

A função começa obtendo os elementos HTML canvas que contêm os gráficos a partir dos IDs passados como parâmetro. Em seguida, ela usa o método `toDataURL` do objeto canvas para gerar uma imagem em formato PNG a partir do conteúdo do gráfico.

Em seguida, a função obtém outros elementos HTML que contém informações sobre a estação, o estado e o intervalo de datas apresentados nos gráficos. Essas informações são usadas para criar um cabeçalho no arquivo PDF que será gerado.

Finalmente, a função usa a biblioteca `jsPDF` para criar um novo objeto PDF e adicionar as imagens dos gráficos e o texto do cabeçalho a ele. O PDF resultante é salvo com um nome de arquivo baseado nas informações da estação e do intervalo de datas, e a função retorna o objeto PDF.

[Veja mais detalhes](https://github.com/SoSoJigsaw/bertoti/blob/main/Metodologia/Detalhes%20das%20Contribui%C3%A7%C3%B5es/PDFsGraficos.md)

## Aprendizados Efetivos


### Hard Skills

- **Interação e persistência de dados com o banco de dados** : Pela primeira vez trabalhei com códigos que interagem com banco de dados, o que se mostrou ser um desafio, mas foi uma oportunidade de eu melhorar as minhas habilidades de escrita de código, já que envolvia muitos detalhes e considerações. 

Tive também que aprender a considerar questões de segurança e integridade dos dados, o que fez eu aprender mais sobre boas práticas de código nessa área, como a importância de validar dados de entrada e usar transações para garantir que as operações sejam concluídas com sucesso.

Pude aprimorar também a minha soft skill de resolução de problemas e de depuração de erros, já que criar códigos que interagem com banco de dados podem apresentar vários desafios, desde questões de conectividade até erros de sintaxe SQL.

Por fim, adquiri a habilidade de conectar com o banco de dados pelo Python, utilizando a biblioteca SQLAlchemy para isso, biblioteca essa que agora eu sei usar com propriedade.

- **Paradigma da Programação Orientada à Objetos através do Python** : Trabalhei pela primeira vez com programação orientada a objetos (POO) em python. Agora, eu tenho autonomia de aplicar os conceitos de POO em Python, pois que nesse projeto eu trabalhei com classes e defini métodos e atributos para cada uma delas, demonstrando compreensão dos conceitos de encapsulamento, herança e polimorfismo.

Além disso, apliquei o conceito de reusabilidade de código do POO, reduzindo redundâncias no código ao utilizar parâmetros nos métodos.

- **Manipulação de arquivos e requisições no Python** : Aprendi a ter autonomia na manipulação de arquivos dentro do Python. No código da classe Automacao, eu usei o módulo "os" para manipular diretórios e arquivos, o módulo "zipfile" para extrair arquivos zipados e o módulo "shutil" para excluir pastas e diretórios.

Ainda no código da classe Automacao, eu usei o módulo "requests" para fazer solicitações HTTP, o que mostra conhecimento em acessar recursos da web em Python.

Além disso, baixei arquivos CSV e usei o módulo "pandas" para manipular esses dados, o que demonstra habilidades em manipulação de dados em formato CSV.

- **Geração de logs e tratamento de exceções em Python** : Agora tenho também autonomia em gerar logs em Python, para registrar informações de erros e também de execuções bem- sucedidas em um arquivo .txt, permitindo que os demais desenvolvedores e usuários tenham acesso ao resultado de todas as etapas da execução do script. Esse aprendizado será útil para outros projetos que eu vir a fazer parte, e agrega à qualidade do código adicionar essa funcionalidade que permite o controle e depuração do comportamento de cada trecho do código.

Junto ao log, adquiri conhecimento em tratamento de exceções, utilizando `try` e `except` para lidar com erros possíveis em cada método construído nos códigos.

Além disso, eu usei o comando `raise` para lançar exceções personalizadas.

- **Aprimoramento no tratamento e análise de dados usando Pandas** : Eu já tinha conhecimentos em tratamento e análise de dados utilizando Pandas, mas nesse projeto eu pude aprimorar minhas habilidades. Nos códigos de tratamento de dados, eu usei o módulo "pandas" para transformar e reorganizar dados de um dataframe. Renomeei colunas, tratei valores nulos, converti tipos de dados e reorganizei o dataframe de acordo com a tabela do banco de dados, o que demonstra habilidades em transformação de dados usando o Pandas.

- **Manipulação de PDFs através do Java** : Aprendi a como criar e manipular PDFs a partir do Java, estiliza- lo da forma que eu quiser, e povoar o documento com dados variáveis através do uso de loop e de uma lista de objetos do Modal que retorna dados meteorológicos.

Aprendi através disso a utilizar o Modal para retornar os dados que necessito, e agora sei usar com propriedade essa ferramenta do Spring.

- **Utilização efetiva da arquitetura MVC do SpringBoot, principalmente na criação de métodos de requisição** : Aprendi também a utilizar o Controller do Spring para criar métodos que faz requisições.

Aprendi a utilizar anotações, como o `@GetMapping` para mapear uma requisição GET HTTP para o método "relatorioPrecipitacao" e definir a URL e os parâmetros da requisição.

Também, aprendi a trabalhar com variáveis de caminho, usando a anotação `@PathVariable` para extrair os valores dos parâmetros da URL.

Além disso, aprendi a usar retornos de resposta HTTP, ao utilizar a classe `ResponseEntity` para construir a resposta HTTP com o conteúdo do arquivo PDF gerado e os cabeçalhos configurados.

- **Manipulação de PDFs através do JavaScript e interação com elementos HTML canva** : Outrossim, aprendi a como criar e manipular PDFs a partir do JavaScript, estiliza- lo da forma que eu quiser, e então selecionar um canva HTML e convertê- lo à PNG e coloca- lo no documento. Consigo agora com propriedade gerar PDFs na linguagem e povoa- lo com qualquer objeto que for necessário.

#### Considerações Finais
Em resumo, tive aprendizados técnicos importantes na utilização de anotações, manipulação de tipos de dados, iteração sobre listas, condicionais, e geração de arquivos PDF. Esses conhecimentos podem ser aplicados em outros projetos do Spring Boot e em outras linguagens de programação que eu venha fazer no futuro. Por fim, no caso do python, adquiri conhecimentos em orientação ao objeto, manipulação de arquivos, requests, Pandas, log e tratamento de exceções.

---

# Projeto Acadêmico (API) – 2º Semestre de 2021

## Parceiro Aacadêmico: Própria FATEC

**Projeto de Monitoramento e Análise de Dados da COVID- 19:** Este projeto foi desenvolvido em parceria com os docentes da faculdade ocupando o papel de clientes, com o objetivo de criar uma ferramenta robusta para monitoramento em tempo real dos dados relacionados à pandemia de COVID- 19 no estado de São Paulo. A ferramenta abrange a coleta, processamento e visualização de dados, permitindo uma análise detalhada e contínua da evolução da pandemia.

## Visão do Projeto

- O problema central abordado pelo projeto foi a necessidade de monitoramento contínuo e preciso da pandemia de COVID- 19. Com a grande quantidade de dados gerados diariamente, havia uma dificuldade em consolidar essas informações de forma acessível e útil para o cliente, que tinha um interesse por acompanhar o avanço da pandemia em nosso Estado.
- A solução entregue foi uma aplicação web que coleta, processa e visualiza dados da COVID- 19 em tempo real. Utilizando tecnologias como Flask, Pandas e diversas bibliotecas Python, a aplicação oferece dashboards interativos que mostram a evolução dos casos, óbitos, vacinação, ocupação de leitos e índices de isolamento social. Além disso, foram implementadas funcionalidades de filtragem de dados por data e município, proporcionando uma análise detalhada e customizada.

[Repositório do Projeto]()

## Tecnologias adotadas na solução

- **Python** : Fundamental para o desenvolvimento dos scripts de coleta e processamento de dados. A linguagem foi escolhida por sua simplicidade e poderosas bibliotecas para análise de dados.
- **Selenium** : Utilizado para automações de requests persistentes, onde era necessário fazer o download através de uma requisição web diariamente para atualizar com os dados mais atuais da pandemia. Como o dataset utilizado não dispunha de uma API, havia essa necessidade de reproduzir comandos humanos em um navegador, para assim poder baixar os dados atualizados pela identificação de certos elementos imutáveis na página.
- **Flask** : Utilizado para construir a API e o backend da aplicação web. Flask foi escolhido devido à sua flexibilidade e capacidade de criar aplicações web escaláveis.
- **Pandas** : Essencial para a manipulação e análise dos dados coletados. Pandas permitiu a transformação e limpeza dos dados de forma eficiente.
- **NumPy** : Utilizado para operações matemáticas e manipulação de arrays, complementando as funcionalidades do Pandas.
- **Glob** : Facilitou a manipulação de arquivos e diretórios, automatizando a coleta de novos dados.
- **DateTime** : Importante para a manipulação de datas e horários nos dados, permitindo análises temporais precisas.

## Contribuições Individuais

Minhas principais contribuições para o projeto incluíram:

- **Desenvolvimento de Scripts de Coleta de Dados** :
  Fui responsável por desenvolver scripts automatizados que coletam dados de diversas fontes, como arquivos CSV armazenados localmente e dados disponibilizados online. Utilizando a biblioteca `glob`, automatizei a identificação e leitura dos arquivos mais recentes, garantindo que a aplicação sempre tivesse acesso aos dados mais atualizados.

- **Processamento e Limpeza de Dados** :
  Utilizei `Pandas` para realizar operações de limpeza e transformação dos dados. Isso incluiu a remoção de duplicatas, tratamento de valores ausentes e padronização de formatos de data. A limpeza de dados é crucial para garantir a precisão das análises, e consegui implementar uma pipeline eficiente que trata grandes volumes de dados de forma rápida e precisa.

- **Desenvolvimento da Aplicação Flask** :
  No backend, utilizei o `Flask` para criar uma API RESTful que serve os dados processados para a interface web. Implementei rotas que permitem a consulta de dados filtrados por data e município, e configurei o servidor para suportar múltiplas requisições simultâneas, garantindo a escalabilidade da aplicação.

- **Visualização de Dados** :
  Criei dashboards interativos utilizando bibliotecas como `Matplotlib` e `Plotly`, que permitiram visualizar a evolução dos casos, óbitos, vacinação, ocupação de leitos e índices de isolamento social. As visualizações são atualizadas em tempo real, proporcionando uma ferramenta poderosa para a tomada de decisões informadas.

- **Integração de Múltiplas Fontes de Dados** :
  Combinei dados de diferentes fontes para criar um banco de dados unificado e coerente. Isso envolveu a junção de dataframes, o tratamento de colunas inconsistentes e a agregação de informações complementares. A integração de dados foi fundamental para fornecer uma visão holística da situação da pandemia.

## Aprendizados Efetivos

### Hard Skills

- **Python** : Desenvolvimento avançado de scripts e aplicações, especialmente para automação de tarefas e análise de dados.
- **Pandas** : Proficiência em operações complexas de limpeza e transformação de dados, manipulação de grandes datasets e geração de análises precisas.
- **Flask** : Desenvolvimento de APIs RESTful e backend de aplicações web, incluindo configuração de servidor e gerenciamento de rotas.
- **NumPy** : Realização de cálculos matemáticos avançados e manipulação de arrays multidimensionais.
- **Data Cleaning** : Habilidade de identificar e corrigir problemas nos dados, garantindo a integridade e a qualidade das análises.
- **Visualização de Dados** : Criação de gráficos e dashboards interativos que facilitam a interpretação de grandes volumes de dados.

### Soft Skills

- **Comunicação** : Durante o projeto, a comunicação foi essencial para alinhar as expectativas com a equipe e os stakeholders. Participei ativamente de reuniões semanais, apresentando o progresso e discutindo desafios técnicos. Minha habilidade de comunicar ideias complexas de maneira clara foi fundamental para o sucesso do projeto.
- **Gerenciamento de Tempo** : Trabalhei com prazos apertados e múltiplas tarefas simultâneas. Utilizei técnicas de gerenciamento de tempo, como a priorização de tarefas e o uso de listas de verificação, para garantir que todas as entregas fossem concluídas dentro dos prazos estabelecidos.
- **Pensamento Analítico** : A análise detalhada dos dados foi crucial para identificar padrões e tendências na evolução da pandemia. Utilizei minhas habilidades analíticas para interpretar os dados de forma crítica, proporcionando insights valiosos para a tomada de decisões.
- **Trabalho em Equipe** : Colaborei estreitamente com outros desenvolvedores, analistas de dados e especialistas em saúde pública. Minha capacidade de trabalhar bem em equipe, compartilhar conhecimento e apoiar meus colegas contribuiu para um ambiente de trabalho produtivo e colaborativo.

---

# Projeto Acadêmico (API) – 1º Semestre de 2023

## Parceiro Acadêmico: Embraer

[Logo Embraer]()

Projeto realizado em parceria com a Embraer, uma empresa especializada em soluções de aeronáutica, defesa e segurança, proporcionando inovações tecnológicas para o setor aeroespacial.

## Visão do Projeto

- O objetivo foi desenvolver uma aplicação robusta e eficiente para a integração e gerenciamento de dados de aeronaves, contribuindo para a otimização das operações e manutenção.
- O projeto consistiu na criação de uma API para integração, processamento e gerenciamento de dados provenientes de sistemas de monitoramento de aeronaves, manutenção e operações. A API foi projetada com foco em escalabilidade, segurança e performance, permitindo a geração de relatórios detalhados e visualização de dados em tempo real.

[Repositório do Projeto]()

## Tecnologias Utilizadas

- **Vue.js:** Escolhido para a construção das interfaces de usuário devido à sua reatividade e facilidade de integração com outras bibliotecas, além de sua simplicidade e eficiência na criação de interfaces reativas e componentes reutilizáveis.
- **TypeScript:** Utilizado para adicionar tipagem estática ao JavaScript, melhorando a qualidade do código e facilitando a manutenção.
- **Pinia:** Gerenciador de estado escolhido por sua simplicidade e integração com Vue.js.
- **Vite:** Ferramenta de build moderna e rápida, utilizada para otimizar o desenvolvimento e a construção do projeto.
- **Axios:** Biblioteca para realizar requisições HTTP, essencial para comunicação entre o frontend e backend.
- **Spring Boot:** Framework utilizado para o desenvolvimento do backend devido à sua robustez e suporte para a criação de APIs RESTful.
- **SCRUM:** Metodologia ágil adotada para gerenciar o projeto de forma iterativa e incremental, promovendo a colaboração e a adaptabilidade da equipe.

## Contribuições Pessoais

Durante o desenvolvimento deste projeto, minhas contribuições foram diversas e abrangentes, focando em várias áreas críticas do projeto.

### Desenvolvimento do Back-end

- **Criação de Serviços RESTful:** Utilizei Spring Boot para desenvolver uma série de serviços RESTful. Esses serviços foram responsáveis por manipular e integrar dados provenientes de diversas fontes, garantindo escalabilidade e alta performance. Implementações específicas incluíram endpoints para criação, leitura, atualização e exclusão de dados (CRUD), bem como serviços para autenticação e autorização de usuários.
- **Implementação de Segurança:** Integrei o Spring Security para implementar medidas robustas de segurança na API. Isso incluiu a configuração de autenticação baseada em tokens JWT (JSON Web Tokens), controle de acesso baseado em roles (papéis) de usuário, e proteção contra ataques comuns como CSRF (Cross-Site Request Forgery).
- **Spring Boot:** Escolhido por sua capacidade de criar aplicações standalone de produção e seu ecossistema abrangente.

### Integração com Banco de Dados

- **Mapeamento e manipulação de Dados do banco:** Utilizando JPA, fui responsável pelo mapeamento e manipulação do banco de dados através da API SpringBoot. O uso do JPA foi projetado para otimizar o desempenho das consultas e da persistência dos dados através da API, e também garantir a integridade referencial destes mesmos dados.
- **Hibernate:** Utilizado para facilitar a interação com o banco de dados, reduzindo o código boilerplate e aumentando a produtividade.

### Desenvolvimento de Interfaces Gráficas

- **Interfaces com Vue.js:** Desenvolvi interfaces gráficas utilizando Vue.js, permitindo uma interação intuitiva e responsiva com a aplicação. As interfaces incluíam dashboards para visualização de dados, formulários para entrada de informações, e componentes visuais para a navegação na aplicação.

### Gestão de Equipe e Metodologias Ágeis

- **Product Owner:** Assumi o papel de Product Owner, criando e priorizando o backlog do produto, garantindo que a equipe estivesse focada nas tarefas de maior valor para o cliente e alinhada com os objetivos do projeto.

## Aprendizados Efetivos

### Hard Skills

- **Vue.js:** Aprimorei minhas habilidades em Vue.js, focando em práticas avançadas de programação, como a utilização de mixins, directives e componentes dinâmicos.
- **Spring Boot:** Dominei o desenvolvimento de APIs RESTful com Spring Boot, incluindo o uso de Spring Security, Spring Data JPA, Hibernate e testes de integração.
- **TypeScript:** Aprofundei meus conhecimentos em TypeScript, escrevendo scripts complexos para garantir a robustez e a segurança do código.

### Soft Skills 

- **Comunicação:** Melhorei minhas habilidades de comunicação, especialmente na articulação de ideias técnicas e feedback construtivo durante reuniões de equipe.
- **Colaboração:** Fomentei um ambiente de colaboração, trabalhando efetivamente com desenvolvedores, designers e stakeholders para alcançar os objetivos do projeto.
- **Gerenciamento de Tempo:** Aprimorei minhas habilidades de gerenciamento de tempo, organizando tarefas e prazos para garantir a entrega pontual das funcionalidades e a qualidade do produto final.

---

