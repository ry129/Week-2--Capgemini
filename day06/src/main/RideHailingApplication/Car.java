package main.RideHailingApplication;

// Subclass: Car
class Car extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Override calculateFare()
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // Implement GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation != null ? currentLocation : "Unknown Location";
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}
