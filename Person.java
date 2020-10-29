package com.example.AddressBookProb

        
public class Person {
    String firstName;
    String lastName;
    long phone;
    String city;
    String state;
    int zip;

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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Person(String firstName, String lastName, long phone, String city,
                  String state, int zip) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

}














