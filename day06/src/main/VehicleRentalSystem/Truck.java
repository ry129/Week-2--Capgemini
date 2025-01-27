package main.VehicleRentalSystem;

public class Truck extends Vehicle {
    Truck(int vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double rentalCost(double days) {
        return (100 + days * getRentalRate());
    }
}
