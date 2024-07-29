
import java.util.Scanner;

public class ProxyPatternExample_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for image URL
        System.out.print("Enter image URL: ");
        String imageUrl = scanner.nextLine();

        // Create a ProxyImage
        Image image = new ProxyImage(imageUrl);

        // Display the image (lazy initialization)
        System.out.println("First display call:");
        image.display();

        // Display the image again (cached)
        System.out.println("Second display call:");
        image.display();
    }
}
