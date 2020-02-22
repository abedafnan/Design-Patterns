package com.abedafnan.Builder;

/**
 *  SDA lecture 6
 */
public class Main {

    public static void main(String[] args) {

        // Testing the basic builder pattern
        Student.Builder builder = new Student.Builder();
        builder.setFirstName("Jane");
        builder.setLastName("Smith");
        builder.setAddress("California, USA");
        builder.setId("429");
        builder.setMajor("Computer Science");
        builder.setMobileNo("+123456789");
        builder.setAge(22);

        Student student = builder.build();
        System.out.println(student);


        // Testing the step builder
        Student2 student2 = Student2.builder()
                .setFirstName("Maria")
                .setLastName("Rodriguez")
                .setAddress("Bristol, UK")
                .setId("380")
                .build();

        System.out.println("-----------------------------------");
        System.out.println(student2);
    }
}
