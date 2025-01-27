 package main.RideHailingApplication;

 import java.util.ArrayList;
import java.util.List;

// Main Class: RideHailingApp
 class RideHailingApp {
    // Method to calculate fares for multiple vehicles
    public static void processRides(List<Vehicle> vehicles, double distance) {
        System.out.println("--- Fare Calculation for All Vehicles ---");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("C001", "John Doe", 10.0);
        Vehicle bike = new Bike("B001", "Jane Smith", 5.0);
        Vehicle auto = new Auto("A001", "Bob Brown", 8.0);

        // Update locations
        ((GPS) car).updateLocation("Downtown");
        ((GPS) bike).updateLocation("Airport");
        ((GPS) auto).updateLocation("City Center");

        // Print current locations
        System.out.println("--- Current Locations ---");
        System.out.println("RideHailingApplication.Car Location: " + ((GPS) car).getCurrentLocation());
        System.out.println("RideHailingApplication.Bike Location: " + ((GPS) bike).getCurrentLocation());
        System.out.println("RideHailingApplication.Auto Location: " + ((GPS) auto).getCurrentLocation());
        System.out.println();

        // Store vehicles in a list
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Calculate and display fares for all vehicles
        processRides(vehicles, 15.0); // Example distance: 15 km
    }
}
