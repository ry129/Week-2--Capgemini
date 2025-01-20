class Main{
	public static void main(String[]args){
		Product obj=new shoppingCart("chips",20,2,100);
		if(obj instanceof shoppingCart){
			System.out.println("obj is an instance of shoppingCart");
        }
        if (obj instanceof Product) {
            System.out.println("obj is also an instance of Product");
        }
		shoppingCart obj1=new shoppingCart("chips",20,2,100);
		obj1.setdiscount(12);
		obj1.display();
		}
}
class Product{
	String productName;
	int price;
	int quantity;
	final int pid;
	Product(String productName,int price,int quantity,int pid){
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		this.pid=pid;
	}
}
	
	class shoppingCart extends Product{
	static int discount;
	
	
	shoppingCart(String productName,int price,int quantity,int pid){
		super(productName,price,quantity,pid);
	}
	
	
	public static void setdiscount(int discount){
		shoppingCart.discount=discount;
	}
	public static int  getdiscount(){
		return discount;
	}
public void display(){
		System.out.println("Enter Discount:"+discount);
		System.out.println("Enter Product Name:"+productName);
		System.out.println("Enter Price:"+price);
		System.out.println("Enter Quantity:"+quantity);
		System.out.println("Enter Product ID:"+pid);
	}
	}
	
