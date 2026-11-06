# Task 12 – Adapting the Smart-Parking System to Changed Requirements

## 1. Changed Requirements

The college introduced four new requirements:

1. E-bikes must pay a flat parking fee.
2. Delivery vans must pay twice the car parking rate between 9 AM and 5 PM.
3. Visitors must be able to purchase a one-day parking pass.
4. The parking facility must support 3 to 5 floors, with different numbers of slots on each floor.

## 2. Impact Analysis

| Requirement | Changes Needed |
|---|---|
| E-bike flat fee | Add a new vehicle type and flat-fee calculation |
| Delivery van rate | Add time-based fee calculation |
| Visitor day pass | Add a visitor category and one-day fee |
| Variable floors | Replace a fixed rectangular array with a jagged array |

## 3. Design and Code Adaptation

### E-bike
A new E-bike category is added. It pays a fixed fee of ₹20, regardless of parking duration. This amount is an implementation assumption.

### Delivery Van
The delivery van rate is twice the car rate during the specified time period of 9 AM to 5 PM. Outside this period, the normal car rate is applied.

### Visitor One-Day Pass
Visitors pay a fixed one-day pass fee of ₹100. This amount is an implementation assumption.

### Variable Number of Floors
A jagged array is used to represent the parking facility. Each floor can have a different number of parking slots.

The demonstration uses three floors with 3, 2 and 4 slots respectively.

## 4. Testing

| Test Case | Expected Result |
|---|---|
| E-bike parked for different durations | Same flat fee |
| Delivery van enters at 11 AM | Double car rate |
| Delivery van enters at 6 PM | Normal car rate |
| Visitor uses one-day pass | Fixed day-pass fee |
| Floors have different slot counts | Slots are allocated across floors |
| All slots are occupied | Parking Full message |

## 5. Complexity Analysis

Let F be the number of floors and S be the maximum number of slots on a floor.

| Operation | Time Complexity |
|---|---|
| Vehicle allocation | O(F × S) |
| Vehicle release | O(F × S) |
| Fee calculation | O(1) |
| Display parking slots | O(F × S) |

Space complexity is O(total number of parking slots).

## 6. Design Trade-offs

- A jagged array supports different numbers of slots on different floors, but searching still requires traversal.
- Fixed fee values are easy to implement, but changing prices requires updating the program constants.
- Time-based pricing adds flexibility but requires recording the vehicle's entry time.
- The current implementation demonstrates a one-day visitor fee but does not persist pass records or validate pass expiry across calendar days.

## 7. Conclusion

The updated system demonstrates how an existing Java application can adapt to changing requirements. New vehicle categories, fee rules and variable parking floors are supported using methods, conditional statements, LocalTime and jagged arrays.