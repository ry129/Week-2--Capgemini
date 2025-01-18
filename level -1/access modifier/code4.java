public class EmployeeRecords {

    // Parent class: Employee
    public static class Employee {
        // Instance variables
        public int employeeID;   // Public access: Can be accessed anywhere
        protected String department; // Protected access: Accessible within the same package and subclasses
        private double salary; // Private access: Can only be accessed within this class

        // Constructor to initialize employee details
        public Employee(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        // Public method to modify salary
        public void setSalary(double salary) {
            if (salary >= 0) {
                this.salary = salary;
            } else {
                System.out.println("Invalid salary value.");
            }
        }

        // Public method to access salary
        public double getSalary() {
            return salary;
        }

        // Method to display employee details
        public void displayEmployeeDetails() {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
            System.out.println("Salary: $" + salary);
        }
    }

    // Subclass: Manager
    public static class Manager extends Employee {

        // Constructor for Manager
        public Manager(int employeeID, String department, double salary) {
            super(employeeID, department, salary);  // Call the parent class constructor
        }

        // Method to display details of a Manager
        public void displayManagerDetails() {
            // Accessing protected member 'department' and public member 'employeeID' from the parent class
            System.out.println("Manager Details:");
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);  // Protected variable is accessible here
            System.out.println("Salary: $" + getSalary());  // Accessing private salary using getter
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee1 = new Employee(101, "Marketing", 50000.0);
        employee1.displayEmployeeDetails();

        // Modify the salary using setter method
        employee1.setSalary(55000.0);
        System.out.println("\nAfter modifying salary:");
        employee1.displayEmployeeDetails();

        // Create an instance of Manager
        Manager manager1 = new Manager(102, "Sales", 80000.0);
        manager1.displayManagerDetails();
    }
}
