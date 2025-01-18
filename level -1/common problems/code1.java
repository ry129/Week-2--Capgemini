class Main{	
	public static void main(String[] args){
		//Default Constructor
		Book obj=new Book();
		obj.displayOrderDetails();
		//Parameterized constructor
		Book obj2=new Book("Tempest","William Shakespeare",500);
		obj2.displayOrderDetails();
	}
	}

 public class Book {
	//Attributes
	String title;
	String author;
	int price;
	//Default Constructor
	Book(){
		title = "Guest";
		author = "William Shakespeare";
		price = 500;
	}
	//Parameterized Constructor
	Book(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayOrderDetails(){
		System.out.println("Title Name:" + title);
		System.out.println("Author Name:" + author);
		System.out.println("Total Price:" + price);
	}
}

	
		
		