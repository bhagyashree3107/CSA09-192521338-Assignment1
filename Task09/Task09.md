# Task 9 – Abstract Classes and Interfaces

## 1. Abstract Class

An abstract class is a class that cannot be instantiated directly. It can contain abstract methods and concrete methods.

In this program, Vehicle is an abstract class. It contains the abstract method `calculateFee()` and the concrete method `displayDetails()`.

## 2. Interfaces

An interface defines a contract that implementing classes must follow.

This program uses:
- `Chargeable`: defines the battery charging behaviour.
- `Payable`: defines the payment behaviour.

The ElectricCar class implements Chargeable, while TwoWheeler and Car implement Payable.

## 3. Multiple Interfaces

Java allows a class to implement multiple interfaces. This supports multiple behaviours without multiple class inheritance.

## 4. Default and Static Interface Methods

- `paymentStatus()` is a default method with an implementation inside the Payable interface.
- `paymentInfo()` is a static method called using the interface name.

## 5. Conclusion

This task demonstrates abstraction, interfaces, multiple interface implementation, and default and static interface methods in Java.