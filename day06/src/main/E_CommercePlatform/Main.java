package main.E_CommercePlatform;

import java.util.ArrayList;
import java.util.List;


class ECommercePlatform {
    // Method to calculate and print final price
    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            System.out.println("\nProduct Details:");
            product.displayDetails();

            double discount = product.calculatediscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculatedTax() : 0.0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount: $" + discount);
            System.out.println("Tax: $" + tax);
            System.out.println("Final Price: $" + finalPrice);
        }
    }

    public static void main(String[] args) {
        // Create product objects
        Product laptop = new Electronics(01, "Laptop", 1000.0);
        Product shirt = new Clothing(01, "Shirt", 50.0);
        Product apple = new Groceries(01, "Apple", 2.0);

        // Add products to a list
        List<Product> products = new ArrayList<>();
        products.add(laptop);
        products.add(shirt);
        products.add(apple);

        // Calculate and display final prices
        calculateFinalPrice(products);
    }
}




