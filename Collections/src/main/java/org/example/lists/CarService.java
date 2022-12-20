package org.example.lists;

import java.util.ArrayList;
import java.util.List;

public class CarService {


    public static List<String> getEngines(List<Car> cars){
        List<String> engines = new ArrayList<>();
        for (Car car : cars) {
            engines.add(car.getEngine());
        }
        return engines;
    }

    public static void printList (List<Car> input){
         for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }
    }




}
