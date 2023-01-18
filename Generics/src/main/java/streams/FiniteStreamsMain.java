package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiniteStreamsMain {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(10, "name1"));
        humans.add(new Human(15, "name2"));
        humans.add(new Human(20, "name3"));
        humans.add(new Human(30, "name4"));

        Car car1 = new Car("w1", 2016, "engine1", List.of(humans.get(0), humans.get(1)));
        Car car2 = new Car("w2", 2016, "engine1", List.of(humans.get(2), humans.get(1)));
        Car car3 = new Car("w3", 2018, "engine3", humans);
        Car car4 = new Car("w4", 2019, "engine3", List.of(humans.get(2), humans.get(1), humans.get(3)));

        List<Car> cars = List.of(car1,car2,car3,car4);

        List<Integer> numberOfPass = cars.stream().map(car -> car.getPassengers().size()).collect(Collectors.toList());
        numberOfPass.forEach(nr -> System.out.println(nr));

        //toate masinile care au fost construite in anul 2016 si eu engine1 si il vrem pe primul;

        Optional<Car> optionalCar = cars.stream().filter(car -> car.getYear() == 2020 && "engine1".equals(car.getEngine())).findFirst();

//        if(optionalCar.isPresent()){
//            System.out.println(optionalCar.get());
//        }
        Runnable runnable = () -> System.out.println("Nu exista");
        //optionalCar.ifPresent(car -> System.out.println(car));
        optionalCar.ifPresentOrElse(car -> System.out.println(car),runnable);

        //masina cea mai noua
        cars.stream().max((c1,c2) ->c1.getYear() - c2.getYear()).ifPresentOrElse(car -> System.out.println(car),runnable);
        cars.stream().max((c1,c2) ->c1.getPassengers().size() - c2.getPassengers().size()).ifPresentOrElse(car -> System.out.println(car),runnable);

        List<Integer> list = List.of(1,2,3,4,5);
        int prod = list.stream().reduce(1,(a1,a2) -> a1*a2);
        System.out.println(prod);

        List<String> firstList = List.of("a","b","c");
        List<String> secondList = List.of("d","e");
        List<List<String>> combineList = List.of(firstList,secondList);
        String y = combineList.stream().flatMap(par->par.stream()).collect(Collectors.joining(","));
        System.out.println(y);
        // 1.
        //se da un map(Hashmap<String,Integer>)
        //sa il transformam intr-un stream
        //din map-ul original sa imi rezulte un map care contine aceeasi cheie si valoarea triplata
        //Collectors.toMap(3 parametrii / 4 param)

        // 2.
        // "a",3 -> "aaa",3
        // "b",2 -> "bb",2
        //se da un map(Hashmap<String,Integer>)
        //sa il transformam intr-un stream
        //Collectors.toMap(3 parametrii / 4 param)

        // TODO Collectors.toMap (3/4 param)
        // Map.Entry
    }
}
