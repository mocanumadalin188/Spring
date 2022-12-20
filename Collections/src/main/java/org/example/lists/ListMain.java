package org.example.lists;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<Car> input = new ArrayList<>();
        Car car1 = new Car("white", "2L TDI", "Bridgestone", 2015);
        Car car2 = new Car("black", "2.5L", "Bridgestone", 2015);
        Car car3 = new Car("white", "3L", "Bridgestone", 2015);

        input.add(car1);
        input.add(car2);
        input.add(car3);

//        List<Car> input2 = Arrays.asList(car1, car2, car3);

        List<String> result = CarService.getEngines(input);

        CarService.printList(input);

        System.out.println();

        input.remove(car3);

        CarService.printList(input);

        if (input.contains(car1)){
            System.out.println("List contains car1");
        }

        List<Car> inputCopy = new ArrayList<>(input);
        inputCopy.addAll(input);

        CarService.printList(inputCopy);

        inputCopy.add(1, new Car("green","1.8 Turbo", "Michelin", 2000 ));

        CarService.printList(inputCopy);



//        System.out.println(result);

    }



}
