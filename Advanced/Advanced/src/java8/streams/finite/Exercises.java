package java8.streams.finite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercises {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strings = Arrays.asList("a", "b", "c", "d");

        System.out.println("product");
        int product = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);

        System.out.println("reverse");
        String inverse = strings.stream().reduce("", (a, b) -> b + a);
        System.out.println(inverse);

        System.out.println("map");
        list.stream().map(elem -> elem + 22).toList().forEach(System.out::println);

        System.out.println("filter");
        list.stream().filter(elem -> elem % 2 == 1).toList().forEach(System.out::println);

        System.out.println("limit, skip");
        list.stream().limit(2).skip(1).toList().forEach(System.out::println);

        System.out.println("findfirst");
        int x = list.stream().filter(elem -> elem % 2 == 1).findFirst().get();
        System.out.println(x);

        System.out.println("min, max");
        int max = list.stream().min((a, b) -> b - a).get();
        int min = list.stream().max((a, b) -> b - a).get();
        System.out.println("min -> " + min + " max -> " + max);

        System.out.println("flatmap");
        List<List<String>> outerLists = new ArrayList<>();

        List<String> list1 = List.of("str1", "str2");
        List<String> list2 = List.of("str3", "str4");

        outerLists.add(list1);
        outerLists.add(list2);

        outerLists.stream().flatMap(a -> a.stream()).forEach(a -> System.out.println(a));

        System.out.println("sort");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        String yy = strings.stream().collect(Collectors.joining("|"));
        System.out.println(yy);
    }
}
