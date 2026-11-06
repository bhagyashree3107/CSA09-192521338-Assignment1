
package Task07;

class Vehicle {
    final String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    final String getRegNo() {
        return regNo;
    }

    double calculateFee(int minutes) {
        return Math.ceil(minutes / 60.0) * 10;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Vehicle v = (Vehicle) obj;
        return regNo.equals(v.regNo);
    }

    @Override
    public int hashCode() {
        return regNo.hashCode();
    }

    @Override
    public String toString() {
        return "Vehicle Registration: " + regNo;
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int minutes) {
        return Math.ceil(minutes / 60.0) * 10;
    }
}

class Car extends Vehicle {
    Car(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int minutes) {
        return Math.ceil(minutes / 60.0) * 30;
    }
}

class ElectricCar extends Car {
    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int minutes) {
        return Math.ceil(minutes / 60.0) * 40;
    }
}

public class Task07 {
    public static void main(String[] args) {

        Vehicle bike = new TwoWheeler("TN01AB1234");
        Vehicle car = new Car("TN02CD5678");
        Vehicle electric = new ElectricCar("TN03EF9012");

        int parkingMinutes = 130;

        System.out.println("Parking Duration: " + parkingMinutes + " minutes");

        System.out.println("Two Wheeler Fee: Rs. " +
                bike.calculateFee(parkingMinutes));

        System.out.println("Car Fee: Rs. " +
                car.calculateFee(parkingMinutes));

        System.out.println("Electric Car Fee: Rs. " +
                electric.calculateFee(parkingMinutes));

        Vehicle anotherBike = new TwoWheeler("TN01AB1234");

        System.out.println("\nComparing Vehicles:");
        System.out.println("Are bikes equal? " + bike.equals(anotherBike));

        System.out.println("Same hash code? " +
                (bike.hashCode() == anotherBike.hashCode()));

        System.out.println("\nVehicle Details:");
        System.out.println(bike);
    }
}
