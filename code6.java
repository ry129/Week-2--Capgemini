class Main{
	public static void main(String[] args){
		Vehicle obj = new RegisFee("Riya","Bullet",1234);
		if(obj instanceof Vehicle){
			System.out.println("obj is an instance of Vehicle");
		}
		if(obj instanceof RegisFee){
			System.out.println("obj is an instance of RegisFee");
		}
		RegisFee obj1=new RegisFee("Riya","Bullet",1234);
		obj1.setregisFee(6000);
		obj1.display();
		}
}
class Vehicle{
	String ownername;
	String vehicleType;
	int reginumber;
	
	Vehicle(String ownername,String vehicleType,int reginumber){
		this.ownername=ownername;
		this.vehicleType=vehicleType;
		this.reginumber=reginumber;
		
	}
	
}


class RegisFee extends Vehicle{
	static int regisFee=5000;
	RegisFee(String ownername,String vehicleType,int reginumber){
		super(ownername,vehicleType,reginumber);
	}
	public void setregisFee(int regisFee){
		RegisFee.regisFee=regisFee;
	}
	public static int getregisFee(){
		return regisFee;
	}
	
	
	
	
	
	
	public void display(){
		System.out.println("Registration Fee  is : "+regisFee);
		System.out.println("Owner Name  is : " + ownername);
		System.out.println("Vehicle Type is : " + vehicleType);
		System.out.println("Registration Number  is : " + reginumber);
		
	}
}