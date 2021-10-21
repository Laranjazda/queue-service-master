import controllers.CustomerController;
import models.Customer;

public class Tets {
    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        Customer customer = new Customer("Carlos");
        customerController.createOne(customer);

        System.out.println(customer.getName());
    }
}
