package com.example.jdbc.pojo;

public class Person {

    private long id;
    private String lastName;
    private String firstName;
    private String address;
    private String city;

    public Person() {

    }

    public Person(long id, String lastName, String firstName, String address, String city) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstName);
        stringBuilder.append(",");
        stringBuilder.append(lastName);
        stringBuilder.append(",");
        stringBuilder.append(city);
        return stringBuilder.toString();
    }
}
