# Task 7 – Method Overriding, final Keyword and Object Class Methods

## 1. Method Overriding
Method overriding allows a subclass to provide its own implementation of a method inherited from its parent class.

In this program, `calculateFee()` is overridden in TwoWheeler, Car and ElectricCar classes.

The `@Override` annotation indicates that a method is being overridden.

## 2. final Keyword
The `final` keyword prevents modification or overriding.

- `final String regNo` prevents changing the registration number.
- `final getRegNo()` prevents subclasses from overriding the getter method.

## 3. Object Class Methods

- `equals()` compares two vehicle objects using their registration numbers.
- `hashCode()` generates a hash value using the registration number.
- `toString()` returns a readable representation of the vehicle.

## 4. Output and Result
The program calculates parking fees based on vehicle type and parking duration. It also demonstrates method overriding, the final keyword and Object class methods.

## 5. Conclusion
This task demonstrates runtime method overriding and the use of final members and commonly overridden Object class methods in Java.