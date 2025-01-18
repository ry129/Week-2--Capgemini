public class Course {
    // Instance variables
    String courseName;
    int duration;  // in hours
    double fee;

    // Class variable (shared among all instances)
    static String instituteName = "ABC Institute";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 40, 299.99);
        Course course2 = new Course("Web Development", 50, 399.99);
        
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        
        // Updating institute name
        Course.updateInstituteName("XYZ Academy");
        
        System.out.println("\nAfter updating the institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
