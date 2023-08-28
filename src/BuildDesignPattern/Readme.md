## BUILDER DESIGN PATTERN
___
### Properties
- **Creational** design pattern
- Used when have **multiple Arguments** to send in Constructor & it's hard to maintain the order.
- It provides abstraction between implementation & client classes
- When we don't want to send all parameters in Object initialisation

`The Builder Design Pattern is employed when the goal is to generate objects while concealing the intricacies of their creation process.`

### Implementation
- We create a 'static nested class', which contains all arguments of outer class.
- As per naming convention, builder class name should be [Class_name]Builder.
- Builder class have a public constructor with all required parameters.
- Builder class should have methods for optional parameters. Method will return the Builder object. 
- A 'build()' method that will return the final Object.

___

### Advantages
- Promotes loose coupling by abstracting object creation. 
- Provides a centralized point for controlling the creation process. 
- Enhances code maintainability and scalability by encapsulating object creation logic.

### Disadvantages
- The pattern might introduce a larger number of classes, increasing complexity. 
- Each new product requires creating corresponding classes in the factory and product hierarchy.