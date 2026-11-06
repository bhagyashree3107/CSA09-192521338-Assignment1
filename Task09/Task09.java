
package Task09;

abstract class Vehicle {
    String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    // Abstract method
    abstract double calculateFee(int hours);

    // Concrete method
    void displayDetails() {
        System.out.println("Registration Number: " + regNo);
    }
}

interface Chargeable {
    void chargeBattery();
}

interface Payable {
    void makePayment(double amount);

    default void paymentStatus() {
        System.out.println("Payment completed successfully.");
    }

    static void paymentInfo() {
        System.out.println("Parking payment system");
    }
}

class TwoWheeler extends Vehicle implements Payable {
    TwoWheeler(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 10;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Two-wheeler payment: Rs. " + amount);
    }
}

class Car extends Vehicle implements Payable {
    Car(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 30;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Car payment: Rs. " + amount);
    }
}

class ElectricCar extends Car implements Chargeable {
    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    public void chargeBattery() {
        System.out.println("Electric car battery charging...");
    }
}

public class Task09 {
    public static void main(String[] args) {

        TwoWheeler bike = new TwoWheeler("TN01AB1234");
        Car car = new Car("TN02CD5678");
        ElectricCar electric = new ElectricCar("TN03EF9012");

        System.out.println("Two Wheeler:");
        bike.displayDetails();
        double bikeFee = bike.calculateFee(2);
        bike.makePayment(bikeFee);
        bike.paymentStatus();

        System.out.println("\nCar:");
        car.displayDetails();
        double carFee = car.calculateFee(2);
        car.makePayment(carFee);
        car.paymentStatus();

        System.out.println("\nElectric Car:");
        electric.displayDetails();
        System.out.println("Parking Fee: Rs. " +
                electric.calculateFee(2));
        electric.chargeBattery();

        System.out.println();
        Payable.paymentInfo();
    }
}
