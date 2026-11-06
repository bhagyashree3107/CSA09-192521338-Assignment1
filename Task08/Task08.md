# Task 8 – Compile-Time and Runtime Polymorphism

## 1. Compile-Time Polymorphism

Compile-time polymorphism is achieved through method overloading.

In this program, the `calculateFee()` method has two versions:
- `calculateFee(int hours)`
- `calculateFee(int hours, double rate)`

The compiler selects the appropriate method based on the arguments.

## 2. Runtime Polymorphism

Runtime polymorphism is achieved through method overriding.

The TwoWheeler, Car and ElectricCar classes override the `calculateFee()` method of the Vehicle class.

## 3. Dynamic Method Dispatch

A parent class reference can refer to child class objects.

In this program, a `Vehicle` array stores TwoWheeler, Car and ElectricCar objects. When `calculateFee()` is called, Java executes the overridden method belonging to the actual object.

## 4. Conclusion

This program demonstrates method overloading, method overriding, parent class references, arrays of objects and dynamic method dispatch.