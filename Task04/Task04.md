# Task 4 – Classes, Objects and Constructors

## 1. Objective

To understand classes, objects, instance variables, methods, constructors, constructor overloading, the `this` keyword, and constructor chaining using the Campus Smart-Parking System.

## 2. Class and Object

A class is a blueprint used to create objects. An object is an instance of a class.

In this program, `Vehicle` is the class, and `v1`, `v2`, `v3`, and `v4` are objects.

## 3. Instance Variables and Methods

The Vehicle class contains:

- `regNo`: stores the registration number.
- `vehicleType`: stores the type of vehicle.
- `parkingFee`: stores the parking fee.
- `displayDetails()`: displays vehicle information.

Instance variables belong to individual objects.

## 4. Constructors

A constructor initializes an object when it is created.

### No-argument constructor

```java
Vehicle() {
    this("UNKNOWN", "Not specified", 0.0);
}
```

### Parameterized constructor

```java
Vehicle(String regNo) {
    this(regNo, "Car", 0.0);
}
```

### Constructor overloading

Multiple constructors with different parameter lists are defined in the same class. This allows objects to be initialized in different ways.

## 5. The this Keyword

The `this` keyword refers to the current object.

Example:

```java
this.regNo = regNo;
```

It distinguishes the instance variable from the constructor parameter.

## 6. Constructor Chaining

Constructor chaining is the process of calling one constructor from another constructor using `this()`.

The call must be the first statement in the constructor.

## 7. Copy Constructor

A copy constructor creates a new object using the values of an existing object.

In this program, `Vehicle(Vehicle other)` copies the registration number, vehicle type, and parking fee.

## 8. Object References and Memory

When an object is created using `new`, Java creates an object in heap memory.

When one reference is assigned to another, both references point to the same object.

Example:

```java
Vehicle v5 = v3;
```

Changing the object through `v5` also affects the values accessed through `v3`.

A copy constructor, on the other hand, creates a separate object.

## 9. Conclusion

This task demonstrates object-oriented programming concepts using a Vehicle class. Constructor overloading and constructor chaining provide flexible object initialization, while the `this` keyword helps refer to the current object. Copy constructors demonstrate how separate objects can be created using existing object values.