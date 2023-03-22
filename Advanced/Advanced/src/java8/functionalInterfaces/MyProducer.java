package java8.functionalInterfaces;

import java.util.function.Supplier;

public class MyProducer {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "7";

        System.out.println(supplier.get());
    }
}
