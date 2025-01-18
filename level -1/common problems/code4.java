import java.util.Scanner;
class Main{	
	public static void main(String[] args){
		//Default Constructor
		Hotel obj=new Hotel();
		obj.display();
		//Parameterized constructor
		Hotel obj2=new Hotel("Raghu","Double",4);
		obj2.display();
		//copy constructor
		Hotel obj3=new Hotel(obj2);
		obj3.display();
	}
	}

 public class Hotel {
	//Attributes
	String guestName;
	String roomType;
	int nights;
	
  //Default Constructor
	Hotel(){
		guestName="Priya";
		roomType="single";
		nights=2;
	}
	//Parameterized Constructor
	Hotel(String guestName,String roomType,int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
		
	}
	//copy constructor
	Hotel(Hotel previoushotel){
		this.guestName=previoushotel.guestName;
		this.roomType=previoushotel.roomType;
		this.nights=previoushotel.nights;
	}
	
	public void display(){
		System.out.println("Guest Name is  : " + guestName);
		System.out.println("Room Type is  : " + roomType);
		System.out.println("nights is  : " + nights);
	}
}