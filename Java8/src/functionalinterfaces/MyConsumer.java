package functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MyConsumer {
    public static void main(String[] args) {
//        Consumer<String> printConsumer = param -> System.out.println(param);
        Consumer<String> printConsumerV2 = System.out::println;
        printConsumerV2.accept("Element");

        Consumer<Integer> incrementByOneConsumer = number -> System.out.println(++number);
        incrementByOneConsumer.accept(10);

        BiConsumer<Integer, Integer> sumConsumer =
                (firstNumber, secondNumber) -> System.out.println(firstNumber + secondNumber);
        sumConsumer.accept(10, 5);


    }
}
