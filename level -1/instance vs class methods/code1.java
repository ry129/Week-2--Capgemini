public class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable (shared among all instances)
    static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment total products whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 799.99);
        Product product2 = new Product("Smartphone", 499.99);
        
        product1.displayProductDetails();
        product2.displayProductDetails();
        
        Product.displayTotalProducts();  // Display total products created
    }
}
