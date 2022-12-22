package org.example.recap;

import org.example.maps.MapServices;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        List<String> list1 = Arrays.asList("a","b","c","d");
//        List<String> list2 = Arrays.asList("a","e","f");
//        List<String> result = RecapService.union(list1,list2);
//        System.out.println(result);
//
//        List<Integer> list10 = Arrays.asList(1,2,3,4);
//        List<Integer> list11 = Arrays.asList(1,4,6);
//        List<Integer> resultInt = RecapService.union(list10,list11);
//        System.out.println(resultInt);
//
//        String input = "(())()";
//        System.out.println(RecapService.satisfies(input));
//
//        List<Integer> input2 = Arrays.asList(1, 3, 2, 3, 3);
//        System.out.println(RecapService.firstDuplicate(input2));
//
//        String x = "speed";
//        List<String> inputList = Arrays.asList("psede","ppsede","abc","xpsede");
//        System.out.println(RecapService.checkList(x,inputList));

        Map<String,Integer> inputInput = new HashMap<>();
        inputInput.put("abc", 3);
        inputInput.put("x", 1);
        inputInput.put("xa", 2);
        inputInput.put("xb", 2);
        inputInput.put("y", 2);
//        inputInput.put("abc", 3);
//        inputInput.put("abc", 3);
//        inputInput.put("abc", 3);
//        inputInput.put("abc", 3);

        System.out.println(MapServices.sortedMap(inputInput));

    }
}
