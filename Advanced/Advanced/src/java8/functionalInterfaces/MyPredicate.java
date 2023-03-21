package java8.functionalInterfaces;

import java.util.function.Predicate;

public class MyPredicate {

    public static void main(String[] args) {
        int x = 4;

        Predicate<Integer> myPredicate = s -> s % 2 == 0;
        Predicate<Integer> andPredicate = s -> s == 4;
        Predicate<Integer> newPredicate = myPredicate.and(andPredicate);

        boolean result = newPredicate.test(x);

        System.out.println(result);
    }
}
