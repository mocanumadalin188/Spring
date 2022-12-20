package org.example;

public abstract class Shape {

    public Shape() {
        System.out.println("Calling shape constructor");
    }

    protected abstract double getPerimeter();


    protected String getColor() {
        return "white";
    }
}
