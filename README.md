#API RESTful Java Spring Boot

##Diagrama de Classes
```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +List~Feature~ features
        +List~Card~ card
        +List~News~ news
    }

    class Account {
        +String number
        +String agency
        +Float balance
        +Float limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +Float limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" --> "1" Account : has
    User "1" --> "*" Feature : has
    User "1" --> "*" Card : has
    User "1" --> "*" News : has
```
