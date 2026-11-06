
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Primitive data types
        int vehicleCount = 5;
        double parkingFee = 25.50;
        char vehicleType = 'C';
        boolean isAvailable = true;

        System.out.println("Vehicle count: " + vehicleCount);
        System.out.println("Parking fee: Rs. " + parkingFee);
        System.out.println("Vehicle type: " + vehicleType);
        System.out.println("Available: " + isAvailable);

        // One-dimensional array
        int[] floorCapacity = {10, 15, 20};

        System.out.println("\nFloor capacities:");
        for (int i = 0; i < floorCapacity.length; i++) {
            System.out.println("Floor " + (i + 1) + ": " + floorCapacity[i]);
        }

        // Two-dimensional array
        int[][] parkingSlots = {
            {1, 0, 1},
            {0, 1, 1}
        };

        System.out.println("\nParking slot status:");
        for (int i = 0; i < parkingSlots.length; i++) {
            for (int j = 0; j < parkingSlots[i].length; j++) {
                System.out.print(parkingSlots[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged array: each floor has a different number of slots
        int[][] jaggedSlots = {
            {1, 0},
            {1, 1, 0},
            {0, 1, 1, 1}
        };

        System.out.println("\nJagged array:");
        for (int i = 0; i < jaggedSlots.length; i++) {
            for (int j = 0; j < jaggedSlots[i].length; j++) {
                System.out.print(jaggedSlots[i][j] + " ");
            }
            System.out.println();
        }

        // Scanner input
        System.out.print("\nEnter total parking fee: ");
        int totalFee = sc.nextInt();

        System.out.print("Enter number of hours: ");
        int hours = sc.nextInt();

        // Integer division
        int integerResult = totalFee / hours;

        // Type casting to obtain decimal division
        double decimalResult = (double) totalFee / hours;

        System.out.println("Integer division result: " + integerResult);
        System.out.println("Decimal division result: " + decimalResult);

        // Widening conversion
        int number = 10;
        double convertedNumber = number;

        // Narrowing conversion
        double value = 15.75;
        int convertedValue = (int) value;

        System.out.println("\nWidening conversion: " + convertedNumber);
        System.out.println("Narrowing conversion: " + convertedValue);

        sc.close();
    }
}
