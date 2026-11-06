package Task06;

class Vehicle {

    String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
        System.out.println("Vehicle constructor called");
    }

    void display() {
        System.out.println("Registration Number: " + regNo);
    }
}

class TwoWheeler extends Vehicle {

    TwoWheeler(String regNo) {
        super(regNo);
        System.out.println("TwoWheeler constructor called");
    }
}

class Car extends Vehicle {

    Car(String regNo) {
        super(regNo);
        System.out.println("Car constructor called");
    }
}

class ElectricCar extends Car {

    ElectricCar(String regNo) {
        super(regNo);
        System.out.println("ElectricCar constructor called");
    }
}

public class Task06 {

    public static void main(String[] args) {

        System.out.println("Creating Two Wheeler:");
        TwoWheeler bike = new TwoWheeler("TN01AB1234");
        bike.display();

        System.out.println("\nCreating Car:");
        Car car = new Car("TN02CD5678");
        car.display();

        System.out.println("\nCreating Electric Car:");
        ElectricCar electricCar = new ElectricCar("TN03EF9012");
        electricCar.display();
    }
}
