import java.util.Scanner;
class Main{	
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	//System.out.println("Enter Radius:");
	 double radius=sc.nextDouble();
	 
		Main.Circle obj = new Circle();
		obj.area(radius);
		obj.circum(radius);
	}

 public static class Circle {
	public
	double radius;
	 public static void area( double radius){
	System.out.println("Area of Circle is :" + 3.14*radius*radius);
}
	public static void circum(double radius){
		System.out.println("Circumference of Circle is :" + (2*3.14*radius));
	}
	
		
	}
}