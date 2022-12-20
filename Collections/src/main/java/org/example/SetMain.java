package org.example;

import org.example.lists.Car;
import org.example.sets.SetService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {

        List<Car> input = new ArrayList<>();
        Car car1 = new Car("white", "2L TDI", "Bridgestone", 2022);
        Car car2 = new Car("black", "2.5L", "Bridgestone", 2018);
        Car car3 = new Car("white", "3L", "Bridgestone", 2015);
        Car car4 = new Car("white", "3L", "Bridgestone", 2015);

        input.add(car1);
        input.add(car2);
        input.add(car3);
        input.add(car4);

        Set<Integer> years = SetService.getYears(input);

        SetService.printYears(years);




    }

}
