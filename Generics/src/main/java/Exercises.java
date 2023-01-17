import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        Pair<String,String,Integer> input = new Pair<>();
        input.setKey("aparat");
        input.setValue("string");
        input.setList(List.of(1,2,3,4,5));
        System.out.println(input.concatenate());
    }
}
