
import java.util.Scanner;

public class StrategyPatternExample_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        // Get user input for payment method
        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Set the payment strategy based on user choice
        switch (choice) {
            case 1:
                System.out.print("Enter card number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Enter card holder name: ");
                String cardHolderName = scanner.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = scanner.nextLine();
                System.out.print("Enter expiry date (MM/YY): ");
                String expiryDate = scanner.nextLine();
                context.setPaymentStrategy(new CreditCardPayment(cardNumber, cardHolderName, cvv, expiryDate));
                break;
            case 2:
                System.out.print("Enter PayPal email: ");
                String email = scanner.nextLine();
                System.out.print("Enter PayPal password: ");
                String password = scanner.nextLine();
                context.setPaymentStrategy(new PayPalPayment(email, password));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // Get user input for the amount to be paid
        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();

        // Execute the payment strategy
        context.pay(amount);
    }
}
