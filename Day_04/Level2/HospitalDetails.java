package Day_04_Level_02;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private String patientId;

    public Patient(String name, String patientId) {
        this.name = name;
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public String getPatientId() {
        return patientId;
    }

    // Method to view patient details
    public void viewPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient ID: " + patientId);
    }
}

class Doctor {
    private String name;
    private String doctorId;
    private List<Patient> patients;

    public Doctor(String name, String doctorId) {
        this.name = name;
        this.doctorId = doctorId;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDoctorId() {
        return doctorId;
    }

    // Method to consult with a patient and add them to the list of patients for the doctor
    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName() + ".");
    }

    // Method to view all patients that the doctor is consulting
    public void viewPatients() {
        System.out.println("Doctor " + name + " is consulting the following patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
        System.out.println();
    }
}

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    // Method to add doctors and patients to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to view the hospital details (doctors and patients)
    public void viewHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors in the hospital:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
        System.out.println("Patients in the hospital:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
        System.out.println();
    }
}

public class HospitalDetails {
    public static void main(String[] args) {
        // Create Patients
        Patient patient1 = new Patient("sachin", "P001");
        Patient patient2 = new Patient("vivek", "P002");
        Patient patient3 = new Patient("Ashish", "P003");

        // Create Doctors
        Doctor doctor1 = new Doctor("Dr. Black", "D001");
        Doctor doctor2 = new Doctor("Dr. Green", "D002");

        // Create Hospital
        Hospital hospital = new Hospital("City Hospital");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        // View Hospital details
        hospital.viewHospitalDetails();

        // Doctor consulting patients
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient3);

        // View patients being consulted by each doctor
        doctor1.viewPatients();
        doctor2.viewPatients();
    }
}
