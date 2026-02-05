OOP Concepts in Java (Mid-Level)
1. Encapsulation

Encapsulation is the practice of wrapping data and methods into a single unit (class) and restricting direct access to data.

Why Encapsulation?

Protects data from invalid states

Enforces business rules

Improves maintainability

Example

A BankAccount class hides balance and exposes controlled methods like deposit() and withdraw().

2. Abstraction

Abstraction hides implementation details and exposes only behavior.

Implemented using:

Abstract classes

Interfaces

Why Abstraction?

Focus on what object does, not how

Enables loose coupling

Example

Payment abstract class defines pay() method without implementation.

3. Inheritance

Inheritance allows one class to acquire properties and behavior of another class.

Why Inheritance?

Code reuse

Establishes "is-a" relationship

Example

CreditCardPayment extends Payment.

4. Polymorphism

Same method behaves differently based on object type.

Achieved using:

Method overriding

Why Polymorphism?

Runtime flexibility

Cleaner design

Example

Calling pay() on Payment reference executes child implementation.

Interview Notes

Prefer composition over inheritance

Use interfaces for contracts

Keep classes small and focused

Summary

Encapsulation → Data protection
Abstraction → Hide details
Inheritance → Reuse
Polymorphism → Flexibility
