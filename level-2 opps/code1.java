import java.util.Scanner;
class Main{	

		
	public static void main(String[]args){
		
		Main.StudentReport obj = new StudentReport();
		obj.calculateGrade();
		obj.displayDetails();
	  
	}
    public static class StudentReport {
	
	
	 String name;
	 int rollNo;
	 int marks; 
	 StudentReport(){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Name :");
		 name=sc.nextLine();
		 System.out.println("Enter rollNo. :");
		 rollNo=sc.nextInt();
		 System.out.println("Enter Marks :");
		 marks=sc.nextInt();
	 }
	 public void calculateGrade(){
		 if(marks>=90){
			 System.out.println("Grade A");
		 } else if(marks>=70){
			 System.out.println("Grade B");
		 } else if(marks >=50){
			 System.out.println("Grade C");
		 } else {
			 System.out.println("Grade D");
		 }
	 }
	 public  void displayDetails(){
		
		System.out.println("Student Marks :"+ marks);
		
	}
		
		

} }