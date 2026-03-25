APLICAÇÂO DO SOLID

Os cinco princípios são:
S - Single Responsibility Principle (Princípio da Responsabilidade Única): Uma classe deve ter um, e apenas um, motivo para mudar.
O - Open/Closed Principle (Princípio Aberto-Fechado): Entidades de software (classes, módulos, funções) devem estar abertas para extensão, mas fechadas para modificação.
L - Liskov Substitution Principle (Princípio da Substituição de Liskov): Objetos de uma classe derivada (subclasse) devem poder substituir objetos da classe base (superclasse) sem quebrar o programa.
I - Interface Segregation Principle (Princípio da Segregação de Interfaces): Uma classe não deve ser forçada a depender de interfaces ou métodos que não utiliza.
D - Dependency Inversion Principle (Princípio da Inversão de Dependência): Módulos de alto nível não devem depender de módulos de baixo nível; ambos devem depender de abstrações. 


APP: Anteriormente essa classe possuia varias funções atribuidas, aplicando o principio 'Single Responsibility Principle' (Princípio da Responsabilidade Única)
foi criado uma classe para cada função, e funções foram tranferidas para outras classes existentes.

