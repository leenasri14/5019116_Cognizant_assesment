import java.util.*;
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the current value: ");
        double currentValue = scanner.nextDouble();
        System.out.print("Enter the annual growth rate (as a decimal, e.g., 0.05 for 5%): ");
        double growthRate = scanner.nextDouble();
        System.out.print("Enter the number of years to predict: ");
        int years = scanner.nextInt();

        // Calculate the future value
        double futureValue = predictFutureValue(currentValue, growthRate, years);

        // Display the result
        System.out.printf("The predicted value after %d years is: %.2f%n", years, futureValue);

        scanner.close();
    }
}
