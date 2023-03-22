package functionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MyFunction {

    public static int s;

    public static void main(String[] args) {
//        Function<Map<String, Integer>, Integer> function = param -> param.size();

        Map<String, Integer> map = new HashMap<>();
        map.put("FirstKey", 10);
        map.put("SecondKey", 20);

        Function<Map<String, Integer>, Integer> functionV2 = Map::size;

        Integer size = functionV2.apply(map);
        System.out.println(size);

        Function<Map<String, Integer>, Integer> sumValuesFunction =
                input -> {
                    for (int value : input.values()) {
                        s += value;
                    }
                    return s;
                };

        System.out.println(sumValuesFunction.apply(map));

        BiFunction<Map<String, Integer>, String, Boolean> verifyStringSizeWithMapValuesFunction
                = (input, target) -> input.values().contains(Integer.valueOf(target.length()));
        System.out.println(verifyStringSizeWithMapValuesFunction.apply(map, "abc"));
    }
}