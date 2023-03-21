package java8.functionalInterfaces;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class MyConsumer {

    public static void main(String[] args) {
        // TODO explain method reference
        //            System.out.println(param);
        Consumer<String> consumer1 = System.out::println;

        Map<String,String> map = new HashMap<>();


        BiConsumer<String, String> bi = map::put;
        BiConsumer<Integer, Integer> bi2 = Math::addExact;

        consumer1.accept("abc");

        Supplier<Map.Entry<String, String>> supplier = () -> Map.entry("abc", "bbbd");
        Map.Entry<String, String> ss = supplier.get();
        System.out.println(ss);

        // o metoda cu lambda , predicate, care verifica daca primul caracter dintr un string este "c"
        Predicate<String> pr = (param) -> {
            return param.startsWith("c");
        };
        System.out.println(pr.test("nu"));
        // o metoda cu lambda , predicate, care verifica daca primul caracter dintr un string este caracterul dat ca param
        BiPredicate<String, String> sss = String::startsWith;
        System.out.println(sss.test("a", "abc"));

    }


}
