package main.EmployeeManagementSystem;

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedSalary;

    // Constructor
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    // Implement calculateSalary() for fixed salary
    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }

    // Implement Department methods
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

