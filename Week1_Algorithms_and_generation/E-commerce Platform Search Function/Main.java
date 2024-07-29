public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product[] products = new Product[numberOfProducts];

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.print("Enter Product ID: ");
            String productId = scanner.nextLine();
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter Product Category: ");
            String category = scanner.nextLine();

            products[i] = new Product(productId, productName, category);
        }

        System.out.print("Enter the product name to search: ");
        String searchProductName = scanner.nextLine();

        // Linear Search
        System.out.println("Performing Linear Search:");
        Product foundProduct = Search.linearSearch(products, searchProductName);
        System.out.println(foundProduct != null ? foundProduct : "Product not found");

        // Binary Search
        Search.sortProductsByName(products);
        System.out.println("Performing Binary Search:");
        foundProduct = Search.binarySearch(products, searchProductName);
        System.out.println(foundProduct != null ? foundProduct : "Product not found");
    }
}
