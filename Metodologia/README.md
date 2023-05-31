
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


### 1. Script de Automação do povoamento do banco 
No back-end, fui responsável por criar um script no Python que recebia os dados meteorológicos de uma base de dados disponibilizado em um servidor web através de um request, toda vez que o script era executado ele fazia o request e verificava se havia novos dados para serem baixados. Se houvesse novos dados, ele os baixava para um diretório reservado do projeto. Depois, o script acessava em loop todos os dados baixados no diretório e fazia o tratamento deles utilizando Pandas, mudando seus tipos e formatação de forma que depois de tratados estivessem em um formato adequado à lógica das tabelas do banco de dados criado. Assim que terminava o tratamento desses dados, os dataframes eram enviados à outro método que por loop fazia a rotina de enviar esses dados ao banco de dados, fazendo inserts nas tabelas devidas, usando para isso o SQLAlchemy para criar a conexão com o banco e utilizar comandos de SQL puro dentro do Python. Essa rotina incluía tratamento de erros, evitando a duplicação de dados no banco, redundância, e quebra de constraints de chave primária. O script foi otimizado, permitindo que a tentativa de envio de dados ao banco, ou seja, a execução do comando SQL, só acontecesse caso o dataframe trouxesse novos dados, e assim o script terminava a sua execução em questão de minutos, mesmo tendo que lidar com arquivos CSVs que continham mais de quinze mil linhas cada um. Como cada CSV correspondia a uma estação meterológica, e os dados trabalhados deveriam ser de 2020 a 2022, a quantidade de arquivos chegava a novecentos, cada um com quinze mil linhas. Por fim, o script necessitava ser executado periodicamente a pedido do cliente, assim como o cliente não tinha interesse por executar ele próprio o script, portanto eu criei uma rotina que executava automaticamente o script uma vez por semana, utilizando para isso o Windows Task Scheduler, que executava um arquivo Shell Script contendo o script python.

[Veja mais detalhes](https://github.com/SoSoJigsaw/bertoti/blob/main/Metodologia/Detalhes%20das%20Contribui%C3%A7%C3%B5es/ScriptDeAutomacao.md)


### 2. Criação de Relatórios PDF
Ainda no back-end, fui responsável por gerar os relatórios em PDF dos dados meteorológicos, que deveriam serem baixados dentro de um endpoint da aplicação Spring Boot. Para isso, utilizei a biblioteca iText do Java, e criei códigos no diretório “report” estilizando os relatórios e criando a lógica de recebimento dos dados que seriam printados no documento, que vinham de uma List do Modal de cada variável meteorológica. Por terem lógicas diferentes, foi criado um código para cada variável meteorológica. Depois, criei endpoints no controller de cada variável meteorológica onde recebia os parâmetros através da url dos dados requeridos no relatório, e então colocava esses parâmetros dentro da query do repository, criando uma variável com isso, e chamava o método criado no código do report, colocando como parâmetro a variável criada. Por fim, o método criava o PDF, que então no endpoint eu retornava o PDF. Ao acessar esse endpoint na aplicação, o download do PDF era realizado automaticamente.

[Veja mais detalhes](https://github.com/SoSoJigsaw/bertoti/blob/main/Metodologia/Detalhes%20das%20Contribui%C3%A7%C3%B5es/RelatoriosPDF.md)


### 3. Geração de PDFs dos gráficos
No front-end, eu ajudei em partes na estilização das páginas. No entanto, fui responsável por criar o método que gerava o PDF dos gráficos. Para isso, eu usei uma biblioteca do JavaScript chamada jsPDF, que estilizou o PDF e incluiu o gráfico nele, gráfico esse que foi convertido de elemento canvas HTML em um arquivo de imagem PNG. 

[Veja mais detalhes](https://github.com/SoSoJigsaw/bertoti/blob/main/Metodologia/Detalhes%20das%20Contribui%C3%A7%C3%B5es/PDFsGraficos.md)


## Aprendizados Efetivos

Nesse projeto, pela primeira vez trabalhei com códigos que interagem com banco de dados, o que se mostrou ser um desafio, mas foi uma oportunidade de eu melhorar as minhas habilidades de escrita de código, já que envolvia muitos detalhes e considerações. Dentro disso, tive que aprender a considerar questões de segurança e integridade dos dados, o que fez eu aprender mais sobre boas práticas de código nessa área, como a importância de validar dados de entrada e usar transações para garantir que as operações sejam concluídas com sucesso. Pude aprimorar também a minha soft skill de resolução de problemas e de depuração de erros, já que criar códigos que interagem com banco de dados podem apresentar vários desafios, desde questões de conectividade até erros de sintaxe SQL. Por fim, adquiri a habilidade de conectar com o banco de dados pelo Python, utilizando a biblioteca SQLAlchemy para isso, biblioteca essa que agora eu sei usar com propriedade.

Além disso, tive que aprender novos conceitos e tecnologias para atingir os meus objetivos no projeto, o que contribuiu para o meu desenvolvimento como programador, sendo que nessa área o aprendizado é contínuo, já que a programação está sempre em constante evolução.

Trabalhei também pela primeira vez com programação orientada a objetos (POO) em python. Antes disso, o paradigma que eu usava nessa linguagem era a procedural. Agora, eu tenho autonomia de aplicar os conceitos de POO em Python, pois que nesse projeto eu trabalhei com classes e defini métodos e atributos para cada uma delas, demonstrando compreensão dos conceitos de encapsulamento, herança e polimorfismo. Além disso, apliquei o conceito de reusabilidade de código do POO, reduzindo redundâncias no código ao utilizar parâmetros nos métodos.

Aprendi também a ter autonomia na manipulação de arquivos dentro do Python. No código da classe Automacao, eu usei o módulo "os" para manipular diretórios e arquivos, o módulo "zipfile" para extrair arquivos zipados e o módulo "shutil" para excluir pastas e diretórios. 

Ainda no código da classe Automacao, eu usei o módulo "requests" para fazer solicitações HTTP, o que mostra conhecimento em acessar recursos da web em Python. Além disso, baixei arquivos CSV e usei o módulo "pandas" para manipular esses dados, o que demonstra habilidades em manipulação de dados em formato CSV.

Agora tenho também autonomia em gerar logs em Python, para registrar informações de erros e também de execuções bem-sucedidas em um arquivo .txt, permitindo que os demais desenvolvedores e usuários tenham acesso ao resultado de todas as etapas da execução do script. Esse aprendizado será útil para outros projetos que eu vir a fazer parte, e agrega à qualidade do código adicionar essa funcionalidade que permite o controle e depuração do comportamento de cada trecho do código. Junto ao log, adquiri conhecimento em tratamento de exceções, utilizando try e except para lidar com erros possíveis em cada método construído nos códigos. Além disso, eu usei o comando raise para lançar exceções personalizadas. 

Eu já tinha conhecimentos em tratamento e análise de dados utilizando Pandas, mas nesse projeto eu pude aprimorar minhas habilidades. Nos códigos de tratamento de dados, eu usei o módulo "pandas" para transformar e reorganizar dados de um dataframe. Renomeei colunas, tratei valores nulos, converti tipos de dados e reorganizei o dataframe de acordo com a tabela do banco de dados, o que demonstra habilidades em transformação de dados usando o Pandas.

Aprendi a como criar e manipular PDFs a partir do Java, estiliza-lo da forma que eu quiser, e povoar o documento com dados variáveis através do uso de loop e de uma lista de objetos do Modal que retorna dados meteorológicos. Ou seja, aprendi através disso a utilizar o Modal para retornar os dados que necessito, e agora sei usar com propriedade essa ferramenta do Spring.

Aprendi também a utilizar o Controller do Spring para criar métodos que faz requisições. Aprendi a utilizar anotações, como o "@GetMapping" para mapear uma requisição GET HTTP para o método "relatorioPrecipitacao" e definir a URL e os parâmetros da requisição. Também, aprendi a trabalhar com variáveis de caminho, usando a anotação "@PathVariable" para extrair os valores dos parâmetros da URL. Além disso, aprendi a usar retornos de resposta HTTP, ao utilizar a classe "ResponseEntity" para construir a resposta HTTP com o conteúdo do arquivo PDF gerado e os cabeçalhos configurados. 

Outrossim, aprendi a como criar e manipular PDFs a partir do JavaScript, estiliza-lo da forma que eu quiser, e então selecionar um canva HTML e convertê-lo à PNG e coloca-lo no documento. Consigo agora com propriedade gerar PDFs na linguagem e povoa-lo com qualquer objeto que for necessário.

Em resumo, tive aprendizados técnicos importantes na utilização de anotações, manipulação de tipos de dados, iteração sobre listas, condicionais, e geração de arquivos PDF. Esses conhecimentos podem ser aplicados em outros projetos do Spring Boot e em outras linguagens de programação que eu venha fazer no futuro. Por fim, no caso do python, adquiri conhecimentos em orientação ao objeto, manipulação de arquivos, requests, Pandas, log e tratamento de exceções. 

