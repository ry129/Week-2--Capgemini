package main.RideHailingApplication;

// Abstract Class: Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Concrete Method: Get Vehicle Details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: $" + ratePerKm;
    }

    // Getter for ratePerKm (Encapsulation)
    public double getRatePerKm() {
        return ratePerKm;
    }

    // Abstract Method: Calculate Fare
    public abstract double calculateFare(double distance);
}
