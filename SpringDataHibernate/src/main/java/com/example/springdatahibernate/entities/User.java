package com.example.springdatahibernate.entities;

import com.example.springdatahibernate.validation.PasswordConstraint;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity(name = "USER")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"user_name"})})
// linia de mai sus - @Table(uniqueConstraints... - tabela nu acceptă două linii care au același userName
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "email")
    @Email(message = "Invalid email!")
    private String email;
    @PasswordConstraint
    @Column(name = "password")
    private String password;

    // @Pattern(regexp = "^[A-Za-z]*$", message = "invalid user name")
    //@List{@Length(min = ) , @Length(max = )}
    //  @Length(max = 30,min = 5,message = "maxim 30")
    @Column(name = "user_name")
    private String userName;
    //  @Max(value = 99, message = "varsta pomului")
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;


    }

    public void setEmail(String email) {
        this.email = email;
    }
}
