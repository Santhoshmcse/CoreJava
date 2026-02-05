Abstract Class vs Interface (Mid-Level)
Abstract Class

Can have constructors

Can have instance variables

Can contain abstract and concrete methods

Supports single inheritance

When to Use

When classes share common state

When base class needs default behavior

Interface

No constructors

Cannot hold instance variables

Methods are public by default

Supports multiple inheritance

When to Use

When multiple inheritance is required

When defining a contract

Key Differences
Feature	Abstract Class	Interface
Constructors	Yes	No
Multiple Inheritance	No	Yes
Method Implementation	Yes	Java 8+ default methods
Variables	Instance variables allowed	public static final only
Interview Tip

Prefer interface for behavior contracts.
Prefer abstract class when sharing state and base functionality.
