import java.util.Scanner;
class Main{	
	public static void main(String[] args){
		
		//Parameterized constructor
		Person obj2=new Person("Riya",20,30000);
		obj2.display();
		//copy
		Person obj3=new Person(obj2);
		obj3.display();
	}
	}

 public class Person {
	//Attributes
	String name;
	int age;
	int salary;
	
	//Parameterized Constructor
	Person(String name , int age , int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	//copy constructor
	Person(Person previousPerson){
		this.name=previousPerson.name;
		this.age=previousPerson.age;
		this.salary=previousPerson.salary;
	}
	
	public void display(){
		System.out.println("Name is :" + name);
		System.out.println("Age is :"+age);
		System.out.println("Salary is :"+salary);
		
	}
}
