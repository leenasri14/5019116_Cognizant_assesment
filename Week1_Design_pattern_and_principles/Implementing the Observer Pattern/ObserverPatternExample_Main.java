
public class ObserverPatternExample_Main {
    public static void main(String[] args) {
        // Create a stock market subject
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp = new WebApp("WebApp");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        // Simulate stock price changes
        System.out.println("Setting stock price to 100.0");
        stockMarket.setStockPrice(100.0);

        System.out.println("Setting stock price to 150.5");
        stockMarket.setStockPrice(150.5);

        // Deregister an observer
        stockMarket.deregisterObserver(mobileApp2);

        // Simulate another stock price change
        System.out.println("Setting stock price to 200.0");
        stockMarket.setStockPrice(200.0);
    }
}
