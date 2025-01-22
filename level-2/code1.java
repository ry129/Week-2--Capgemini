import java.util.ArrayList;
import java.util.List;
// Main Class
public class LibrarySystem {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        // Add books to the libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);
        library2.addBook(book4);
        library2.addBook(book1); // Demonstrating a book can exist in multiple libraries

        // Display library details
        library1.displayBooks();
        library2.displayBooks();
    }
}








// Book Class
class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library Class
class Library {
    String name;
    List<Book> books; // Aggregation: Library contains books

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Books in " + name + " Library:");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}

