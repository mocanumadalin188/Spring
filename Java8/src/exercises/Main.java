package exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("FirstKey", 1);
        map.put("ThirdKey", 3);
        map.put("SecondKey", 15);
        map.put("FifthKey", -1);
        map.put("FourthKey", 4);

        List<String> list = new ArrayList<>();
        list.add("l1");
        list.add("l1");
        list.add("l2");
        list.add("l3");
        list.add("l4");

        List<List<String>> outerList = new ArrayList<>();
        outerList.add(Arrays.asList("e1", "e2"));
        outerList.add(Arrays.asList("e3", "e4"));
        outerList.add(Arrays.asList("e5", "e6"));

        System.out.println(map);
        Optional<Map.Entry<String, Integer>> result = map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst();

//        if (result.isPresent()) {
//            System.out.println(result.get());
//        } else {
//            System.out.println("n/a");
//        }

        result.ifPresent(System.out::println);

        Optional<Map.Entry<String, Integer>> minEntry = map.entrySet().stream()
                .min((entry1, entry2) -> entry1.getValue() - entry2.getValue());

        minEntry.ifPresent(System.out::println);

        List<String> descString = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(descString);

        List<String> flattedList = outerList.stream()
                .flatMap(param -> param.stream())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(flattedList);
    }
}
