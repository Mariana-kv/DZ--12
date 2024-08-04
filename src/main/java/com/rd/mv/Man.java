package com.rd.mv;

public class Man extends Person {

    public Man(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    Person getPartner(Person partner) {
        return null;
    }

    @Override
    public boolean isRetired() {
        return getAge() > 65;
    }

    @Override
    void registerPartnership(Person partner) {

    }

    @Override
    void registerPartnership() {

    }


/*
    @Override
    public void registerPartnership(Person partner) {

    }
*/

    @Override
    public void deregisterPartnership() {

    }

    @Override
    public String setLastName() {
        return null;
    }

}
