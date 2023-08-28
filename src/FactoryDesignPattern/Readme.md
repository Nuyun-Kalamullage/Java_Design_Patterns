## FACTORY DESIGN PATTERN
___
### Properties
- **Creational** design pattern
- Used when have **multiple subclasses** of super class & based on input we want to return as one class instance
- It provides abstraction between implementation & client classes
- Remove the instantiation of client classes from client code

`You can use this pattern when you want to create objects while abstracting the instantiation process.`

### Implementation
- Super class can be an interface or abstract class or basic class
- Factory class has a static method which returns the instance of Sub-class based on input

___

### Advantages
- Encourages good coding practices by promoting loose coupling.
- Provides a single point of control for creating objects.
- Enhances code maintainability and scalability.

### Disadvantages
- Can lead to increased complexity due to the number of classes.
- May require creating multiple classes for each product and factory.