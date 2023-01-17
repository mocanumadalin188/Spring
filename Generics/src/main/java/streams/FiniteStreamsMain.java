package streams;

import java.util.ArrayList;
import java.util.List;

public class FiniteStreamsMain {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(10, "name1"));
        humans.add(new Human(15, "name2"));
        humans.add(new Human(20, "name3"));
        humans.add(new Human(30, "name4"));

        Car car1 = new Car("w1", 2016, "engine1", List.of(humans.get(0), humans.get(1)));
        Car car2 = new Car("w2", 2016, "engine2", List.of(humans.get(2), humans.get(1)));
        Car car3 = new Car("w3", 2018, "engine3", humans);
        Car car4 = new Car("w4", 2019, "engine3", List.of(humans.get(2), humans.get(1), humans.get(3)));

        List<Car> cars = List.of(car1,car2,car3,car4);
    }
}
