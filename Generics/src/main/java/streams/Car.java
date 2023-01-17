package streams;

import java.util.List;

public class Car {
    private String wheels ;
    private int year;
    private String engine;
    private List<Human> passengers;

    public Car(String wheels, int year, String engine, List<Human> passengers) {
        this.wheels = wheels;
        this.year = year;
        this.engine = engine;
        this.passengers = passengers;
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

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public List<Human> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Human> passengers) {
        this.passengers = passengers;
    }
}
