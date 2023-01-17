package streams;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumer.accept("abc");

        Consumer<String> consumer2 = s -> {
            System.out.println(s);
            System.out.println(s);
        };

        Supplier<Integer> supplier = () -> 1;

        System.out.println(supplier.get());

        Predicate<Human> predicate = t -> t.getAge() > 12;

        Human human = new Human(15,"CataliC");
        System.out.println(predicate.test(human));

//        R apply(T t, U u);

        BiFunction<Integer,String,Human> biFunction = Human::new;
        System.out.println(biFunction.apply(20, "Alin"));

        Function<Human,Integer> function = Human::getAge;
        Function<Human,Integer> equivalentFunction = t -> t.getAge();

        BiPredicate<Human,String> biPredicate = (t,a) -> t.getName().startsWith(a);
        System.out.println(biPredicate.test(human, "C"));

        BiPredicate<Human,String> andBiPredicate = (t,a) ->t.getName().endsWith(a);

        BiPredicate<Human,String> finalPredicate =  biPredicate.and(andBiPredicate);

        System.out.println(finalPredicate.test(human, "a"));

        BiPredicate<Human,String> negatePredicate = finalPredicate.negate();
        System.out.println(negatePredicate.test(human,"C"));


    }
}
