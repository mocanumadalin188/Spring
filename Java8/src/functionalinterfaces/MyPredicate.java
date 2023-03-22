package functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyPredicate {
    public static void main(String[] args) {
        Predicate<String> startWithPredicate = param -> param.startsWith("ab");
        System.out.println(startWithPredicate.test("abcd"));

        Predicate<String> endWithPredicate = param -> param.endsWith("zx");
        System.out.println(endWithPredicate.test("abcdzx"));

        Predicate<String> startsAndEndsPredicate = startWithPredicate.and(endWithPredicate);
        System.out.println(startsAndEndsPredicate.test("abcdzx"));

        BiPredicate<String, Integer> stringHasLengthPredicate = (text, size) -> text.length() == size;

        BiPredicate<String, Integer> negationStringHasLengthPredicate = stringHasLengthPredicate.negate();
        System.out.println(negationStringHasLengthPredicate.test("abc", 3));
        System.out.println(stringHasLengthPredicate.test("abc", 3));
    }
}
