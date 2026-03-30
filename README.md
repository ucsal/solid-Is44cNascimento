<img width="12" height="12" alt="image" src="https://github.com/user-attachments/assets/d30e60bb-4e76-4dd4-8dcd-af3466ef0587" /> ESTRUTURA DE PASTAS

A estrutura da pasta foi organizada por Package by Feature, onde cada pasta representa um conjunto de funcionalidades semelhantes.
Assim diminuindo o acoplamento entre as classes, e aumentando a coesão.

DEFINIÇÃO PACKAGE BY FEATUARE:é um estilo de arquitetura de software que organiza o 
código agrupando arquivos (classes, controllers, serviços)
por funcionalidade de negócio, em vez de camadas técnicas


APLICAÇÂO DO SOLID

Os cinco princípios são:

S - Single Responsibility Principle (Princípio da Responsabilidade Única): Uma classe deve ter um, e apenas um, motivo para mudar.

O - Open/Closed Principle (Princípio Aberto-Fechado): Entidades de software (classes, módulos, funções) devem estar abertas para extensão, mas fechadas para modificação.

L - Liskov Substitution Principle (Princípio da Substituição de Liskov): Objetos de uma classe derivada (subclasse) devem poder substituir objetos da classe base (superclasse) sem quebrar o programa.

I - Interface Segregation Principle (Princípio da Segregação de Interfaces): Uma classe não deve ser forçada a depender de interfaces ou métodos que não utiliza.

D - Dependency Inversion Principle (Princípio da Inversão de Dependência): Módulos de alto nível não devem depender de módulos de baixo nível; ambos devem depender de abstrações. 


APP: Anteriormente essa classe possuia varias funções atribuidas, aplicando o principio 'Single Responsibility Principle' (Princípio da Responsabilidade Única)
foi criado uma classe para cada função, e funções foram tranferidas para outras classes existentes.


O - Open/Closed Principle (Princípi o Aberto-Fechado): Todas as classes possuem atributos Private 
que podem ser acessados através de subclasses publicas


Seed: a semente da tabela virou uma classe idependente para seguir o princípio "S".


Tabuleiro: a classe tabuleiro virou uma interface que pode ser implementada no codigo 

Config: Inicialmente a proposta era se o local onde ficaria a "configuração", que seriam os dados inicias.






