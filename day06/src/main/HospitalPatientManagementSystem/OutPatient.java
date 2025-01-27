package main.HospitalPatientManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Subclass: OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalRecords; // Encapsulated medical history

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new ArrayList<>();
    }

    // Implementing calculateBill()
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Implementing HospitalPatientManagementSystem.MedicalRecord Interface
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return new ArrayList<>(medicalRecords); // Return a copy of the records
    }
}
