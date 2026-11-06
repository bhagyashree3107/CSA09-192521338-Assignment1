# Task 2 – Java Data Types, Arrays, and Type Conversion

## 1. Objective

To understand Java data types, arrays, type conversion, and user input using the Campus Smart-Parking System scenario.

## 2. Data Types

Java provides primitive data types such as `int`, `double`, `char`, and `boolean`.

- `int` stores whole numbers, such as the number of vehicles.
- `double` stores decimal values, such as parking fees.
- `char` stores a single character, such as a vehicle category.
- `boolean` stores `true` or `false`, such as whether a slot is available.

## 3. Array Representations

### One-dimensional array

A one-dimensional array stores values in a linear sequence.

Example:

```java
int[] floorCapacity = {10, 15, 20};
```

It stores the capacity of each parking floor.

### Two-dimensional array

A two-dimensional array represents data using rows and columns.

Example:

```java
int[][] parkingSlots = {
    {1, 0, 1},
    {0, 1, 1}
};
```

Each row can represent a floor, and each column can represent a parking slot.

### Jagged array

A jagged array is a two-dimensional array in which each row can have a different length.

Example:

```java
int[][] jaggedSlots = {
    {1, 0},
    {1, 1, 0},
    {0, 1, 1, 1}
};
```

This is useful when different parking floors have different numbers of slots.

## 4. Type Conversion

### Widening conversion

Widening conversion converts a smaller compatible type into a larger type. It is generally performed automatically.

```java
int number = 10;
double result = number;
```

### Narrowing conversion

Narrowing conversion converts a larger type into a smaller type. Explicit casting is required.

```java
double value = 15.75;
int result = (int) value;
```

The result is `15`; the fractional part is discarded.

## 5. Integer Division and Casting

When two integers are divided in Java, the result is an integer.

```java
int result = 100 / 3;
```

The result is `33`.

To obtain a decimal result, at least one operand must be converted to a floating-point type before division.

```java
double result = (double) 100 / 3;
```

The result is approximately `33.3333`.

## 6. Scanner and Command-Line Arguments

`Scanner` is used to read input while the program is running.

```java
Scanner sc = new Scanner(System.in);
int hours = sc.nextInt();
```

Command-line arguments are supplied when the program is launched. They are received as strings through the `String[] args` parameter of the `main` method.

For example:

```java
public static void main(String[] args) {
    int hours = Integer.parseInt(args[0]);
}
```

`Scanner` is convenient for interactive input, while command-line arguments are useful when input is supplied at program launch.

## 7. Conclusion

This task demonstrates Java primitive data types, one-dimensional arrays, two-dimensional arrays, jagged arrays, type conversion, integer division, and input methods. These concepts can be used to represent parking floors, slot capacities, and parking fee calculations.