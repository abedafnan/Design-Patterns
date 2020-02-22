package com.abedafnan.Builder;

public class Student2 {
    private String firstName, lastName, address, id;

    private Student2(String firstName, String lastName, String address, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return "First Name: " + this.firstName + "\n" +
                "Last Name: " + this.lastName + "\n" +
                "Address: " + this.address + "\n" +
                "ID: " + this.id;
    }

    public static FirstNameStep builder() {
        return new Builder();
    }

    /**
     * 1st Builder Step - First Name
     */
    public interface FirstNameStep {
        LastNameStep setFirstName(String name);
    }

    /**
     * 2nd Builder Step - Last Name
     */
    public interface LastNameStep {
        AddressStep setLastName(String name);
    }

    /**
     * 3rd Builder Step - Address
     */
    public interface AddressStep {
        IdStep setAddress(String address);
    }

    /**
     * 4th Builder Step - ID
     */
    public interface IdStep {
        BuildStep setId(String id);
    }

    /**
     * Last Step - Build Step
     */
    public interface BuildStep {
        Student2 build();
    }

    static class Builder implements FirstNameStep, LastNameStep, AddressStep, IdStep, BuildStep {

        private String firstName, lastName, address, id;

        private Builder() {}

        @Override
        public LastNameStep setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        public AddressStep setLastName(String name) {
            this.lastName = name;
            return this;
        }

        @Override
        public IdStep setAddress(String address) {
            this.address = address;
            return this;
        }

        @Override
        public BuildStep setId(String id) {
            this.id = id;
            return this;
        }

        @Override
        public Student2 build() {
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

            Student2 student = new Student2(firstName, lastName, address, id);

            return student;
        }

    }
}
