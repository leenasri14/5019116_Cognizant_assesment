import java.util.Scanner;

public class TestLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the instance of the Logger
        Logger logger = Logger.getInstance();

        while (true) {
            System.out.print("Enter a log message (or type 'exit' to quit): ");
            String message = scanner.nextLine();
            
            if (message.equalsIgnoreCase("exit")) {
                break; // Exit the loop
            }
            
            // Log the message
            logger.log(message);
        }

        scanner.close();
    }
}
