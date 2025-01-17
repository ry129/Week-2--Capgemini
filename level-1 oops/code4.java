import java.util.Scanner;
class Main{	

		
	public static void main(String[]args){
		
		Main.Item obj = new Item();
		obj.displayDetails("Kurkure",12,10);
	  obj.totalprice();
	}
public static class Item {
	public
	 String itemName;
	 int itemCode;
	 int price; 
	 
	public  void displayDetails(String itemName , int itemCode ,int price){
		this.itemName=itemName;
		this.itemCode=itemCode;
		this.price=price;
		System.out.println("ItemName :"+ itemName);
		System.out.println("ItemCode :"+ itemCode);
		System.out.println("Price :" + price); 
	}
		
		void totalprice(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Quantity:");
	int quantity = sc.nextInt();
	System.out.println((quantity*price));
}

} }