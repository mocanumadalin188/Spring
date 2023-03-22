package functionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class MySupplier {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("FirstKey", 10);
        map.put("SecondKey", 20);

        Supplier<Map<String, Integer>> mapSupplier = () -> {
            map.put("ThirdKey", 30);
            return map;
        };

        System.out.println(mapSupplier.get());
    }
}
