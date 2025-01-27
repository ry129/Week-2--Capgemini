package main.OnlineFoodDeliverySystem;

// Subclass: NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private boolean isDiscountApplied;
    private double discountRate;
    private static final double ADDITIONAL_CHARGE = 50.0; // Extra charge for non-veg items

    // Constructor
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.isDiscountApplied = false;
        this.discountRate = 0.0;
    }

    // Override calculateTotalPrice
    @Override
    public double calculateTotalPrice() {
        double totalPrice = (getPrice() * getQuantity()) + ADDITIONAL_CHARGE;
        if (isDiscountApplied) {
            totalPrice -= totalPrice * discountRate;
        }
        return totalPrice;
    }

    // Implement OnlineFoodDeliverySystem.Discountable methods
    @Override
    public void applyDiscount(double discountRate) {
        this.discountRate = discountRate;
        this.isDiscountApplied = true;
    }

    @Override
    public String getDiscountDetails() {
        return isDiscountApplied ? "Discount Applied: " + (discountRate * 100) + "%" : "No discount applied.";
    }
}
