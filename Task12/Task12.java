package Task12;

import java.time.LocalTime;

class Vehicle {
    String regNo;
    String type;
    LocalTime entryTime;

    static final double CAR_RATE = 30.0;
    static final double EBIKE_FLAT_FEE = 20.0;
    static final double VISITOR_DAY_PASS = 100.0;

    Vehicle(String regNo, String type, LocalTime entryTime) {
        this.regNo = regNo;
        this.type = type;
        this.entryTime = entryTime;
    }

    double calculateFee(int hours) {
        switch (type.toLowerCase()) {
            case "bike":
                return hours * 10.0;

            case "car":
                return hours * CAR_RATE;

            case "e-bike":
                return EBIKE_FLAT_FEE;

            case "delivery van":
                if (!entryTime.isBefore(LocalTime.of(9, 0))
                        && entryTime.isBefore(LocalTime.of(17, 0))) {
                    return hours * CAR_RATE * 2;
                }
                return hours * CAR_RATE;

            case "visitor":
                return VISITOR_DAY_PASS;

            default:
                return 0.0;
        }
    }
}

class ParkingSystem {
    // Different numbers of slots on each floor
    Vehicle[][] slots = {
            new Vehicle[3],
            new Vehicle[2],
            new Vehicle[4]
    };

    void parkVehicle(Vehicle vehicle) {
        for (int i = 0; i < slots.length; i++) {
            for (int j = 0; j < slots[i].length; j++) {
                if (slots[i][j] == null) {
                    slots[i][j] = vehicle;

                    System.out.println(vehicle.regNo +
                            " parked at Floor " + (i + 1) +
                            ", Slot " + (j + 1));
                    return;
                }
            }
        }

        System.out.println("Parking Full! No slots available.");
    }

    void releaseVehicle(String regNo, int hours) {
        for (int i = 0; i < slots.length; i++) {
            for (int j = 0; j < slots[i].length; j++) {
                Vehicle vehicle = slots[i][j];

                if (vehicle != null && vehicle.regNo.equals(regNo)) {
                    double fee = vehicle.calculateFee(hours);

                    System.out.println("\nVehicle Released: " + regNo);
                    System.out.println("Vehicle Type: " + vehicle.type);
                    System.out.println("Parking Fee: Rs. " + fee);

                    slots[i][j] = null;
                    return;
                }
            }
        }

        System.out.println("Vehicle not found!");
    }

    void displaySlots() {
        System.out.println("\nParking Slot Status:");

        for (int i = 0; i < slots.length; i++) {
            System.out.println("Floor " + (i + 1) + ":");

            for (int j = 0; j < slots[i].length; j++) {
                if (slots[i][j] == null) {
                    System.out.println("Slot " + (j + 1) + ": Empty");
                } else {
                    System.out.println("Slot " + (j + 1) + ": " +
                            slots[i][j].regNo + " (" +
                            slots[i][j].type + ")");
                }
            }
        }
    }
}

public class Task12 {
    public static void main(String[] args) {
        ParkingSystem parking = new ParkingSystem();

        System.out.println("UPDATED CAMPUS SMART-PARKING SYSTEM\n");

        // Demonstrating the new vehicle categories
        parking.parkVehicle(new Vehicle(
                "TN01AB1234", "E-Bike", LocalTime.of(10, 0)));

        parking.parkVehicle(new Vehicle(
                "TN02CD5678", "Delivery Van", LocalTime.of(11, 0)));

        parking.parkVehicle(new Vehicle(
                "TN03EF9012", "Visitor", LocalTime.of(8, 30)));

        parking.parkVehicle(new Vehicle(
                "TN04GH3456", "Car", LocalTime.of(18, 0)));

        parking.displaySlots();

        System.out.println("\nTesting Updated Fee Rules:");

        parking.releaseVehicle("TN01AB1234", 3);
        parking.releaseVehicle("TN02CD5678", 3);
        parking.releaseVehicle("TN03EF9012", 5);
    }
}