
package Task08;

class Vehicle {
    String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    // Method to be overridden
    double calculateFee(int hours) {
        return hours * 20;
    }

    // Method overloading
    double calculateFee(int hours, double rate) {
        return hours * rate;
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 10;
    }
}

class Car extends Vehicle {
    Car(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 30;
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 40;
    }
}

public class Task08 {
    public static void main(String[] args) {

        // Compile-time polymorphism: method overloading
        Vehicle v = new Vehicle("TN01AB1234");

        System.out.println("Compile-Time Polymorphism:");
        System.out.println("Fee at default rate: Rs. " +
                v.calculateFee(2));

        System.out.println("Fee at custom rate: Rs. " +
                v.calculateFee(2, 25));

        // Runtime polymorphism: parent reference, child objects
        Vehicle[] vehicles = {
                new TwoWheeler("TN02CD1234"),
                new Car("TN03EF5678"),
                new ElectricCar("TN04GH9012")
        };

        System.out.println("\nRuntime Polymorphism:");

        for (Vehicle vehicle : vehicles) {
            System.out.println("Registration: " + vehicle.regNo);
            System.out.println("Parking Fee: Rs. " +
                    vehicle.calculateFee(2));
        }
    }
}
