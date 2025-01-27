package main.VehicleRentalSystem;

abstract class Vehicle {
    private int vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(int vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double rentalCost(double days);

    public void display() {
        System.out.println("vehicleNumber -  " + vehicleNumber + " type - "+ type + " rentalRate - " + rentalRate);
    }
}
