package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class InfiniteStreamsMain {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(10,"name1"));
        humans.add(new Human(15,"name2"));
        humans.add(new Human(20,"name3"));
        humans.add(new Human(30,"name4"));

        Stream<Human> stream = humans.stream();
        stream.filter(h -> h.getAge() < 20).map(h -> h.getAge()*2).forEach(a-> System.out.println(a));
        //agesDoubled.stream().forEach(a-> System.out.println(a));
        humans.stream().filter(h -> h.getName().contains("name")).forEach(a-> System.out.println(a));

        Stream.iterate(0,a -> a+2).limit(10).skip(3).forEach(a-> System.out.println(a));

        //afisare: primele 12 elemente divizibile cu 4;

        Stream.iterate(1,a -> a*4).limit(12).forEach(a-> System.out.println(a));

        Stream.iterate(0,a->a+1).limit(12).filter(a->a%4==0).forEach(a-> System.out.println(a));

        //Stream.iterate(0,a -> a+4).limit(12).forEach(a-> System.out.println(a));


    }
}
