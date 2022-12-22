package org.example.recap;

import java.util.*;

public class RecapService {

    public static <T> List<T> union(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        Set<T> setResult = new HashSet<>(result);
        return new ArrayList<>(setResult);
    }

    public static boolean satisfies(String input) {
        if (input.charAt(0) == ')') {
            return false;
        }
        Stack<Character> checkStr = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                checkStr.push('(');
            } else {
                if (checkStr.isEmpty()) {
                    return false;
                }
                checkStr.pop();
            }
        }
        return checkStr.size() == 0;
    }

    public static int firstDuplicate(List<Integer> list) {
        Set<Integer> solve = new HashSet<>();
        for (int i : list) {
            boolean rez = solve.add(i);
            if (!rez) {
                return i;
            }
        }
        return -1;
    }

    // speed
    private static boolean checkString(String x, String y) {
        if(x.length() != y.length()){
            return false;
        }
        Map<Character, Integer> mapX = new HashMap<>();
        for (int i = 0; i < x.length(); i++) {
            mapX.putIfAbsent(x.charAt(i), 0);
            mapX.put(x.charAt(i), mapX.get(x.charAt(i)) + 1);
//            mapX.putIfAbsent(x.charAt(i), 1);
//            if(mapX.containsKey(x.charAt(i))){
//                mapX.put(x.charAt(i), mapX.get(x.charAt(i))+1);
//            }
        }
        for (int i = 0; i < y.length(); i++) {
            if (mapX.containsKey(y.charAt(i))) {
                mapX.put(y.charAt(i), mapX.get(y.charAt(i)) - 1);
            }
        }
        Set<Integer> rezList =new HashSet<>(mapX.values());
        return rezList.size() == 1 && rezList.contains(0);
    }

    public static Map<String,Boolean> checkList(String x, List<String> input){
        Map<String,Boolean> resultsMap = new TreeMap<>();
        for(String y : input){
            resultsMap.put(y, checkString(x,y));
        }
        return resultsMap;
    }
}
