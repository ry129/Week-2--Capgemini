package main.VehicleRentalSystem;

 public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Car(int vehicleNumber,  double rentalRate , String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double rentalCost(double days) {
        return (days * getRentalRate());
    }

    @Override
    public String getInsuranceDetails() {
        return "POLICY NUMBER: " + insurancePolicyNumber;
    }

    @Override
    public double calculateInsurance() {
        return 50.0;
    }
}
