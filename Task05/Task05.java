package Task05;

class ParkingFacility {

    // Static variables shared by all objects
    static int facilityCount = 0;
    static int totalOccupied = 0;

    // Instance variable belongs to each object
    int occupiedSlots;

    // Static block executes once when class is initialized
    static {
        System.out.println("Parking System Initialized");
    }

    // Constructor
    ParkingFacility() {
        facilityCount++;
        occupiedSlots = 0;
    }

    // Instance method
    void parkVehicle() {
        occupiedSlots++;
        totalOccupied++;
    }

    // Static method
    static void displayTotal() {
        System.out.println("Total Facilities: " + facilityCount);
        System.out.println("Total Occupied Slots: " + totalOccupied);
    }

    // Passing an object reference to a method
    static void addVehicle(ParkingFacility facility) {
        facility.parkVehicle();
    }
}

public class Task05 {

    public static void main(String[] args) {

        // Creating two objects
        ParkingFacility floor1 = new ParkingFacility();
        ParkingFacility floor2 = new ParkingFacility();

        // Parking vehicles
        floor1.parkVehicle();
        floor1.parkVehicle();

        floor2.parkVehicle();

        System.out.println("\nFloor 1 Occupied Slots: " +
                floor1.occupiedSlots);

        System.out.println("Floor 2 Occupied Slots: " +
                floor2.occupiedSlots);

        // Calling static method using class name
        System.out.println("\nOverall Parking Details:");
        ParkingFacility.displayTotal();

        // Passing an object reference
        ParkingFacility.addVehicle(floor2);

        System.out.println("\nAfter Passing Object Reference:");
        System.out.println("Floor 2 Occupied Slots: " +
                floor2.occupiedSlots);

        ParkingFacility.displayTotal();

        // Returning an object reference
        ParkingFacility newFacility = createFacility();

        System.out.println("\nNew Facility Created:");
        System.out.println("Total Facilities: " +
                ParkingFacility.facilityCount);

        // Making an object eligible for garbage collection
        floor1 = null;

        System.out.println("\nFloor 1 reference set to null.");
        System.out.println("The object may now be eligible for garbage collection.");
    }

    // Method returning an object reference
    static ParkingFacility createFacility() {
        return new ParkingFacility();
    }
}
