package main.LibraryManagementSystem;

// Subclass: LibraryManagementSystem.DVD
public  class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

     DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs can be loaned for 3 days
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("LibraryManagementSystem.DVD \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("LibraryManagementSystem.DVD \"" + getTitle() + "\" is already reserved.");
        }
    }




    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
