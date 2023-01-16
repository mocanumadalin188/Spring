package wildCards;

import java.util.ArrayList;
import java.util.List;

public class WildCardMain {
    public static void main(String[] args) {
//        List input = new ArrayList();
//        input.add(1);
//        input.add("abc");
//        for (Object i : input) {
//            System.out.println(i.toString());
//        }
//
//        List<Object> strings = new ArrayList<>();
//        strings.add("a");
//        for (Object i : strings) {
//            System.out.println(i.toString());
//        }
//        List<?> list = new ArrayList<>();

        display(displayList(2));

    }

    private static void display(List<?> input) {
        for (Object i : input) {
            System.out.println(i.toString());
        }
    }

    private static List<Object> displayList(int input) {
        if (input == 1) {
            return List.of("a", "b");
        } else {
            return List.of(1, 2);
        }
    }
}
