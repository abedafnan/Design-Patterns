package com.abedafnan.Builder;

public class Student {

    private String firstName, lastName, address, major, id, mobileNo;
    private int age;

    private Student(String firstName, String lastName, String address, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "First Name: " + this.firstName + "\n" +
                "Last Name: " + this.lastName + "\n" +
                "Address: " + this.address + "\n" +
                "ID: " + this.id + "\n" +
                "Major: " + this.major + "\n" +
                "Mobile No: " + this.mobileNo + "\n" +
                "Age: " + this.age;
    }

    static class Builder {
        private String firstName, lastName, address, major, id, mobileNo;
        private int age;

        public Student build() {
            if (firstName == null) {
                throw new NullPointerException("first name is required");
            }
            if (lastName == null) {
                throw new NullPointerException("last name is required");
            }
            if (address == null) {
                throw new NullPointerException("address is required");
            }
            if (id == null) {
                throw new NullPointerException("id is required");
            }

            Student student = new Student(firstName, lastName, address, id);

            student.setAge(age);
            student.setMajor(major);
            student.setMobileNo(mobileNo);

            return student;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public void setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
