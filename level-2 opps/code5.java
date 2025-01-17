import java.util.Scanner;
class Main{	

		
	public static void main(String[]args){
		
		
		Main.CartItem obj = new CartItem();
		obj.addItem(5);
		obj.Remove(2);
		obj.display();
		
	}
public static class CartItem {

 String itemName;
	 int price;
	 int quantity; 
	 CartItem(){
		 Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter itemName");
		itemName=sc.nextLine();
		System.out.println("Enter price");
		price=sc.nextInt();
		System.out.println("Enter quantity");
		quantity=sc.nextInt();
	 }
	 
	public  void addItem(int additem ){
		quantity=quantity+additem;
		System.out.println("Add items are :"+ quantity);
	}
		
		public void Remove(int itemremove){
			quantity=quantity-itemremove;
			System.out.println("Removed items are :"+ quantity);
		}
			
		 public void display(){
		   System.out.println("Total Cost is :" + (price*quantity));
	   }
} }
		   
		   
