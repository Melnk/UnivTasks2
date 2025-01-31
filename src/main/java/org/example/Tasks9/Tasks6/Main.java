package org.example.Tasks9.Tasks6;

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Ivan", "Ivanov", "CS", 4.5), new Aspirant("Anna", "Petrova", "CS", 5, "AI Research")};

        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " получает стипендию: " + student.getScholarship());
        }
    }
}