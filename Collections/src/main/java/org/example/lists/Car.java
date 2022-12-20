package org.example.lists;

public class Car {

    private String color;
    private String engine;
    private String wheels;
    private int year;

    public Car(String color, String engine, String wheels, int year) {
        this.color = color;
        this.engine = engine;
        this.wheels = wheels;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return this.color + " / " + this.engine + " / " + this.wheels + " / " + this.year;
    }


}
