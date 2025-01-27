package main.LibraryManagementSystem;

// Abstract class LibraryItem
public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Concrete method
    public String getItemDetails() {
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Abstract method
    public abstract int getLoanDuration(); // Loan duration in days
}
