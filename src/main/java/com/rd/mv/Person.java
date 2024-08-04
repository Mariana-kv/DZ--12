package com.rd.mv;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;
    private String motherName;


    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age, Person partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    abstract Person getPartner(Person partner);

    abstract boolean isRetired();


    abstract void registerPartnership(Person partner);

    abstract void registerPartnership();

    void deregisterPartnership(){
        if (motherName != null){
            lastName=motherName;
        }
    };

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(Person partner) {
        this.partner = partner;
    }

    abstract String setLastName();
}

