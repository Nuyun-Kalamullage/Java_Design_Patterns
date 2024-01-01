## Prototype DESIGN PATTERN
___
### Properties
- **Creational** design pattern
- Used when you want to avoid **multiple Object Creation** of same instance.
- Using this we can copy the object to new object & then we can modify as per our need.
- We can Implement the Cloneable Interface and Override the clone method.

`The Prototype design pattern is applicable when you want to create objects while abstracting the instantiation process, providing a more flexible and dynamic approach to object creation.`

### Implementation
- Prototype design pattern involves creating new objects by copying an existing object, known as the prototype.
- The prototype is an interface or abstract class that declares the clone method.
- Concrete classes implement the clone method to create copies.

___

### Advantages
- Reduces the need for subclassing.
- Enables adding or removing objects at runtime.
- Improves performance by avoiding the cost of creating new instances.


### Disadvantages
- Requires implementing the clone method in all concrete classes.
- Deep cloning can be complex for objects with nested structures.


### Use Case
- Ideal when the cost of creating a new instance is more expensive than copying an existing one.
- Useful in scenarios where the object structure is complex or needs dynamic runtime changes.