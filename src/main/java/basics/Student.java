package basics;

import javax.security.auth.Subject;

// Class is blueprint or metadata
public class Student {

    private String name;
    private int age;
    private String subject;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String subject) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("John Smith", 18);
        Student s2 = new Student("John Harry", 20);

        s1.displayInfo(s1);
        s2.displayInfo(s2);
    }

    public void displayInfo(Student student) {
        int age =student.age;
        String name = student.name;
    }

    public void displayInfo(String student) {

    }
}
