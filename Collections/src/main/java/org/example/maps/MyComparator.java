package org.example.maps;

import java.util.Comparator;
import java.util.Map;

public class MyComparator implements Comparator<Map.Entry<String,Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o2.getValue() > o1.getValue()) {
            return 1;
        } else if (o2.getValue() < o1.getValue()) {
            return -1;
        } else {
            return o1.getKey().compareTo(o2.getKey());
        }
    }
}
