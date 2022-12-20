package org.example.sets;

import org.example.lists.Car;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetService {

    public static Set<Integer> getYears(List<Car> cars) {
//        Set<Integer> years = new HashSet<>();

        Set<Integer> years = new LinkedHashSet<>();

        for (Car car : cars) {
            years.add(car.getYear());
        }
        return years;
    }


    public static void printYears(Set<Integer> input) {
        for (Integer i : input) {
            System.out.println(i);
        }
    }

}
