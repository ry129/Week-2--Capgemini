package main.HospitalPatientManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Subclass: InPatient
class InPatient extends Patient implements MedicalRecord {
    private double dailyRoomRate;
    private int numberOfDaysAdmitted;
    private List<String> medicalRecords; // Encapsulated medical history

    // Constructor
    public InPatient(String patientId, String name, int age, double dailyRoomRate, int numberOfDaysAdmitted) {
        super(patientId, name, age);
        this.dailyRoomRate = dailyRoomRate;
        this.numberOfDaysAdmitted = numberOfDaysAdmitted;
        this.medicalRecords = new ArrayList<>();
    }

    // Implementing calculateBill()
    @Override
    public double calculateBill() {
        return dailyRoomRate * numberOfDaysAdmitted;
    }

    // Implementing MedicalRecord Interface
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return new ArrayList<>(medicalRecords); // Return a copy of the records
    }
}
