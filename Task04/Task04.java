
class Vehicle {

    // Instance variables
    String regNo;
    String vehicleType;
    double parkingFee;

    // No-argument constructor
    Vehicle() {
        this("UNKNOWN", "Not specified", 0.0);
    }

    // Parameterized constructor
    Vehicle(String regNo) {
        this(regNo, "Car", 0.0);
    }

    // Overloaded parameterized constructor
    Vehicle(String regNo, String vehicleType, double parkingFee) {
        this.regNo = regNo;
        this.vehicleType = vehicleType;
        this.parkingFee = parkingFee;
    }

    // Copy constructor
    Vehicle(Vehicle other) {
        this(other.regNo, other.vehicleType, other.parkingFee);
    }

    // Instance method
    void displayDetails() {
        System.out.println("Registration Number: " + this.regNo);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Parking Fee: Rs. " + this.parkingFee);
        System.out.println();
    }
}

public class Task04 {

    public static void main(String[] args) {

        // Object using no-argument constructor
        Vehicle v1 = new Vehicle();

        // Object using one-argument constructor
        Vehicle v2 = new Vehicle("TN01AB1234");

        // Object using parameterized constructor
        Vehicle v3 = new Vehicle("TN02CD5678", "Two Wheeler", 30.0);

        // Object using copy constructor
        Vehicle v4 = new Vehicle(v3);

        System.out.println("Vehicle 1:");
        v1.displayDetails();

        System.out.println("Vehicle 2:");
        v2.displayDetails();

        System.out.println("Vehicle 3:");
        v3.displayDetails();

        System.out.println("Copied Vehicle:");
        v4.displayDetails();

        // Demonstrating object references
        Vehicle v5 = v3;

        System.out.println("Changing fee through v5...");
        v5.parkingFee = 50.0;

        System.out.println("Fee through v3: " + v3.parkingFee);
        System.out.println("Fee through v5: " + v5.parkingFee);
    }
}
