import java.util.Scanner;
class Main{	

		
	public static void main(String[]args){
		
		Main.MobilePhone obj = new MobilePhone();
		obj.displayDetails();
	  
	}
public static class MobilePhone {
	
	public
	 String brand;
	 String model;
	 int price; 
	 MobilePhone(){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Brand :");
		 brand=sc.nextLine();
		 System.out.println("Enter model :");
		 model=sc.nextLine();
		 System.out.println("Enter price :");
		 price=sc.nextInt();
	 }
		 
	 
	public  void displayDetails(){
		
		System.out.println("Brand Of MobilePhone :"+ brand);
		System.out.println("Model of MobilePhone :"+ model);
		System.out.println("Price of MobilePhone :" + price); 
	}
		
		

} }