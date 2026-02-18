package projects.studentReport;

/**
 *  5. 🏫 Student Report (Arrays + Objects)
 * Concepts used: Arrays of objects, loops, classes.
 *
 * Create a Student class with fields: name, age, marks.
 * Create an array of Student objects.
 * Use a loop to display each student’s information.
 * Add a method isPassed() that checks if marks ≥ 40.
 * Print whether each student passed or failed.
 */

public class StudentReport {
    public static void main(String[] args) {

        Student[] students = {
                new Student("Jason", 20, 78),
                new Student("Yuling", 32, 90),
                new Student("Sisilan", 23, 7),
        };
        for (Student student : students) {
            student.display();
            System.out.println("Student " + student.name + " is " + (student.isPassed() ? "passed" : "failed"));
        }
    }
}
