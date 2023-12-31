## SINGLETON DESIGN PATTERN
___
### Properties
- **Creational** design pattern - class initiation design pattern
- **Only one instance** of the class should exist
- Other classes should be able to get instances of the Singleton class
- Used in Logging, Cache, Session, and Drivers

`You Can use this pattern when you want to maintain one/single instance with your class`

### Implementation
- Constructor should be private
- Public method for returning instance
- Instance type should be private static

___

### Types of Initialization
- Eager Initialisation
- Lazy Initialisation
- Thread safe Method Initialisation
- Thread safe block Initialisation