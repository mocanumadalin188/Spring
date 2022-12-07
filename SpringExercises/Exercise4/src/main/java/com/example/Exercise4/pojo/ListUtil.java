package com.example.Exercise4.pojo;

import java.util.List;

public class ListUtil {
    public int sumElements(final List<Integer> ints) {
        return ints.stream().reduce(0, Integer::sum);
    }
}
