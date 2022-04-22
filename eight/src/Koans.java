import java.util.*;
import java.util.stream.*;

record Shop(String name, List<Customer> customers) {}

record Customer(String name, City city, List<Order> orders) {}

record Order(List<Product> products, boolean isDelivered) {}

record Product(String name, double price) {}

record City(String name) {}

public class Koans {

    // return true if there's at least one customer whose order is not delivered
    private static boolean hasDeliveries(Shop shop) {
        return shop.customers().stream()
                .flatMap(c -> c.orders().stream())
                .anyMatch(o -> !o.isDelivered());
    }

    // return sum of prices of undelivered products for customer with given name
    // you can assume that there's only one customer with this name in the shop
    private static double debt(String customerName, Shop shop) {
        return shop.customers().stream()
                .filter(c -> Objects.equals(c.name(), customerName))
                .flatMap(c -> c.orders().stream())
                .filter(o -> !o.isDelivered())
                .flatMap(o -> o.products().stream())
                .map(Product::price)
                .mapToDouble(p -> p)
                .sum();
    }

    // find all delivered products for all customers in given shop
    List<Product> allDeliveredProducts(Shop shop) {
        return shop.customers().stream()
                .flatMap(c -> c.orders().stream())
                .filter(Order::isDelivered)
                .flatMap(o -> o.products().stream())
                .collect(Collectors.toList());
    }

    // create a map customer -> delivered products names
    Map<Customer, List<String>> customerOrders(Shop shop) {
        return shop.customers().stream().collect(Collectors.toMap(c -> c, Koans::deliveredProducts));
    }
    
    private static List<String> deliveredProducts(Customer customer) {
        return customer.orders().stream()
                .filter(Order::isDelivered)
                .flatMap(o -> o.products().stream())
                .map(Product::name)
                .collect(Collectors.toList());
    }
}