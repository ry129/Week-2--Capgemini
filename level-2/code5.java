import java.util.ArrayList;
import java.util.List;

// Faculty Class (Independent of University or Department)
class Faculty {
    String name; // No encapsulation

    Faculty(String name) {
        this.name = name;
    }
}

// Department Class (Dependent on University - Composition)
class Department {
    String name; // No encapsulation

    Department(String name) {
        this.name = name;
    }
}

// University Class (Composes Departments and Aggregates Faculties)
class University {
    String name; // No encapsulation
    List<Department> departments = new ArrayList<>(); // Composition
    List<Faculty> faculties = new ArrayList<>();      // Aggregation

    University(String name) {
        this.name = name;
    }

    // Add a department to the university
    void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add a faculty member to the university
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Display all departments
    void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println("- " + department.name);
        }
    }

    // Display all faculty members
    void displayFaculties() {
        System.out.println("Faculty members in " + name + ":");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.name);
        }
    }

    // Delete the university (simulate deleting all departments)
    void deleteUniversity() {
        System.out.println("Deleting " + name + "...");
        System.out.println("Deleting all departments...");
        departments.clear();
        System.out.println("University deleted.");
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Tech University");

        // Add departments
        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");

        // Create faculty members (independent of the university)
        Faculty faculty1 = new Faculty("Dr. John Doe");
        Faculty faculty2 = new Faculty("Dr. Jane Smith");

        // Add faculty to the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display departments and faculty members
        university.displayDepartments();
        university.displayFaculties();

        // Demonstrate faculty independence
        System.out.println("Faculty members exist independently of the university:");
        System.out.println("- " + faculty1.name);
        System.out.println("- " + faculty2.name);

        // Delete the university and its departments
        university.deleteUniversity();

        // Attempt to display departments again
        university.displayDepartments(); // Should show no departments
    }
}
