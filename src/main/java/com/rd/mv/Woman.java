package com.rd.mv;

public class Woman extends Person {
    private Person partner;

    public Woman(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    Person getPartner(Person partner) {
        return null;
    }


    @Override
    public boolean isRetired() {
        return getAge() > 60;
    }

    @Override
    void registerPartnership(Person partner){
        String motherName = getLastName();
        String lastName = partner.getLastName();
    };



    public void registerPartnership() {
        setPartner(partner);
        setLastName(partner.getLastName());

    }



    @Override
    public void deregisterPartnership() {

    }

    @Override
    public String setLastName() {
        return null;
    }
}
