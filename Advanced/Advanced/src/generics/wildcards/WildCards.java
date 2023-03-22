package generics.wildcards;

import generics.Device;
import generics.Gadget;

import java.util.ArrayList;
import java.util.List;

public class WildCards {

    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
        List listRaw = new ArrayList();
        // does not compile
//        list.add(new Object());
        listRaw.add(new Object());
        List<? extends Gadget> gadgets = new ArrayList<>();
        // does not compile
//        gadgets.add(new Device());
        System.out.println(getList(1));
        System.out.println(getList(2));
        printList(List.of(new Device("mf", "2KB", "3MB")));
        printList(List.of("abc", "bcd"));
    }

    private static List<?> getList(int input) {
        if (input == 1) {
            return List.of("a", "b");
        } else {
            return List.of(1, 2);
        }
    }

    private static void printList(List<?> list) {
        list.forEach(System.out::println);
    }
}
