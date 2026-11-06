# Task 5 – Static Members, Object Lifecycle and Garbage Collection

## 1. Objective

To understand static variables, instance variables, static methods, static blocks, object lifecycle, garbage collection, and passing and returning object references in Java.

## 2. Static Variables

Static variables belong to the class and are shared among all objects.

Example:

```java
static int facilityCount = 0;
static int totalOccupied = 0;
```

These variables maintain the total number of parking facilities and the total number of parking operations in the demonstration.

## 3. Instance Variables

Instance variables belong to individual objects.

Example:

```java
int occupiedSlots;
```

Each parking facility maintains its own occupied-slot count.

## 4. Static Block

A static block executes only once when the class is initialized.

It is commonly used for initializing static data.

## 5. Static Method

A static method belongs to the class rather than an individual object.

Example:

```java
ParkingFacility.displayTotal();
```

It can be called using the class name without creating an additional object.

## 6. Passing and Returning Object References

An object reference can be passed as an argument to a method. Java passes the reference value by value. The method can modify the object through that reference.

A method can also return an object reference, allowing the calling method to access the returned object.

## 7. Object Lifecycle and Garbage Collection

An object is created using the `new` keyword.

When an object is no longer reachable through any active reference, it becomes eligible for garbage collection.

Setting a reference to `null` may make an object eligible for garbage collection, but it does not immediately destroy the object.

The Java garbage collector automatically manages unused objects.

## 8. Static vs Instance Variables

| Static Variable | Instance Variable |
|---|---|
| Belongs to the class | Belongs to an object |
| Shared among objects | Separate for each object |
| One shared copy | Each object has its own copy |
| Accessed using class name | Accessed using object reference |

## 9. Conclusion

This task demonstrates how static members maintain shared information, while instance variables maintain individual object information. It also explains object references, object lifecycle, and automatic garbage collection in Java.