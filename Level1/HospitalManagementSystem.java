/*Sample Program 7: Hospital Management System
Create a Patient class with the following features:
Static:
A static variable hospitalName shared among all patients.
A static method getTotalPatients() to count the total patients admitted.
This:
Use this to initialize name, age, and ailment in the constructor.
Final:
Use a final variable patientID to uniquely identify each patient.
Instanceof:
Check if an object is an instance of the Patient class before displaying its details.
*/
class Patient{
    //static variable
    public static String hospitalName = "Gayatri MultiSpeciality Hospital";
    static int totalPatients=0;
    static int randomId=1000;
    
    //Instance variables
    private String name; 
    private int age; 
    private String ailment;

    //final variable
    private final int patientId;



    
    //constructer to store
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment; 
        this.patientId= randomId++ +1; 
        totalPatients++; 
    }


    //to get the total number of the patients
    public static void getTotalPatients(){
        System.out.println("Total Patients in the hospital is: "+ totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println();
    }

    // Method to check if an object is an instance of Patient class
    public static void checkInstance(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj; 
            patient.displayPatientDetails(); 
        } else {
            System.out.println("This is not a Patient object.");
        }
    }
} 
public class HospitalManagementSystem{
    public static void main(String[] args) {
         // Create Patient objects
         Patient patient1 = new Patient("Vivek Sahu", 21, "Cough");
         Patient patient2 = new Patient("Suraj Patel", 22, "Fever");
 
         // Display details for patient1
         patient1.displayPatientDetails();
         System.out.println();
 
         // Display details for patient2
         patient2.displayPatientDetails();
         System.out.println();
 
         // Display the total number of patients
         Patient.getTotalPatients();
         System.out.println();
 
         // Check if an object is an instance of Patient class
         Patient.checkInstance(patient1); 
         Patient.checkInstance("Not a patient"); 
    }
    
}