# Task 1 – Understand the Problem and Identify the Objects

## 1. Problem Statement

The Campus Smart-Parking System is designed to manage vehicle parking within a university campus. The parking facility consists of multiple floors, each containing a fixed number of parking slots.

The system must allocate suitable parking slots to vehicles entering the campus, generate unique parking tickets, record entry times, calculate parking fees when vehicles leave, and release occupied slots.

The system supports two-wheelers, cars and electric vehicles. Students and staff with valid monthly passes are eligible for free parking, while visitors must pay the applicable parking fee.

## 2. Inputs and Outputs

### Inputs

- Vehicle registration number
- Vehicle type
- User category
- Parking entry time
- Parking exit time
- Monthly pass validity
- Number of floors
- Number of slots on each floor

### Outputs

- Allocated floor number
- Allocated slot number
- Unique parking ticket number
- Parking entry time
- Parking duration
- Calculated parking fee
- Updated parking availability
- Error message if no suitable parking slot is available

## 3. Candidate Classes and Responsibilities

| Candidate Class | Responsibility |
|---|---|
| Vehicle | Stores common vehicle details such as registration number |
| TwoWheeler | Represents a two-wheeler and its parking fee behaviour |
| Car | Represents a car and its parking fee behaviour |
| ElectricCar | Represents an electric car and charging capability |
| ParkingSlot | Represents an individual parking slot |
| ParkingFloor | Manages parking slots on a floor |
| ParkingFacility | Manages floors and parking allocation |
| ParkingTicket | Stores ticket number, vehicle and entry time |
| ParkingUser | Represents a student, staff member or visitor |
| ParkingPass | Represents parking pass details and validity |
| ParkingFeeCalculator | Calculates applicable parking charges |

Each class has a specific responsibility. This separation improves modularity, maintainability and extensibility.

## 4. Business Rules

1. A parking slot cannot hold more than one vehicle at a time.
2. A vehicle cannot be allocated a slot if no suitable slot is available.
3. Every parking ticket must have a unique ticket number.
4. A released slot must become available for another vehicle.
5. Parking fees depend on vehicle type and parking duration.
6. Students and staff with valid monthly passes park free of charge.
7. Visitors must pay the applicable parking fee.
8. Electric vehicles may use charging slots, which have separate charges.
9. A vehicle must have a valid active parking ticket to exit.
10. Duplicate vehicle registrations must not be accepted for simultaneous parking.

## 5. Assumptions

1. Every vehicle has a unique registration number.
2. The system records entry and exit times.
3. Parking duration is calculated in minutes.
4. Parking slots are numbered within each floor.
5. The facility uses a predefined allocation strategy to select available slots.
6. Invalid registrations, duplicate entries and invalid slot numbers are rejected.
7. Parking fee rates and slab rules are configurable.

## 6. Alternative Concept and Complexity Analysis

### Object-Based Design

In the object-oriented design, each vehicle is represented by a Vehicle object containing its registration number, vehicle type and other related attributes.

The vehicle can be stored in a collection of Vehicle references.

Searching for a vehicle by registration number using a linear search takes O(n) time in the worst case, where n is the number of vehicles.

The space required to store n vehicle objects is O(n).

### Parallel Arrays

An alternative is to store vehicle information in separate arrays:

- regNo[]
- type[]
- entryTime[]

A vehicle is identified using the same array index across all arrays.

Searching for a vehicle by registration number also takes O(n) time in the worst case.

Adding a new attribute requires creating another array and maintaining the same index across all arrays. This increases the possibility of data inconsistency.

### Comparison

The object-oriented design is preferred because it groups related data and behaviour into a single object. It is easier to extend with new vehicle attributes and behaviours.

Both approaches require O(n) space for storing n vehicles, but the object-oriented approach provides better modularity and maintainability.