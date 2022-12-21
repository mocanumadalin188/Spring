package org.example.maps;

import org.example.exercises.Person;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        String x = "1234";
        Map<String, List<String>> map = new HashMap<>();
        map.put(x, Arrays.asList("a","b"));
        map.put(x, Arrays.asList("x","y"));
        System.out.println(map);

        String y = "1234";

        Map<String,String> newMap = new HashMap<>();
        newMap.put(x,"234434");
        newMap.put(y,"10000");
        System.out.println(newMap);
        System.out.println("1234".equals("1234"));

        Map<Person,Integer> personMap = new HashMap<>();
        Person p10 = new Person("7777","ab2");
        Person p11 = new Person("1111","ab3");
        Person p12 = new Person("3434","aa");
        personMap.put(p10,18);
        personMap.put(p11,20);
        //vrem sa luam varsta persoaneai care are cnp-ul 222
        System.out.println(personMap.get(p10));
        System.out.println(personMap);
        System.out.println(personMap.values());
        System.out.println(personMap.keySet());
        for(Map.Entry<Person,Integer> entry : personMap.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
        personMap.putIfAbsent(p10,99);
        personMap.putIfAbsent(p12,99);
        System.out.println(personMap);

        Map<Person,String> treeMap = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                return o1.getCnp().compareTo(o2.getCnp());
            }
        });
//        treeMap.put(123, "casa");
//        treeMap.put(100, "casa");
//        treeMap.put(150, "casa");
        treeMap.put(p10,"lala");
        treeMap.put(p11,"ssss");
        treeMap.put(p12,"dddd");

        System.out.println(treeMap);
        System.out.println("---------------------");
        System.out.println(MapServices.copyMap(newMap));


    }
}
