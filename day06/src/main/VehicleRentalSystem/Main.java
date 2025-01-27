package main.VehicleRentalSystem;

import java.util.List;
import java.util.ArrayList;

class VehicleRentalSystem {
    public static void processVehicles(List<Vehicle> vehicles, int rentalDays) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("\nVehicle Details: ");
            vehicle.display();
            System.out.println("Rental Cost for " + rentalDays + " days" + vehicle.rentalCost(rentalDays));
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: $" + insurable.calculateInsurance());
                System.out.println("Insurance Details: " + insurable.getInsuranceDetails());
            } else {
                System.out.println("This vehicle is not insurable.");
            }
        }
    }

    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle car = new Car(123, 40.0, "CAR12345");
        Vehicle bike = new Bike(56, 15.0,"BIKE456");
        Vehicle truck = new Truck(789, 20.0);

        // Add vehicles to a list
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Process vehicles for rental and insurance details
        processVehicles(vehicles, 5);

    }

    }



