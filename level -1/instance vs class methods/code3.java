public class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (shared among all instances)
    static double registrationFee = 100.0;  // Initial fixed registration fee

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: $" + registrationFee);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice", "Sedan");
        Vehicle vehicle2 = new Vehicle("Bob", "SUV");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Updating the registration fee for all vehicles
        Vehicle.updateRegistrationFee(120.0);

        System.out.println("\nAfter updating the registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
