
public class Main {
    public static void main(String[] args) {
        // Create the repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.getCustomerById("123");
        System.out.println(customer);

        // Try finding another customer
        Customer anotherCustomer = customerService.getCustomerById("456");
        System.out.println(anotherCustomer);
    }
}
