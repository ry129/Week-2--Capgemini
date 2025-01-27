package main.E_CommercePlatform;

public class Groceries extends Product {
    Groceries(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculatediscount() {
        return getPrice()*0.05;
    }

}
