class Main{
	public static void main(String[] args){
		Hospital obj = new Hospital("chum",2,"fever");
		if(obj instanceof Patient){
			System.out.println("obj is an instance of Patient");
		}
		if(obj instanceof Hospital){
			System.out.println("obj is an instance of Hospital");
		}
		System.out.println("Hospital Name is : "+Hospital.hname);
		System.out.println("Patient ID is :"+ Hospital.id);
		Hospital obj1=new Hospital("John",30,"Malaria");
		Hospital obj2=new Hospital("Doe",40,"Fever");
		Hospital obj3=new Hospital("Jim",15,"Cold");
		Hospital obj4=new Hospital("Sim",44,"Infection");
		obj.display();
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();
		
		System.out.println("Total Number of Patients admitted : " + Patient.gettotalpatients);
		
		}
}
class Patient{
	String name;
	 int age;
	String ailment;
	static int gettotalpatients=0;
	Patient(String name,int age,String ailment){
		this.name=name;
		this.age=age;
		this.ailment=ailment;
		gettotalpatients++;
	}
	
}


class Hospital extends Patient{
	static String hname="City-Hospital";
	static final int id=12;
	Hospital(String name,int age,String ailment){
		super(name,age,ailment);
	}
	public void display(){
		
		System.out.println("Patient Name is : " + name);
		System.out.println("Paatient Age is : " + age);
		System.out.println("Patient ailemnt : " + ailment);
		
	}
}
