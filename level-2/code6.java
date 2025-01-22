import java.util.ArrayList;
import java.util.List;

// Doctor Class
class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>(); // A doctor can see multiple patients

    Doctor(String name) {
        this.name = name;
    }

    // Method to consult a patient
    void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient); // Add patient to doctor's list
        }
        if (!patient.doctors.contains(this)) {
            patient.doctors.add(this); // Add doctor to patient's list
        }
        System.out.println(name + " is consulting with " + patient.name);
    }

    // Display all patients of the doctor
    void displayPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.name);
        }
    }
}

// Patient Class
class Patient {
    String name;
    List<Doctor> doctors = new ArrayList<>(); // A patient can consult multiple doctors

    Patient(String name) {
        this.name = name;
    }

    // Display all doctors of the patient
    void displayDoctors() {
        System.out.println("Doctors for patient " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.name);
        }
    }
}

// Hospital Class
class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    // Add a doctor to the hospital
    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display all doctors in the hospital
    void displayDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.name);
        }
    }

    // Display all patients in the hospital
    void displayPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.name);
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Mahajan");
        Doctor doctor2 = new Doctor("Thukar");

        // Create patients
        Patient patient1 = new Patient("Aman");
        Patient patient2 = new Patient("roman");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Display hospital details
        hospital.displayDoctors();
        hospital.displayPatients();

        // Consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display doctor-patient relationships
        doctor1.displayPatients();
        doctor2.displayPatients();
        patient1.displayDoctors();
        patient2.displayDoctors();
    }
}
