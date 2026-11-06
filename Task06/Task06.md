# Task 6 – Inheritance and super Keyword

## 1. Objective

To understand inheritance, parent and child classes, the `super` keyword, constructor execution order, and UML class diagrams using the Campus Smart-Parking System.

## 2. Inheritance

Inheritance is an object-oriented programming concept in which one class acquires the properties and methods of another class.

In this program, `Vehicle` is the parent class. `TwoWheeler` and `Car` inherit from it. `ElectricCar` inherits from `Car`.

## 3. Types of Inheritance

**Hierarchical inheritance:** Two or more child classes inherit from the same parent class. Here, TwoWheeler and Car inherit from Vehicle.

**Multilevel inheritance:** A class inherits from another child class, forming an inheritance chain. Here, ElectricCar inherits from Car, and Car inherits from Vehicle.

Java supports multiple inheritance through interfaces, but not through multiple parent classes.

## 4. super Keyword

The `super` keyword refers to the immediate parent class.

Example:

```java
super(regNo);
```

It calls the parent class constructor and initializes the registration number.

## 5. Constructor Execution Order

When an ElectricCar object is created:

1. Vehicle constructor executes.
2. Car constructor executes.
3. ElectricCar constructor executes.

Parent constructors execute before child constructors.

## 6. UML Class Diagram

The UML diagram represents the inheritance relationship between Vehicle, TwoWheeler, Car, and ElectricCar. The hollow triangle arrow points towards the parent class.

## 7. Advantages of Inheritance

- Promotes code reusability.
- Reduces duplicate code.
- Makes programs easier to maintain.
- Supports method overriding and runtime polymorphism.

## 8. Conclusion

This task demonstrates hierarchical and multilevel inheritance using a parking system. The `super` keyword invokes parent constructors, and the UML diagram represents the relationships between vehicle classes.