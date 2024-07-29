import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int numberOfOrders = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Order[] orders = new Order[numberOfOrders];

        for (int i = 0; i < numberOfOrders; i++) {
            System.out.print("Enter Order ID: ");
            String orderId = scanner.nextLine();
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter Total Price: ");
            double totalPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            orders[i] = new Order(orderId, customerName, totalPrice);
        }

        System.out.println("Choose sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                SortingAlgorithms.bubbleSort(orders);
                break;
            case 2:
                SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Sorted Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
