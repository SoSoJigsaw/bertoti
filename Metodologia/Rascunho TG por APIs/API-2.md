## Análise da Estrutura do Projeto

### pom.xml

O arquivo `pom.xml` é a espinha dorsal do projeto Maven, gerenciando todas as dependências e configurações necessárias para a construção e execução da aplicação. Nele, especificamos:

- **GroupId, ArtifactId e Version:** Identificadores únicos para o projeto, facilitando o gerenciamento de versões e a organização do código.
- **Dependencies:** Inclui uma lista abrangente de dependências como `javafx- controls`, `javafx- graphics`, `javafx- base`, `spring- boot- starter- web`, `spring- boot- starter- security`, entre outras. Essas dependências são essenciais para fornecer funcionalidades adicionais ao projeto, como suporte a JavaFX para interfaces gráficas e Spring Boot para desenvolvimento de serviços RESTful.
- **Plugins:** Configurações de plugins como `maven- compiler- plugin` para especificar a versão do Java utilizada (11), e `javafx- maven- plugin` para facilitar a execução de aplicações JavaFX. O `maven- assembly- plugin` também é configurado para criar artefatos executáveis com todas as dependências incluídas.

### Styles.css

O arquivo `Styles.css` define a aparência e o comportamento de elementos da interface gráfica desenvolvida com JavaFX. Especificamente:

- **Estilos para Table- View:** Define cores de fundo, bordas e comportamentos de células em tabelas, garantindo uma interface visualmente coesa e de fácil leitura. Utiliza seletores como `.table- view`, `.table- row- cell`, e `.table- cell` para aplicar estilos específicos.
- **Personalização de Componentes:** Customiza a aparência de componentes como cabeçalhos de colunas, células selecionadas e placeholders. Isso inclui definições de cores, fontes, alinhamentos e efeitos de hover e seleção.

### ClienteDTO.java

A classe `ClienteDTO` (Data Transfer Object) é utilizada para encapsular dados de clientes de forma estruturada. Principais aspectos:

- **Atributos:** Define atributos como `id`, `nome`, `email`, `telefone`, entre outros, com seus respectivos getters e setters.
- **Construtores:** Fornece construtores sobrecarregados para facilitar a criação de objetos `ClienteDTO` com diferentes conjuntos de dados.
- **Métodos de Utilidade:** Inclui métodos como `toString()`, `equals()` e `hashCode()` para suporte a operações comuns de comparação e exibição.

### ClienteDAO.java

A classe `ClienteDAO` (Data Access Object) é responsável pela interação com o banco de dados para operações relacionadas a clientes. Funcionalidades principais:

- **Conexão com Banco de Dados:** Gerencia a conexão com o banco de dados utilizando JDBC.
- **Operações CRUD:** Implementa métodos para criar (`createCliente`), ler (`getClienteById`, `getAllClientes`), atualizar (`updateCliente`) e deletar (`deleteCliente`) registros de clientes.
- **Consultas SQL:** Utiliza consultas SQL parametrizadas para garantir segurança contra ataques de injeção SQL e eficiência nas operações de banco de dados.

### BronzeDAO.java

Similar a `ClienteDAO`, a classe `BronzeDAO` gerencia operações relacionadas à entidade Bronze. Especificidades incluem:

- **Atributos Específicos:** Além dos métodos CRUD padrão, pode incluir operações adicionais específicas para a lógica de negócio associada à entidade Bronze.
- **Otimização de Consultas:** Escreve consultas SQL otimizadas para operações que envolvem grandes volumes de dados, utilizando índices e joins eficientes.

### ComentarioController.java

A classe `ComentarioController` gerencia as requisições HTTP relacionadas a comentários. Principais funcionalidades:

- **Anotação @RestController:** Indica que a classe é um controlador REST, permitindo o mapeamento de endpoints HTTP.
- **Endpoints CRUD:** Define endpoints para operações de criação (`@PostMapping`), leitura (`@GetMapping`), atualização (`@PutMapping`) e exclusão (`@DeleteMapping`) de comentários.
- **Injeção de Dependências:** Utiliza injeção de dependências para acessar serviços relacionados a comentários, promovendo uma arquitetura modular e testável.

### UsuarioController.java

Responsável por gerenciar operações relacionadas a usuários, `UsuarioController` implementa:

- **Autenticação e Autorização:** Endpoints para login (`/login`), registro (`/register`) e gerenciamento de perfis de usuário.
- **Segurança:** Integra Spring Security para proteger endpoints sensíveis e gerenciar sessões de usuário de forma segura.
- **Validação de Dados:** Utiliza anotações como `@Valid` para validar dados de entrada, assegurando a integridade e consistência das informações manipuladas.

### CrudClienteController.java

A classe `CrudClienteController` combina funcionalidades de `ClienteDTO` e `ClienteDAO` para fornecer operações CRUD completas para a entidade Cliente. Funcionalidades incluem:

- **Mapeamento de Endpoints:** Define endpoints RESTful para operações de clientes, facilitando a integração com o front- end.
- **Serviços Auxiliares:** Utiliza serviços auxiliares para lógica de negócio complexa, promovendo uma separação clara de responsabilidades e um código mais manutenível.

### Main.java

O ponto de entrada da aplicação JavaFX, `Main.java` é responsável por:

- **Configuração Inicial:** Configura e inicializa a aplicação JavaFX, definindo a cena principal e carregando o layout a partir de arquivos FXML.
- **Launch Method:** Invoca o método `launch()` para iniciar a aplicação, configurando parâmetros iniciais e gerenciando o ciclo de vida da aplicação.

### LoginController.java

Gerencia a lógica de autenticação de usuários, `LoginController` inclui:

- **Formulários de Login:** Manipula entradas de usuário para login, validando credenciais e iniciando sessões de usuário.
- **Mensagens de Erro:** Fornece feedback ao usuário em casos de falha de autenticação, melhorando a usabilidade.
- **Sessões de Usuário:** Garante a segurança das sessões de usuário, utilizando tokens de autenticação e técnicas de hashing para armazenar senhas de forma segura.

### IntroducaoController.java

Responsável pela tela de introdução da aplicação, `IntroducaoController` gerencia:

- **Elementos Visuais:** Configura e manipula elementos visuais da tela de introdução, proporcionando uma experiência inicial amigável para o usuário.
- **Navegação:** Facilita a navegação para outras partes da aplicação, integrando- se com o roteamento da interface.

### ProdutoController.java

A classe `ProdutoController` gerencia operações relacionadas a produtos, incluindo:

- **Endpoints RESTful:** Implementa endpoints para criação, leitura, atualização e exclusão de produtos.
- **Validação e Negócio:** Integra lógica de negócio específica para produtos, validando dados e aplicando regras de negócio antes de persistir informações no banco de dados.

### HelloApplication.java

Uma classe de exemplo que demonstra a configuração básica e inicialização de uma aplicação JavaFX. Inclui:

- **Setup Inicial:** Configuração mínima para iniciar uma aplicação JavaFX, incluindo a definição de cenas e elementos de interface.
- **Boas Práticas:** Serve como referência para estruturar classes principais de aplicações JavaFX, destacando boas práticas de organização e inicialização de componentes.

### CrudAtivacaoController.java

Gerencia operações CRUD específicas para a entidade Ativação, integrando funcionalidades de DTO e DAO para manipulação de dados de ativação:

- **Endpoints e Serviços:** Define endpoints RESTful e serviços para operações de ativação, promovendo a reutilização de lógica comum e a manutenção de um código limpo.
- **Integração de Dados:** Utiliza PL/SQL para operações de banco de dados, garantindo a eficiência e a integridade das operações de ativação.

---
