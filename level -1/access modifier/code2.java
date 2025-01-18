public class BookLibrarySystem {

    // Parent class: Book
    public static class Book {
        // Instance variables
        public String ISBN;   // Public access: Can be accessed anywhere
        protected String title;  // Protected access: Accessible within the same package and subclasses
        private String author;  // Private access: Can only be accessed within this class

        // Constructor to initialize book details
        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        // Public method to set the author's name
        public void setAuthor(String author) {
            this.author = author;
        }

        // Public method to get the author's name
        public String getAuthor() {
            return author;
        }

        // Method to display book details
        public void displayDetails() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    // Subclass: EBook
    public static class EBook extends Book {

        // Constructor for EBook
        public EBook(String ISBN, String title, String author) {
            super(ISBN, title, author);  // Call the parent class constructor
        }

        // Method to display details of an EBook
        public void displayEBookDetails() {
            // Accessing protected member 'title' and public member 'ISBN' from the parent class
            System.out.println("EBook Details:");
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);  // Protected variable is accessible here
            System.out.println("Author: " + getAuthor());  // Accessing private author using getter
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Create an instance of Book
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "James Gosling");
        book1.displayDetails();

        // Modify the author using setter method
        book1.setAuthor("Herbert Schildt");
        System.out.println("\nAfter modifying author:");
        book1.displayDetails();

        // Create an instance of EBook
        EBook ebook1 = new EBook("978-1-234-56789-7", "Learn Java", "Joshua Bloch");
        ebook1.displayEBookDetails();
    }
}
