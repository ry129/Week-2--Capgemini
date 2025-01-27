package main.LibraryManagementSystem;

// Subclass: Magazine
public class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

     Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Magazine \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("Magazine \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
