
import java.util.Scanner;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the message to be sent
        System.out.print("Enter the message to send: ");
        String message = scanner.nextLine();

        // Initial notifier
        Notifier notifier = new EmailNotifier();

        // Get user input for notification channels
        System.out.println("Select notification channels (comma separated):");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Slack");
        String[] channels = scanner.nextLine().split(",");

        // Apply decorators based on user selection
        for (String channel : channels) {
            switch (channel.trim()) {
                case "2":
                    notifier = new SMSNotifierDecorator(notifier);
                    break;
                case "3":
                    notifier = new SlackNotifierDecorator(notifier);
                    break;
                default:
                    // Email is already the default base notifier
                    break;
            }
        }

        // Send the notification
        notifier.send(message);
    }
}
