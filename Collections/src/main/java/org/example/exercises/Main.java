package org.example.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//o lista de string
//verificam duplicate sau nu
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("casa", "masa", "pat");
        boolean hasDuplicates = Service.hasDuplicates(list);
        System.out.println("Has duplicates: " + hasDuplicates);

        boolean hasDuplicates2 = Service.hasDuplicates2(list);
        System.out.println("Has duplicates2: " + hasDuplicates2);

        Person person1 = new Person("123456","000999");
        Person person2 = new Person("123456","000999");

        Set<Person> set = new HashSet<>(Arrays.asList(person1,person2));
        System.out.println(set);
    }
}
