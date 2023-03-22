package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("stre1", "str2", "str3");
        // toate elem care au size ul 4
        List<String> result = input.stream().filter(str -> str.length() == 4).collect(Collectors.toList());
        System.out.println(result);

//        --streamuri infinite
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        Stream<Integer> infiniteIntStream = Stream.iterate(0, s -> s + 2);
//        infiniteIntStream.limit(10).skip(2).forEach(a -> System.out.println(a));
        List<Integer> list = infiniteIntStream.limit(10).map(s -> s + 1).collect(Collectors.toList());
        System.out.println(list);
    }
}
