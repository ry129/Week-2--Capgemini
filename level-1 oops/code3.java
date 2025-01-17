class Main{	
		
	public static void main(String[]args){
		BookDetails obj = new BookDetails();
		obj.displayDetails("Tempest","William Shakespeare",500);
	}
}


class BookDetails {
	public
	 String title;
	 String author;
	 int price;
	public  void displayDetails(String title , String author ,int price){
		this.title=title;
		this.author=author;
		this.price=price;
		System.out.println("Title of the Book :"+ title);
		System.out.println("Author of the Book :"+ author);
		System.out.println("Price of the Book :"+ price);
	}
}