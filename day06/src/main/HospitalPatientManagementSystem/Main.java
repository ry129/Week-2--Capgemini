package main.HospitalPatientManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Main Class: HospitalManagement
 class HospitalManagement {
    public static void main(String[] args) {
        // Create Patients
        Patient inpatient = new InPatient("P001", "John Doe", 45, 3000.0, 5); // Admitted for 5 days
        Patient outpatient = new OutPatient("P002", "Jane Smith", 30, 500.0); // Consultation only

        // Add Medical Records
        ((MedicalRecord) inpatient).addRecord("Diagnosed with Pneumonia");
        ((MedicalRecord) outpatient).addRecord("Routine health checkup");

        // Store Patients in a List
        List<Patient> patientList = new ArrayList<>();
        patientList.add(inpatient);
        patientList.add(outpatient);

        // Process Patients and Display Details
        System.out.println("--- Patient Details and Billing ---");
        for (Patient patient : patientList) {
            // Display Patient Details
            System.out.println(patient.getPatientDetails());

            // Display Medical Records
            List<String> records = ((MedicalRecord) patient).viewRecords();
            System.out.println("Medical Records: " + records);

            // Display Billing Details
            System.out.println("Total Bill: $" + patient.calculateBill());
            System.out.println();
        }
    }
}




