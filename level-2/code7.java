import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Order Class
class Order {
    int orderId;
    List<Product> products = new ArrayList<>(); // Aggregates multiple products

    Order(int orderId) {
        this.orderId = orderId;
    }

    // Add a product to the order
    void addProduct(Product product) {
        products.add(product);
    }

    // Display order details
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in the order:");
        for (Product product : products) {
            System.out.println("- " + product.name + " ($" + product.price + ")");
        }
    }
}

// Customer Class
class Customer1 {
    String name;
    List<Order> orders = new ArrayList<>(); // A customer can place multiple orders

    Customer1(String name) {
        this.name = name;
    }

    // Place an order
    void placeOrder(Order order) {
        orders.add(order);
    }

    // Display customer orders
    void displayOrders() {
        System.out.println("Orders for customer: " + name);
        for (Order order : orders) {
            order.displayOrderDetails();
            System.out.println();
        }
    }
}

// Main Class
public class ECommerce {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Create a customer
        Customer1 customer = new Customer1("Aman");

        // Create orders and add products
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(102);
        order2.addProduct(product3);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display customer orders
        customer.displayOrders();
    }
}
