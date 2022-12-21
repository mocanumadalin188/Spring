package org.example.exercises;

import java.util.Objects;

public class Person {
    private String phoneNumber;
    private String cnp;

    public Person(String phoneNumber, String cnp) {
        this.phoneNumber = phoneNumber;
        this.cnp = cnp;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(cnp, person.cnp);
    }

    @Override
    public int hashCode() {
       return Objects.hash(phoneNumber, cnp);
    }

    @Override
    public String toString() {
        return "Person{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}
