
public class FinancialForecasting {

    // Recursive method to predict future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        // Base case: If no more years to predict, return the current value
        if (years == 0) {
            return currentValue;
        }
        // Recursive case: Calculate the next year's value and reduce the number of years
        double nextValue = currentValue * (1 + growthRate);
        return predictFutureValue(nextValue, growthRate, years - 1);
    }

    
