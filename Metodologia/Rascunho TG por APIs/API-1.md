## Análise da Estrutura do Projeto

O projeto é composto por diversos scripts Python, cada um responsável por uma parte específica do processo de coleta, processamento e visualização dos dados. Abaixo está uma descrição detalhada de cada um dos principais scripts e sua função dentro do projeto:

### run.py

Este arquivo é o ponto de entrada da aplicação Flask. Ele inicializa o servidor e configura- o para rodar na porta 8080, permitindo que a aplicação web esteja acessível para os usuários.

### MyForms.py

Define os formulários utilizados na aplicação Flask para a entrada de dados dos usuários. Utiliza Flask- WTF para criar campos de formulário para o município, data inicial e data final, e um botão de submissão.

### vacinacao_estatisticas.py

Este script é responsável pela coleta e processamento de dados de vacinação. Ele automatiza a leitura de arquivos CSV contendo estatísticas de vacinação, renomeia colunas e linhas, e exporta os dados tratados para um novo arquivo CSV. A limpeza e transformação dos dados garantem que as análises sejam baseadas em informações precisas e atualizadas.

### srag_covid.py

Processa dados de Síndrome Respiratória Aguda Grave (SRAG) relacionados à COVID- 19. O script filtra os dados para incluir apenas casos de COVID- 19 no estado de São Paulo, renomeia colunas para um formato mais amigável e exporta os dados tratados para um arquivo CSV. Este processamento é crucial para focar a análise nos casos relevantes de COVID- 19.

### covid_estado_sp.py

Trata dados de COVID- 19 no estado de São Paulo. O script combina dados de duas fontes diferentes, realiza operações de limpeza e transformação, e exporta um dataframe consolidado que inclui informações sobre casos totais, casos diários, óbitos diários e totais. Esta combinação de dados fornece uma visão abrangente da situação da pandemia no estado.

### covid_municipios_sp.py

Processa dados de COVID- 19 nos municípios de São Paulo. O script agrupa dados municipais e inclui informações adicionais de regiões mesorregião e microrregião, proporcionando uma análise detalhada por município. A inclusão de dados regionais ajuda a identificar padrões e tendências em diferentes partes do estado.

### leitos_uti_enfermaria.py

Analisa a ocupação de leitos de UTI e enfermaria. O script coleta dados sobre a ocupação de leitos, número de internações e outros indicadores críticos, renomeia colunas e exporta os dados tratados para um arquivo CSV. Esta análise é fundamental para monitorar a capacidade do sistema de saúde durante a pandemia.

### vacinometro_sp.py

Trata dados de vacinação, consolidando informações de diferentes fontes sobre doses aplicadas e distribuídas. O script automatiza a leitura de arquivos CSV, realiza operações de limpeza e transformação, e exporta um dataframe consolidado. Este processo garante que os dados de vacinação estejam sempre atualizados e prontos para análise.

### Dfs_configs.py

Configura e importa dados de várias fontes. Este script lê dados de URLs e os carrega em dataframes, preparando- os para análises subsequentes. A configuração centralizada facilita a atualização dos dados e a manutenção do projeto.

### evolucao_aplicacao_doses.py

Processa dados de evolução da aplicação de doses de vacina. O script agrupa dados diários sobre a aplicação de diferentes doses, realiza operações de limpeza e transformação, e exporta um dataframe tratado. Este processamento permite acompanhar a evolução da campanha de vacinação ao longo do tempo.

### isolamento_social.py

Processa dados de índices de isolamento social. O script automatiza a leitura de arquivos CSV, renomeia colunas e realiza operações de limpeza e transformação para garantir a precisão dos dados. A análise dos índices de isolamento social é importante para entender a adesão às medidas de distanciamento durante a pandemia.

### DateFilter.py

Contém funções para filtragem de dados com base em intervalos de datas. Este script valida as datas fornecidas pelos usuários, garantindo que as análises sejam realizadas dentro de um intervalo de tempo válido. A filtragem de datas permite análises temporais precisas e customizadas.

### StringEquivalent.py

Contém funções para manipulação de strings e filtragem de dados por município. Este script é responsável por tratar nomes de municípios, removendo acentos e padronizando os formatos, o que facilita a busca e comparação de dados. Ele também inclui funções que permitem a filtragem dos dados por município, proporcionando uma análise detalhada para localidades específicas.

### DadosComp.py

Script para análise e comparação de dados de COVID- 19, vacinação e leitos. Este script realiza diversas análises comparativas utilizando os dados importados de várias fontes. Ele calcula métricas como a taxa de incidência de casos, a taxa de letalidade, a evolução da aplicação de doses de vacina, e a ocupação de leitos hospitalares. Estas análises são essenciais para entender a situação da pandemia e a eficácia das medidas de controle.

---
