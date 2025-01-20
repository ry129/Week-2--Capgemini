  class Main{
public static void main(String[]args){
  Account obj=new BankAccount("Riya",12345);
   if(obj instanceof BankAccount){
	System.out.println("obj is an instance of BankAccount");
        }
        if (obj instanceof Account) {
            System.out.println("obj is also an instance of Account");
        }
		 BankAccount.gettotalaccount();
		
       }
	  
  }
	   
  
    class Account{
	String accountHolderName;
	final int accountNumber;
	static int totalbankaccounts=0;
	
	Account(String accountHolderName , int accountNumber){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		totalbankaccounts++;
	}
	
}	
    class BankAccount extends Account{
	static String bankName="sbi";
	BankAccount(String accountHolderName,int accountNumber){
		super(accountHolderName,accountNumber);
		} 
		public static void gettotalaccount(){
		System.out.println("Bank Name is :"+ bankName);
		System.out.println("Total Number Of Accounts is :" + totalbankaccounts);
		}
	}
  
	
		
		
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	