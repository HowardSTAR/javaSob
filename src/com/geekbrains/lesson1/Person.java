package com.geekbrains.lesson1;

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

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setGander(String gander) {
            this.gander = gander;
        }

        public void setAge(int age) {
            this.age = age;
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
