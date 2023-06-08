# Padrões de Projetos de Sistemas (Design Pattern)

- Código de cada padrão consta no seu respectivo diretório
- Dentro dos diretórios, no README.md, consta também a descrição do exemplo realizado e o diagrama de classes novamente

<table>
  <thead>
    <tr>
      <th>Padrão</th>
      <th>Antipadrão</th>
      <th>Descrição</th>
      <th>Problema Resolvido</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Strategy</td>
      <td>Herança</td>
      <td>Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Permite que o algoritmo varie independentemente dos clientes que o utilizam.</td>
      <td>Permite escolher um algoritmo em tempo de execução, evitando a necessidade de múltiplos condicionais para lidar com diferentes comportamentos.</td>
    </tr>
    <tr>
      <td>Observer</td>
      <td>Acoplamento excessivo</td>
      <td>Define uma dependência um-para-muitos entre objetos, de forma que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.</td>
      <td>Permite o desacoplamento entre o sujeito observado e os observadores, permitindo que diferentes objetos sejam notificados de mudanças de estado sem que precisem conhecer uns aos outros.</td>
    </tr>
    <tr>
      <td>Composite</td>
      <td>Tratamento diversificado de classes</td>
      <td>Permite que objetos sejam agrupados em estruturas de árvore para representar hierarquias parte-todo. Os clientes podem tratar objetos individuais e composições de forma uniforme.</td>
      <td>Resolve o problema de tratar objetos individuais e coleções de objetos de maneira uniforme, permitindo que os clientes sejam indiferentes à diferença entre objetos individuais e composições.</td>
    </tr>
    <tr>
      <td>Singleton</td>
      <td>Diversas instâncias da mesma classe</td>
      <td>Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso para ela.</td>
      <td>Resolve o problema de garantir que uma classe tenha apenas uma instância, útil quando é necessário compartilhar uma única instância em todo o sistema.</td>
    </tr>
    <tr>
      <td>Facade</td>
      <td> Classe Fachada sobrecarregada de funcionalidades/responsabilidades</td>
      <td>Fornece uma interface simplificada para um conjunto complexo de subsistemas, tornando mais fácil de usar e reduzindo a dependência entre o cliente e os subsistemas.</td>
      <td>Resolve o problema de complexidade desnecessária, fornecendo uma fachada que encapsula a funcionalidade dos subsistemas e fornece uma interface simples para o cliente.</td>
    </tr>
  </tbody>
</table>

## Strategy
![UML Strategy](https://github.com/SoSoJigsaw/bertoti/blob/main/Padroes%20de%20Projeto/Strategy/UML/Strategy2.jpg)

## Observer
![UML Observer](https://github.com/SoSoJigsaw/bertoti/blob/main/Padroes%20de%20Projeto/Observer/UML/Observer2.jpg)

## Composite
![UML Composite](https://github.com/SoSoJigsaw/bertoti/blob/main/Padroes%20de%20Projeto/Composite/UML/Composite2.jpg)

## Singleton
![UML Singleton](https://github.com/SoSoJigsaw/bertoti/blob/main/Padroes%20de%20Projeto/Singleton/UML/Singleton2.jpg)

## Facade
![UML Facade](https://github.com/SoSoJigsaw/bertoti/blob/main/Padroes%20de%20Projeto/Facade/UML/Facade2.jpg)

## Combining Patterns
![UML Combining Patterns](https://github.com/SoSoJigsaw/bertoti/blob/main/Padroes%20de%20Projeto/Combining%20Patterns/UML/Patterns2.jpg)
