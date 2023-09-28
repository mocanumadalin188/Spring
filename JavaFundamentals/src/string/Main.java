package string;

public class Main {
    public static void main(String[] args) {
        // String este immutable -> odata creat un string , nu exista metode care modifica stringul initial
        // nu poate fi modificat.
        String s = new String("abc");
        String ss = new String("abc");

        System.out.println(s == ss);
        String y = "abc";
        String x = "abc";
        System.out.println(x == y);
        // acest string e cacheuit in ceva ce se numeste stringpool -> zona de memorie care face parte din heap.

        String s1 = "Ana are mere";
        String s2 = "e";

        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(s2));
        System.out.println(s1.charAt(3));
        System.out.println("abc".compareToIgnoreCase("ABC"));

        System.out.println(s1.endsWith(s2));

        System.out.println("NBA".equalsIgnoreCase("nba"));

        System.out.println(s1.indexOf(" "));
        System.out.println(s1.indexOf('e', 2));
        System.out.println("".isBlank());
    }
}
