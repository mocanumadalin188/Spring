package org.example.maps;

import java.util.*;

public class MapServices {
    public static Map<String, String> copyMap(Map<String, String> map) {
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static Map<String, Integer> sortedMap(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());


        Collections.sort(entryList, new MyComparator());
        Map<String,Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> entry : entryList){
            result.put(entry.getKey(),entry.getValue());
        }
        return result;
    }

}
