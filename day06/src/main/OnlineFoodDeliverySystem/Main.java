package main.OnlineFoodDeliverySystem;
import java.util.ArrayList;
import java.util.List;

// Main Class: OnlineFoodDeliverySystem
 class onlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Create food items
        FoodItem vegBurger = new VegItem("Veg Burger", 100.0, 2);
        FoodItem chickenRoll = new NonVegItem("Chicken Roll", 150.0, 1);

        // Apply discounts
        ((Discountable) vegBurger).applyDiscount(0.10); // 10% discount on Veg Burger
        ((Discountable) chickenRoll).applyDiscount(0.05); // 5% discount on Chicken Roll

        // Store items in a list
        List<FoodItem> foodOrder = new ArrayList<>();
        foodOrder.add(vegBurger);
        foodOrder.add(chickenRoll);

        // Process order
        processOrder(foodOrder);
    }

    // Method to process the order and display details
    public static void processOrder(List<FoodItem> foodOrder) {
        System.out.println("--- Order Details ---");
        double totalOrderPrice = 0.0;

        for (FoodItem item : foodOrder) {
            System.out.println(item.getItemDetails());
            System.out.println("Discount Details: " + ((Discountable) item).getDiscountDetails());
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price after Discount: " + totalPrice);
            totalOrderPrice += totalPrice;
            System.out.println();
        }

        System.out.println("Final Order Price: " + totalOrderPrice);
    }
}
