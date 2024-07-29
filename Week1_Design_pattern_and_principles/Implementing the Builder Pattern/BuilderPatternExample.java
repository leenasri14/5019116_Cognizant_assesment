// BuilderPatternExample.java
import java.util.Scanner;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for computer configuration
        System.out.print("Enter CPU: ");
        String cpu = scanner.nextLine();

        System.out.print("Enter RAM: ");
        String ram = scanner.nextLine();

        System.out.print("Enter Storage: ");
        String storage = scanner.nextLine();

        System.out.print("Enter GPU (optional, press Enter to skip): ");
        String gpu = scanner.nextLine();
        if (gpu.isEmpty()) {
            gpu = null; // Handle optional GPU
        }

        System.out.print("Enter Motherboard: ");
        String motherboard = scanner.nextLine();

        // Build the Computer object
        Computer computer = new Computer.Builder()
                .setCPU(cpu)
                .setRAM(ram)
                .setStorage(storage)
                .setGPU(gpu) // Only set if provided
                .setMotherboard(motherboard)
                .build();

        // Display the created Computer
        System.out.println("Computer configuration: " + computer);
    }
}
