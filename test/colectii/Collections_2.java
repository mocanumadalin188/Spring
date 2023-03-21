package coding.day3.colectii;
/*
     vrem sa printam toate elem dintr-o lista care au aceleasi litere cu X (dat ca parametru)
     String X
     List<String> Y

     X = "speed"
     Y = ["psede","ppsede","abc","xpsede", "psed"]

     metoda care compara 2 stringuri
     apelam metoda intr-un loop
*/

import java.util.*;

public class Collections_2 {
    public static String x = "speed";
    public static List<String> y = Arrays.asList("psede","ppsede","abc","xpsede", "psed");

    public static void main(String[] args) {
//        getMap(x);

//        char[] arr = x.toCharArray();
//        Arrays.sort(arr);

        List<Boolean> result = solve(x,y);

        for (Boolean b : result) {
            System.out.println(b.booleanValue());
        }

        List<Boolean> result2 = solveV2(x,y);
        System.out.println(result2);

    }

    public static List<Boolean> solveV2(String x, List<String> y) {
        List<Boolean> result = new ArrayList<>();

        for (String word : y) {
            result.add(isMatchingV2(x, word));
        }
        return result;
    }

    public static Boolean isMatchingV2(String x, String y) {
        char[] xChars = x.toCharArray();
        char[] yChars = y.toCharArray();
        Arrays.sort(xChars);
        Arrays.sort(yChars);

        if (xChars.length != yChars.length) {
            return false;
        }

        for (int i = 0; i < xChars.length; i++) {
            if (xChars[i] != yChars[i]) {
                return false;
            }
        }

        return true;
    }

    // comparare stringul x cu fiecare cuvant din lista y
    public static List<Boolean> solve(String x, List<String> ys) {
        List<Boolean> result = new ArrayList<>();
        for (String word : ys) {
            result.add(isMatching(x, word));
        }
        return result;
    }

    public static boolean isMatching(String x, String y) {
        if (x.length() != y.length()) {
            return false;
        }

        // parcurgem mapurile, ca sa vedem ca ele match-uiesc
        Map<Character, Integer> mapX = getMap(x);
        Map<Character, Integer> mapY = getMap(y);

        // comparam map-urile cu aceleasi chei si valori - nu putem face cu equals pt ca difera ordinea
        // tipul elem unui Map este Map.Entry
        for (Map.Entry<Character,Integer> entry : mapX.entrySet()) {
            Character currentKeyMapX = entry.getKey();              // cheia curenta     s
            Integer currentValueMapX = entry.getValue();            // valoarea curenta  1
            Integer currentValueMapY = mapY.get(currentKeyMapX);    // valoarea cheii
            if (currentValueMapX.intValue() != currentValueMapY.intValue()) {    // comparam valorile celor doua map-uri
                return false;                                                   // intValue() - returneaza o primitiva
            }
        }
        return true;
    }

    public static Map<Character, Integer> getMap(String word) {

        Map<Character,Integer> result = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            result.putIfAbsent(currentChar, 0);
            result.put(currentChar, result.get(currentChar) + 1);
        }

        return result;
    }
}
