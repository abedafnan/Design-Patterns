# Software Design Patterns
Implementation examples of the most common object oriented design patterns. 

### Creational Design Patterns:
They are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the 
situation, which increase flexibility and reuse of existing code.

##### Factory 
Using the Factory pattern we create objects without exposing the instantiation logic to the client and refer to the 
newly created object through a common interface.

##### Builder & Step Builder
The Builder design pattern helps to separate the construction of a complex object from its representation. 
The Step Builder is the same as the normal Builder pattern in addition to guiding the user through ordered steps for
object creation

##### Singleton
It's a design pattern that restricts the instantiation of a class to one "single" instance, which is useful when 
exactly one object is needed to coordinate actions across the system (e.g. DB or Network connection).

##### Factory Method
This pattern uses factory methods to deal with the problem of creating objects without having to specify the exact class 
of the object that will be created. So, we just define a factory method for creating an object in the superclass but let 
the subclasses decide which class to instantiate or what code to add.

### Behavioral Design Patterns:
They are design patterns that identify common communication patterns among objects or parts of the application.

##### Observer
Observer Pattern defines one-to-many dependency between objects so that when one object changes state, all its dependents 
are notified and updated automatically.

##### Data Bus
* Data Bus Pattern Allows sending messages/events between components of an application without them knowing about each other.
* It is similar to the Observer pattern but supports many-to-many communication.

##### Strategy
The Strategy Pattern is used in situations when classes differ in their behavior.Isolates different algorithm in separate 
classes in order to have the ability to select different algorithms at runtime.

##### Command
* The Command design pattern encapsulates commands in objects allowing us to issue requests without knowing the 
requested operation or the requesting object.
* It provides options to queue commands, undo/redo actions or do other manipulations.

##### State
* The State design pattern allow an object to change its behavior without changing its class (will keep the code free 
of the many if/else statements). This is achieved by creating objects that represent various states and a context object 
whose behavior varies as its state object changes. 
* It's similar to the concept of finite-state machines.

##### Iterator 
An Iterator is an object that provides a standard way to examine all elements of any collection (
without exposing their different implementations).

##### Visitor
The Visitor pattern represents an operation to be performed on the elements of the object structure. It
lets you define a new operation without changing the classes of the elements on which it operates (Allow new
operations without coupling)

##### Memento
Using the Memento design pattern, we can save a snapshot of the state of an object for possible later use.

##### Chain of Responsibility
This pattern allows a request to be sent from one object to another, to be handled, making them parts of a chain, 
without knowing what object will receive and handle that request.

### Structural Design Patterns:
They are design patterns that make the design process easier by identifying a simple way to realize relationships among 
entities.

##### Facade
Facade defines a higher-level interface to a set of interfaces in a subsystem that makes the subsystem easier to use.

[To Be Continued ..]