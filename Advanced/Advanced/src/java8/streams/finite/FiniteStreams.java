package java8.streams.finite;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FiniteStreams {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        Map<String, Integer> entries =
                map
                        .entrySet()
                        .stream()
                        .map(entry -> Map.entry(entry.getKey(), entry.getValue() * 2))
                        .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue() - 1, (a, b) -> a));
        System.out.println(entries);

        Map<Animal, Integer> animalMap = new LinkedHashMap<>();

        animalMap.put(new Animal("FIFI"), 1);
        animalMap.put(new Animal("PIPI"), 2);
        animalMap.put(new Animal("PIP2I"), 3);
        animalMap.put(new Animal("PIP22I"), 4);
        animalMap.put(new Animal("PIPdsI"), 5);
        animalMap.put(new Animal("PIPddsI"), 6);

        System.out.println(animalMap);

        // supplier -> linked hash map in order
        // binaryoperator -> collision (equals + hashcode)

        Map<Animal, Integer> animals =
                animalMap
                        .entrySet()
                        .stream()
                        .map(entry -> Map.entry(entry.getKey(), entry.getValue() * 2))
                        .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(), (a, b) -> a, LinkedHashMap::new));
        System.out.println(animals);
    }
}
