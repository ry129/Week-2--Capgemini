import java.util.Scanner;
class Main{	

		
	public static void main(String[]args){
		
		BankAccount obj = new BankAccount();
		obj.depositingMoney(obj.balance);
		obj.withdraw(obj.balance);
		
	  
	}
   public static class BankAccount {
	
	
	public String accountHolder;
	 String accountNo;
	public static int balance; 
	 BankAccount(){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter AccountHolder Name :");
		 accountHolder=sc.nextLine();
		 System.out.println("Enter Account No. :");
		 accountNo=sc.nextLine();
		 System.out.println("Enter Balance :");
		  balance=sc.nextInt();
	 }
	 public void depositingMoney(int balance){
		 Scanner sc=new Scanner(System.in);
		  this.balance=balance;
		 System.out.println("Enter the amount to be deposited");
		 int amount=sc.nextInt();
		 balance+=amount;
		System.out.println("Balance is " + (balance));
		
	 }
	 public void withdraw(int balance){
		 Scanner sc=new Scanner(System.in);
		 this.balance=balance;
		 System.out.println("Enter Withdrawl amount");
		 int withdraw=sc.nextInt();
		 if(withdraw <= balance){
			 System.out.println("Withdrawal Successfull " + "balance left is " +(balance-withdraw));
		 }
		 else {
			 System.out.println("Insufficient Balance");
	 }
	 } 
		 
	 
	} } 