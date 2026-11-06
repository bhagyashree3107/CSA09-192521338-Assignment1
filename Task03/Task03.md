
public class ParkingFacility {

    // Each row represents one floor.
    // null means the slot is empty.
    // A registration number means the slot is occupied.
    String[][] slots = new String[2][];

    // Constructor
    ParkingFacility() {
        slots[0] = new String[3];
        slots[1] = new String[2];
    }

    // Allocate the first available parking slot
    public int[] allocate(String regNo) {

        for (int i = 0; i < slots.length; i++) {

            for (int j = 0; j < slots[i].length; j++) {

                if (slots[i][j] == null) {
                    slots[i][j] = regNo;

                    return new int[]{i, j};
                }
            }
        }

        // No parking slot available
        return null;
    }

    // Release a parking slot
    public boolean release(int floor, int slot) {

        if (floor < 0 || floor >= slots.length) {
            return false;
        }

        if (slot < 0 || slot >= slots[floor].length) {
            return false;
        }

        if (slots[floor][slot] == null) {
            return false;
        }

        slots[floor][slot] = null;
        return true;
    }

    // Calculate parking fee based on duration and hourly rate
    public double calculateFee(int minutes, double ratePerHour) {

        if (minutes < 0 || ratePerHour < 0) {
            throw new IllegalArgumentException("Invalid fee details");
        }

        int hours = (minutes + 59) / 60;

        return hours * ratePerHour;
    }

    // Main method to test the program
    public static void main(String[] args) {

        ParkingFacility parking = new ParkingFacility();

        System.out.println("Parking Slot Allocation:");

        int[] a = parking.allocate("TN01A1234");
        int[] b = parking.allocate("TN02B1234");
        int[] c = parking.allocate("TN03C1234");
        int[] d = parking.allocate("TN04D1234");
        int[] e = parking.allocate("TN05E1234");
        int[] f = parking.allocate("TN06F1234");

        printSlot(a);
        printSlot(b);
        printSlot(c);
        printSlot(d);
        printSlot(e);
        printSlot(f);

        System.out.println("\nReleasing Slots:");

        System.out.println(parking.release(0, 1));
        System.out.println(parking.release(0, 1));
        System.out.println(parking.release(5, 0));

        System.out.println("\nAllocating Again:");

        printSlot(parking.allocate("TN07G1234"));

        System.out.println("\nParking Fee:");

        System.out.println("Fee: Rs. " +
                parking.calculateFee(130, 30));
    }

    // Display allocated slot
    static void printSlot(int[] position) {

        if (position == null) {
            System.out.println("No slot available");
        } else {
            System.out.println(
                "[" + position[0] + "," + position[1] + "]"
            );
        }
    }
}
