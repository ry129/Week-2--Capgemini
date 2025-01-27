package main.EmployeeManagementSystem;


import java.util.ArrayList;
import java.util.List;

class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list to hold employees
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee and PartTimeEmployee objects
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, "Alice", 5000, 2000);
        fullTimeEmp.assignDepartment("HR");

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(2, "Bob", 2000, 20, 50);
        partTimeEmp.assignDepartment("IT");

        employees.add(fullTimeEmp);
        employees.add(partTimeEmp);

        // Process and display employee details
        for (Employee emp : employees) {
            System.out.println("----- Employee Details -----");
            emp.displayDetails();

            // Polymorphic call for department details
            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }
            System.out.println();
        }
    }
}


