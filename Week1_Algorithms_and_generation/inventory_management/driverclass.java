public class driverclass {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String addProductId = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String addProductName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int addQuantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double addPrice = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    Product newProduct = new Product(addProductId, addProductName, addQuantity, addPrice);
                    ims.addProduct(newProduct);
                    break;

                case 2:
                    System.out.print("Enter Product ID to Update: ");
                    String updateProductId = scanner.nextLine();
                    if (ims.getProduct(updateProductId) != null) {
                        System.out.print("Enter New Product Name: ");
                        String updateProductName = scanner.nextLine();
                        System.out.print("Enter New Quantity: ");
                        int updateQuantity = scanner.nextInt();
                        System.out.print("Enter New Price: ");
                        double updatePrice = scanner.nextDouble();
                        scanner.nextLine();  // Consume newline

                        Product updatedProduct = new Product(updateProductId, updateProductName, updateQuantity, updatePrice);
                        ims.updateProduct(updateProductId, updatedProduct);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to Delete: ");
                    String deleteProductId = scanner.nextLine();
                    ims.deleteProduct(deleteProductId);
                    break;

                case 4:
                    ims.displayInventory();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
