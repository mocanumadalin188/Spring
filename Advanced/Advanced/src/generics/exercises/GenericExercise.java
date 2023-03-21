package generics.exercises;

import java.util.ArrayList;
import java.util.List;

public class GenericExercise {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
//        appendNewObject(names); // compilation error!
        List namesRaw = new ArrayList();
        appendNewObject(namesRaw);
    }

    // LIST<STRING> IS NOT A LIST<OBJECT>

    static void appendNewObject(List<Object> list) {
        list.add(new Object());
    }
}
