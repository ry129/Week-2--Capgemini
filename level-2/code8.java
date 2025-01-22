import java.util.ArrayList;
import java.util.List;

// Course Class
class Course1 {
    String name;
    Professor professor;
    List<Student> students = new ArrayList<>(); // Aggregates students

    Course1(String name) {
        this.name = name;
    }

    // Assign a professor to the course
    void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.name + " is assigned to teach " + name);
    }

    // Enroll a student in the course
    void enrollStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.name + " has enrolled in " + name);
    }

    // Display course details
    void displayDetails() {
        System.out.println("Course: " + name);
        System.out.println("Professor: " + (professor != null ? professor.name : "None assigned"));
        System.out.println("Enrolled students:");
        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }
}

// Student Class
class Student1 {
    String name;
    List<Course> courses = new ArrayList<>(); // Aggregates courses

    Student1(String name) {
        this.name = name;
    }

    // Enroll in a course
    void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // Register the student in the course
    }

    // Display enrolled courses
    void displayCourses() {
        System.out.println("Courses for student " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.name);
        }
    }
}

// Professor Class
class Professor {
    String name;
    List<Course> courses = new ArrayList<>(); // Aggregates courses

    Professor(String name) {
        this.name = name;
    }

    // Assign a course to the professor
    void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this); // Assign the professor to the course
    }

    // Display assigned courses
    void displayCourses() {
        System.out.println("Courses taught by Professor " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.name);
        }
    }
}

// Main Class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create students
        Student1 student1 = new Student1("ramesh");
        Student1 student2 = new Student1("suresh");

        // Create professors
        Professor professor1 = new Professor("Dr. pal");
        Professor professor2 = new Professor("Dr. sahu");

        // Create courses
        Course1 course = new Course1("Mathematics");
        Course1 course2 = new Course1("Computer Science");

        // Assign professors to courses
        professor1.assignCourse(course);
        professor2.assignCourse(course2);

        // Students enroll in courses
        student1.enrollCourse(course);
        student1.enrollCourse(course2);
        student2.enrollCourse(course);

        // Display details
        course.displayDetails();
        course2.displayDetails();

        student1.displayCourses();
        student2.displayCourses();

        professor1.displayCourses();
        professor2.displayCourses();
    }
}
