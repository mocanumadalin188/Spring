package java8.functionalInterfaces;

@FunctionalInterface
public interface MyFunctionalInterface<T> {
    int apply(T input);
}
