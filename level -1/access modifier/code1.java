public class UniversityManagementSystem {

    // Parent class: Student
    public static class Student {
        // Instance variables
        public int rollNumber;
        protected String name;
        private double CGPA;

        // Constructor to initialize student details
        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        // Public method to access CGPA
        public double getCGPA() {
            return CGPA;
        }

        // Public method to modify CGPA
        public void setCGPA(double CGPA) {
            if (CGPA >= 0 && CGPA <= 10) {
                this.CGPA = CGPA;
            } else {
                System.out.println("Invalid CGPA value.");
            }
        }

        // Method to display student details
        public void displayDetails() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + CGPA);
        }
    }

    // Subclass: PostgraduateStudent
    public static class PostgraduateStudent extends Student {

        // Constructor for PostgraduateStudent
        public PostgraduateStudent(int rollNumber, String name, double CGPA) {
            super(rollNumber, name, CGPA);  // Call the parent class constructor
        }

        // Method to display details of a Postgraduate student
        public void displayPostgraduateDetails() {
            // Accessing protected member 'name' from the parent class
            System.out.println("Postgraduate Student Details:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);  // Protected variable is accessible here
            System.out.println("CGPA: " + getCGPA());  // Accessing private CGPA using getter
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Create an instance of Student
        Student student1 = new Student(101, "Alice", 8.5);
        student1.displayDetails();

        // Modify CGPA using setter method
        student1.setCGPA(9.2);
        System.out.println("\nAfter modifying CGPA:");
        student1.displayDetails();

        // Create an instance of PostgraduateStudent
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.0);
        pgStudent.displayPostgraduateDetails();
    }
}
