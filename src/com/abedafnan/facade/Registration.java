package com.abedafnan.facade;

public class Registration {

    private static Registration instance;

    private Registration() {}

    public static Registration getInstance() {
        if (instance == null) {
            instance = new Registration();
        }

        return instance;
    }

    public Course registerCourse(Student student, int courseNo) {
        Course course = null;
        switch (courseNo) {
            case 1:
                course = new Course("aaa", "Design Patterns", "teacher1");
                break;
            case 2:
                course = new Course("bbb", "Database", "teacher2");
                break;
            case 3:
                course = new Course("ccc", "Java Programming", "teacher3");
                break;
            default:
                System.out.println("Course Not Found !");
        }

        student.getCourses().add(course);
        return course;
    }

}
