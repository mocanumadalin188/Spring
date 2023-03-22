package java8.functionalInterfaces;

import java.util.function.Function;

public class MyFunction {

    public static void main(String[] args) {
        int x = 4;

        Function<Integer, Integer> addOne = s -> s + 1;

        Function<Integer, Integer> multiplyBy3 = s -> s * 3;

        Function<Integer, Integer> newFunctionAfterCompose = addOne.compose(multiplyBy3);

        System.out.println(newFunctionAfterCompose.apply(x));
    }
}
