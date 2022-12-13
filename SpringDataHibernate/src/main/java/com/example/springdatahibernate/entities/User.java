package com.example.springdatahibernate.entities;

import javax.persistence.*;

@Entity(name = "USER")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"user_name"})})
// linia de mai sus - @Table(uniqueConstraints... - tabela nu acceptă două linii care au același userName
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "age")
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
