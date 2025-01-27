package main.HospitalPatientManagementSystem;

// Abstract Class: HospitalPatientManagementSystem.Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Concrete Method: Get HospitalPatientManagementSystem.Patient Details
    public String getPatientDetails() {
        return "HospitalPatientManagementSystem.Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Abstract Method: Calculate Bill
    public abstract double calculateBill();
}
