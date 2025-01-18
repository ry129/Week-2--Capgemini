import java.util.Scanner;
class Main{	
	public static void main(String[] args){
		//Default Constructor
		Circle obj=new Circle();
		obj.display();
		//Parameterized constructor
		Circle obj2=new Circle(2.25);
		obj2.display();
	}
	}

 public class Circle {
	//Attributes
	
	double radius;
	//Default Constructor
	Circle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius:");
		 this.radius = sc.nextDouble();
	}
	//Parameterized Constructor
	Circle(double radius){
		this.radius=radius;
		
	}
	public void display(){
		System.out.println("Radius is :" + radius);
		
	}
}
