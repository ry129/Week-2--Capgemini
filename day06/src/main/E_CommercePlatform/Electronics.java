package main.E_CommercePlatform;

public class Electronics extends Product implements Taxable{
     Electronics(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculatediscount() {
        return getPrice()*0.1;
    }
    @Override
    public double calculatedTax() {
        return getPrice() * 0.15; // 15% tax
    }
    @Override
    public String getTaxDetails(){
        return "15% tax for Electronics";
    }
}
