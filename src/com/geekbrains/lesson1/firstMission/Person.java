package com.geekbrains.lesson1.firstMission;

public class Person {

    private String firstName;
    private String secondName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private String gander;
    private int age;

    public Person(String firstName, String secondName, String middleName, String country, String address, String phone, String gander, int age) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.gander = gander;
        this.age = age;
    }

    public static class Builder {

        private String firstName;
        private String secondName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private String gander;
        private int age;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setGander(String gander) {
            this.gander = gander;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person creatPerson() {
            return new Person(firstName, secondName, middleName, country, address, phone, gander, age);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
