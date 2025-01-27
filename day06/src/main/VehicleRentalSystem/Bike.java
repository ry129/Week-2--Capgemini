package main.VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable{
        private String insurancePolicyNumber;
        Bike(int vehicleNumber,  double rentalRate , String insurancePolicyNumber) {
            super(vehicleNumber, "Bike", rentalRate);
            this.insurancePolicyNumber = insurancePolicyNumber;
        }
        @Override
        public double rentalCost(double days) {
            return (0.9*days*getRentalRate());
        }
        @Override
        public String getInsuranceDetails(){
            return "POLICY NUMBER: " + insurancePolicyNumber;
        }
        @Override
        public double calculateInsurance(){
            return 20.0;
        }
    }
