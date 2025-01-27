package main.LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;
 class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create library items
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Nat Geo Team");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Store items in a list
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        // Display details and loan duration for each item
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }

        // Demonstrate reserving items
        System.out.println("\nReserving Items:");
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem();
        System.out.println("Is the book available? " + reservableBook.checkAvailability());

        Reservable reservableMagazine = (Reservable) magazine;
        reservableMagazine.reserveItem();
        System.out.println("Is the magazine available? " + reservableMagazine.checkAvailability());

        Reservable reservableDVD = (Reservable) dvd;
        reservableDVD.reserveItem();
        System.out.println("Is the LibraryManagementSystem.DVD available? " + reservableDVD.checkAvailability());
    }
}
