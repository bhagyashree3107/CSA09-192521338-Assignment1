
package Task11;

class Vehicle {
    String regNo;
    String type;

    Vehicle(String regNo, String type) {
        this.regNo = regNo;
        this.type = type;
    }

    double calculateFee(int hours) {
        double rate;

        switch (type.toLowerCase()) {
            case "bike":
                rate = 10;
                break;
            case "car":
                rate = 30;
                break;
            case "electric car":
                rate = 40;
                break;
            default:
                rate = 20;
        }

        return hours * rate;
    }
}

class ParkingSystem {
    Vehicle[][] slots = new Vehicle[2][2];
    static double dailyCollection = 0;

    // Allocate the first available slot
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

    // Release a vehicle and calculate its fee
    void releaseVehicle(String regNo, int hours) {
        for (int i = 0; i < slots.length; i++) {
            for (int j = 0; j < slots[i].length; j++) {

                if (slots[i][j] != null &&
                        slots[i][j].regNo.equals(regNo)) {

                    Vehicle vehicle = slots[i][j];
                    double fee = vehicle.calculateFee(hours);

                    dailyCollection += fee;
                    slots[i][j] = null;

                    System.out.println("Vehicle Released: " + regNo);
                    System.out.println("Parking Fee: Rs. " + fee);
                    return;
                }
            }
        }

        System.out.println("Vehicle not found!");
    }

    // Display all parking slots
    void displaySlots() {
        System.out.println("\nParking Slot Status:");

        for (int i = 0; i < slots.length; i++) {
            System.out.println("Floor " + (i + 1) + ":");

            for (int j = 0; j < slots[i].length; j++) {
                if (slots[i][j] == null) {
                    System.out.println("Slot " + (j + 1) + ": Empty");
                } else {
                    System.out.println("Slot " + (j + 1) + ": " +
                            slots[i][j].regNo);
                }
            }
        }
    }

    void displayDailyCollection() {
        System.out.println("\nTotal Daily Collection: Rs. " +
                dailyCollection);
    }
}

public class Task11 {
    public static void main(String[] args) {

        ParkingSystem parking = new ParkingSystem();

        System.out.println("CAMPUS SMART PARKING SYSTEM\n");

        // Normal test cases
        System.out.println("1. Parking Vehicles:");

        parking.parkVehicle(new Vehicle("TN01AB1234", "Bike"));
        parking.parkVehicle(new Vehicle("TN02CD5678", "Car"));
        parking.parkVehicle(new Vehicle("TN03EF9012", "Electric Car"));
        parking.parkVehicle(new Vehicle("TN04GH3456", "Car"));

        // Boundary test: parking is full
        System.out.println("\n2. Testing Full Parking:");
        parking.parkVehicle(new Vehicle("TN05IJ7890", "Bike"));

        parking.displaySlots();

        // Invalid test: vehicle not found
        System.out.println("\n3. Testing Invalid Release:");
        parking.releaseVehicle("TN99ZZ9999", 2);

        // Normal release
        System.out.println("\n4. Releasing Vehicle:");
        parking.releaseVehicle("TN02CD5678", 3);

        // Allocate the newly available slot
        System.out.println("\n5. Parking Again:");
        parking.parkVehicle(new Vehicle("TN05IJ7890", "Bike"));

        parking.displaySlots();

        // Display collection
        parking.displayDailyCollection();
    }
}
