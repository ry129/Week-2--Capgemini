package main.E_CommercePlatform;

public class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculatediscount() {
        return getPrice() * 0.2; // 20% discount
    }

    @Override
    public double calculatedTax() {
        return getPrice() * 0.05; // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "5% tax for Clothing";
    }
}
