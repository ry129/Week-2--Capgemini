  class Main{
public static void main(String[]args){
  Book obj=new LibraryManagement("DataBaseManagement" , "Raman Shiv" , 12345);
   if(obj instanceof Book){
	System.out.println("obj is an instance of Book");
        }
        if (obj instanceof LibraryManagement) {
            System.out.println("obj is also an instance of LibraryManagement");
        }
		 LibraryManagement obj1=new LibraryManagement("DataBaseManagement" , "Raman Shiv" , 12345);
		 obj1.display();
		 
		
       }
	  
  }
	   
  
    class Book{
	String title;
	String author;
	final int isbn;
	
	Book(String title , String author , int isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
}	
    class LibraryManagement extends Book{
	static String libraryName="sankalp";
	LibraryManagement(String title,String author,int isbn){
		super(title,author,isbn);
		} 
		public void display(){
		System.out.println("library Name is :"+ libraryName);
		System.out.println("Book Name is :"+ title);
		System.out.println("Author Name is :"+ author);
		System.out.println("Book code is :"+ isbn);
		}
	}
  