package coding.day_4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class MyConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer1 = param -> {
            System.out.println(param);
        };
        Consumer<String> consumer2 = System.out::println;   // :: separa obiectul de metoda

        Map<String,String> map = new HashMap<>();

        BiConsumer<String,String> bi = (s1,s2) -> map.put(s1,s2);   // sau map::put; nu e metoda statica, apelata pe obiect
        BiConsumer<Integer,Integer> bi2 = Math::addExact;  // addExact este o metoda statica, aplelata pe clasa

        consumer1.accept("abc");

        Supplier<Map.Entry<String,String>> supplier = () -> Map.entry("aaa","bbd");
        Map.Entry<String,String> ss = supplier.get();
        System.out.println(ss);

        // o metoda cu lambda, predicate, care verifica daca primul caracter dintr-un string este "c"
        Predicate<String> pr = (param) -> {return param.startsWith("c");};
        System.out.println(pr.test("nu"));

        // o metoda cu lambda, predicate, care verifica daca primul caracter dintr-un string este caracterul dat ca parametru
        BiPredicate<String,Character> sss = (s, c) -> s.startsWith(c.toString());
        System.out.println(sss.test("abc", 'a'));

        BiPredicate<String,String> ssss = (s, c) -> s.startsWith(c);  // sau s.startsWith(c);
        System.out.println(ssss.test("abc", "a"));
        System.out.println(ssss.test("a", "abc"));

    }
}
