import java.util.ArrayList;
import java.util.List;

// School Class
class School {
    String name;
    List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Add student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students in the school
    public void displayStudents() {
        System.out.println("Students at " + name + ":");
        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}

// Student Class
class Student {
    String name;
    List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enroll student in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);  // Enroll the student in the course as well
        }
    }

    // Display all courses the student is enrolled in
    public void displayCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}

// Course Class
class Course {
    String courseName;
    List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Add student to the course
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display all students enrolled in the course
    public void displayStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Technocrats High School");

        // Create students
        Student student1 = new Student("Aman");
        Student student2 = new Student("Vivek");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Display students in the school
        school.displayStudents();

        // Display courses for each student
        student1.displayCourses();
        student2.displayCourses();

        // Display students for each course
        course1.displayStudents();
        course2.displayStudents();
    }
}
