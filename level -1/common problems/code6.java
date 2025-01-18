import java.util.Scanner;

class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;
    private double totalCost;

    // Default Constructor
    public CarRental() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        this.customerName = sc.nextLine();
        System.out.println("Enter Car Model:");
        this.carModel = sc.nextLine();
        System.out.println("Enter Number of Rental Days:");
        this.rentalDays = sc.nextInt();
        System.out.println("Enter Cost Per Day:");
        this.costPerDay = sc.nextDouble();
        this.totalCost = calculateTotalCost(); // Calculate total cost
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
        this.totalCost = calculateTotalCost(); // Calculate total cost
    }

    // Method to calculate total cost
    private double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost Per Day: $" + costPerDay);
        System.out.println("Total Cost: $" + totalCost);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the default constructor
        System.out.println("Using Default Constructor:");
        CarRental rental1 = new CarRental();
        rental1.displayRentalDetails();
        System.out.println();

        // Using the parameterized constructor
        System.out.println("Using Parameterized Constructor:");
        CarRental rental2 = new CarRental("Alice Johnson", "Toyota Corolla", 7, 50.0);
        rental2.displayRentalDetails();
    }
}
