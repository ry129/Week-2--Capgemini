import java.util.ArrayList;
import java.util.List;
public class CompanySystem {
    public static void main(String[] args) { // Ensure this signature is correct
        // Create a company
        Company company = new Company("Capgemini");

        // Add departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Add employees to departments
        company.addEmployeeToDepartment("IT", "Yogesh");
        company.addEmployeeToDepartment("IT", "Purvansh");
        company.addEmployeeToDepartment("HR", "Yash");

        // Display company structure
        company.displayDepartments();

        // Deleting the company removes all departments and employees
        company = null;
        System.out.println("Company deleted. All associated departments and employees are removed.");
    }
}








// Employee Class
class Employee {
    String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }
}

// Department Class
class Department {
    String name;
    List<Employee> employees; // Composition: Department contains Employees

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    // Display employees
    public void displayEmployees() {
        System.out.println("Employees in " + name + " Department:");
        for (Employee employee : employees) {
            System.out.println("- " + employee.name);
        }
    }
}

// Company Class
class Company {
    String name;
    List<Department> departments; // Composition: Company contains Departments

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add an employee to a specific department
    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (department.name.equals(departmentName)) {
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found in " + name + " Company.");
    }

    // Display all departments and their employees
    public void displayDepartments() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayEmployees();
        }
    }
}


