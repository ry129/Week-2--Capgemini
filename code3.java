 class Main{
public static void main(String[]args){
  company obj=new company("Riya",12,"softwaredeveloper");
   if(obj instanceof Employee){
	System.out.println("obj is an instance of Employee");
        }
        if (obj instanceof company) {
            System.out.println("obj is also an instance of company");
        }
		System.out.println("Company Name is :"+ company.companyName);
		 company obj1=new company("Vivek",11,"Team Manager");
		 company obj2=new company("Tarun",13,"Project Manager");
		 company obj3=new company("Bhavya",15,"HR");
		 obj.display();
		 obj1.display();
		 obj2.display();
		 obj3.display();
		 
		 System.out.println("Total number of Employees " +Employee.totalnumberofemployees);
		
       }
	  
  }
	   
  
    class Employee{
	String Name;
	final int id;
	String designation;
	static int totalnumberofemployees=0;
   Employee(String Name , int id , String designation){
		this.Name=Name;
		this.id=id;
		this.designation=designation;
		totalnumberofemployees++;
	}
	
}	
    class company extends Employee{
	static String companyName="Capgemini";
	company(String Name,int id,String designation){
		super(Name,id,designation);
		} 
		public  void display(){
		
		System.out.println("Employee Name is :"+ Name);
		System.out.println("Employee id :" + id);
		System.out.println("Designation is  :" + designation);
		
		}
	}
  