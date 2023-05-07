# Combining Patterns

## Exemplo realizado
- <b>O projeto em questão é uma aplicação de gerenciamento de tarefas.</b>  

### Strategy
- O padrão Strategy será utilizado para implementar diferentes estratégias de ordenação das tarefas. Cada estratégia será uma classe que implementa uma interface com um método para ordenar as tarefas. O cliente da aplicação pode escolher qual estratégia utilizar para ordenar as tarefas.

### Observer
- O padrão Observer será utilizado para notificar os observadores quando uma nova tarefa for adicionada. A classe TaskSubject será a classe observada e a classe TaskObserver será a classe observadora.

### Composite
- O padrão Composite será utilizado para criar uma estrutura de árvore para as tarefas. Cada tarefa pode ter tarefas filhas.

### Singleton
- O padrão Singleton será utilizado para criar uma única instância da classe TaskSubjectImplSingleton, que é também implementada pelo Subject do Observer. Ele gerencia todas as tarefas da aplicação.

### Facade
- O padrão Facade será utilizado para fornecer uma interface simplificada para as funcionalidades da aplicação. A classe TaskFacade será a Facade da aplicação, fornecendo métodos para adicionar, remover e ordenar tarefas.

## Diagrama de Classes
![UML Combining Patterns](https://github.com/SoSoJigsaw/bertoti/blob/main/Padroes%20de%20Projeto/Combining%20Patterns/UML/Patterns.jpg)
