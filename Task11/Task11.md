# Task 11 – Complete Campus Smart-Parking System

## 1. System Overview

The Campus Smart-Parking System manages vehicle parking, slot allocation, vehicle release and parking fee calculation.

## 2. Classes Used

### Vehicle
- Stores registration number and vehicle type.
- Calculates parking fees based on vehicle type.

### ParkingSystem
- Maintains parking slots using a 2D array.
- Allocates available slots.
- Releases parked vehicles.
- Calculates and maintains the daily collection.
- Displays parking slot status.

## 3. Data Structures Used

A 2D array of Vehicle objects is used to represent parking floors and slots.

- Each row represents a floor.
- Each column represents a parking slot.
- A null value indicates an empty slot.

## 4. Algorithms

### Vehicle Allocation
1. Traverse each floor.
2. Check each parking slot.
3. If a slot is null, allocate the vehicle.
4. If no empty slot is found, display Parking Full.

### Vehicle Release
1. Search for the registration number.
2. If found, calculate the parking fee.
3. Add the fee to the daily collection.
4. Set the slot to null.
5. If not found, display Vehicle not found.

## 5. Complexity Analysis

Let F represent the number of floors and S represent the maximum number of slots per floor.

| Operation | Time Complexity |
|---|---|
| Vehicle allocation | O(F × S) |
| Vehicle release | O(F × S) |
| Display parking slots | O(F × S) |
| Fee calculation | O(1) |

Space complexity: O(F × S), for storing the parking slots.

## 6. Testing

| Test Case | Expected Result |
|---|---|
| Park a vehicle in an empty slot | Vehicle allocated |
| Park vehicles until all slots are full | Parking Full message |
| Release an existing vehicle | Vehicle released and fee calculated |
| Release a non-existing vehicle | Vehicle not found message |
| Park after releasing a vehicle | Newly available slot allocated |

## 7. Object-Oriented Programming Concepts

- Encapsulation: Vehicle and ParkingSystem organize data and operations.
- Abstraction: Parking operations are provided through methods.
- Inheritance and polymorphism: Demonstrated in earlier tasks; this simplified implementation uses a common Vehicle class.

## 8. Limitations

The current implementation uses a fixed-size 2D array and does not permanently store parking records. The daily collection is maintained only while the program is running.

## 9. Conclusion

The project demonstrates how Java classes, objects, arrays, loops, conditions and methods can be combined to create a basic real-world parking management system.