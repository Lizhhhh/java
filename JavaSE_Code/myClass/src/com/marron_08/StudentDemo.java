package com.marron_08;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("Marron");
        s2.show();

        Student s3 = new Student(30);
        s3.show();

        Student s4 = new Student("Marron", 18);
        s4.show();
    }
}
