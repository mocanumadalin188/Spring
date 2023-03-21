//we have 2 lists and want to printout the union between them without duplicates

import java.util.*;

public class Collections_1 {
    public static List<String> l1 = Arrays.asList("s1","s2","s3");
    public static List<String> l2 = Arrays.asList("s2","s3","s4");

    public static void main(String[] args) {
        List<String> result = union(l1,l2);
        for (String s : result) {
            System.out.println(s);
        }

    }

    public static List<String> union(List<String> l1, List<String> l2) {
        List<String> result = new ArrayList<>();
        result.addAll(l1);
        result.addAll(l2);

        // vreau sa elimin duplicatele din result si pun elementele mele din liste intr-un set
        // o lista se poate converti intr-un set (ctrl + click pe constr HashSet)
        Set<String> resultWd = new HashSet<>(result);

        // dintr-un set pot face liste -> setul se poate converti intr-o lista
        //  (ctrl + click pe constr ArrayList)
        return new ArrayList<>(resultWd);

    }
}
