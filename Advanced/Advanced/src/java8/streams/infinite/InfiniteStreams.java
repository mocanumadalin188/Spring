package java8.streams.infinite;

import java.util.List;
import java.util.stream.Stream;

public class InfiniteStreams {

    public static void main(String[] args) {
        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);

        Stream<Integer> infiniteStream2 = Stream.iterate(0, i -> i + 3);

        List<Integer> elements = infiniteStream.limit(10).toList();

        elements.forEach(System.out::println);

        List<Integer> skipElements = infiniteStream2.limit(10).skip(2).toList();

        // TODO exception cannot be reused
//        List<Integer> skipElements2 = infiniteStream.limit(10).skip(2).toList();

        skipElements.forEach(a -> System.out.println(a));

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        // TODO EQUIVALENT

        Stream<Integer> equivalentStream = Stream.iterate(0, j -> j + 1);
        equivalentStream.limit(10).forEach(System.out::println);

        Stream<Integer> equivalentStream2 = Stream.iterate(0, j -> j + 1);
        equivalentStream2.limit(10).map(a -> a * 3).forEach(System.out::println);

        System.out.println("-----------------------------");
    }
}
