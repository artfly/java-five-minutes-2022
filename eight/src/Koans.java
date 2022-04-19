import java.util.*;

record Shop(String name, List<Customer> customers) {}

record Customer(String name, City city, List<Order> orders) {}

record Order(List<Product> products, boolean isDelivered) {}

record Product(String name, double price) {}

record City(String name) {}

public class Koans {

    // return true if there's at least one customer whose order is not delivered
    private static boolean hasDeliveries(Shop shop) {
        return false;
    }

    // return sum of prices of undelivered products for customer with given name
    // you can assume that there's only one customer with this name in the shop
    private static double debt(String customerName, Shop shop) {
        return 0.0;
    }

    // find all delivered products for all customers in given shop
    List<Product> allDeliveredProducts(Shop shop) {
        return null;
    }

    // create a map customer -> delivered products names
    Map<Customer, List<String>> customerOrders(Shop shop) {
        return null;
    }
}