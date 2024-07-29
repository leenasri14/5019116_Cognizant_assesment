
import java.util.Scanner;

public class AdapterPatternExample_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Payment Gateway:");
        System.out.println("1. PayPal");
        System.out.println("2. Stripe");
        int choice = scanner.nextInt();

        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();

        PaymentProcessor paymentProcessor;

        switch (choice) {
            case 1:
                PayPal payPal = new PayPal();
                paymentProcessor = new PayPalAdapter(payPal);
                break;
            case 2:
                Stripe stripe = new Stripe();
                paymentProcessor = new StripeAdapter(stripe);
                break;
            default:
                throw new IllegalArgumentException("Invalid payment gateway choice");
        }

        paymentProcessor.processPayment(amount);
    }
}
