class Main{
	public static void main(String[] args){
		Student obj = new Uname("Riya",146,'A');
		if(obj instanceof Student){
			System.out.println("obj is an instance of Student");
		}
		if(obj instanceof Uname){
			System.out.println("obj is an instance of University Name");
		}
		Uname obj1=new Uname("Riya",146,'A');
		obj1.display();
		
		System.out.println("Total Number of students : " + Student.displaytotalstudents);
		
		}
}
class Student{
	String name;
	final int roll;
	char ch;
	static int displaytotalstudents=0;
	Student(String name,int roll,char ch){
		this.name=name;
		this.roll=roll;
		this.ch=ch;
		displaytotalstudents++;
	}
	
}


class Uname extends Student{
	static String Uname="RGPV";
	Uname(String name,int roll,char ch){
		super(name,roll,ch);
	}
	public void display(){
		System.out.println("University Name is : "+Uname);
		System.out.println("Student Name is : " + name);
		System.out.println("Roll Number is : " + roll);
		System.out.println("Grade is : " + ch);
		
	}
}
	
