### PROXY DESIGN PATTERN
___

### Properties
- **Structural** design pattern
- Used when you want to **control access to an object**, acting as a placeholder for another object.
- Introduces a surrogate or placeholder to control access to the real object.

### Implementation
- Involves the creation of a proxy class that has the same interface as the real object.
- The proxy class manages the reference to the real object, controlling its instantiation and access.
- Types of proxies include virtual proxies, protection proxies, and remote proxies.

### Advantages
- Provides a level of control over the access and manipulation of the real object.
- Enables additional functionalities, such as lazy loading and access control.
- Enhances security by restricting direct access to the real object.

### Disadvantages
- Introduces an additional layer, potentially impacting performance.
- Requires careful design to avoid introducing complexity and potential maintenance challenges.

### Use Case
- The Proxy design pattern is suitable when you need to add a layer of control or functionality to the access of an object, such as implementing lazy loading for resource-intensive objects.

### Example Scenario
- Imagine a scenario where you have a large image file, and loading it every time is resource-intensive. A proxy object can be used to load the image only when necessary, optimizing performance.

### Application
- Commonly employed in scenarios involving remote communication, access control, and situations where the real object instantiation is resource-intensive.
