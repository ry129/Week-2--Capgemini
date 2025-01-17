import java.util.*;
class Main{	

		
	public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Text :");
		 String text=sc.nextLine();
		Main.Palindrome obj = new Palindrome();
		obj.isPalindrome(text);
		
	  
	}
	
public static class Palindrome {
	
	

	 public String checker(String text){
		 String s1="";
		 for(int i=text.length()-1;i>=0;i--){
			char temp1 = text.charAt(i);
			s1+=temp1;
		 }
		 return s1;
	 }
		
		
	  public void isPalindrome(String text)
   {
      String temp= checker(text);
	  if(text.equals(temp))
	  {
	     System.out.println("true");
	  }
	  else
	   System.out.println("false :");
   }
	 }
		
		 }
	 