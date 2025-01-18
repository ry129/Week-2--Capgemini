import java.util.Scanner;

class Book {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Mark the book as borrowed
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Create a few books
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 10.99, true);
        Book book2 = new Book("1984", "George Orwell", 12.50, true);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 8.75, false);

        // Display book details
        System.out.println("Available Books:");
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();
        book3.displayDetails();
        System.out.println();

        // Borrow a book
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the book you want to borrow:");
        String bookTitle = sc.nextLine();

        // Check and borrow the appropriate book
        if (bookTitle.equalsIgnoreCase(book1.title)) {
            book1.borrowBook();
        } else if (bookTitle.equalsIgnoreCase(book2.title)) {
            book2.borrowBook();
        } else if (bookTitle.equalsIgnoreCase(book3.title)) {
            book3.borrowBook();
        } else {
            System.out.println("Sorry, the book \"" + bookTitle + "\" is not available in our library.");
        }
    }
}

