package com.abedafnan.facade;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("123", "name", "email@email.com", "City, Country");

        // The registerCourse() method is the interface for the client
        Registration regist = Registration.getInstance();
        regist.registerCourse(s1, 1);
        regist.registerCourse(s1, 3);

        // TEST: Print names of all student courses
        for (Course c: s1.getCourses()) {
            System.out.println(c.getName());
        }
    }
}
