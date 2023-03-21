package io.exercises;

public class Person {

    private String name;
    private String CNP;
    private int age;

    public Person(){

    }

    public Person(String name, String CNP, int age) {
        this.name = name;
        this.CNP = CNP;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", CNP='" + CNP + '\'' +
                ", age=" + age +
                '}';
    }
}
