package projects.studentReport;

class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display () {
        System.out.println("Student Name: " + name + " | Student Age: " + age + " | Student marks: " + marks );
    }

    boolean isPassed() {
        return marks >= 40;
    }

}