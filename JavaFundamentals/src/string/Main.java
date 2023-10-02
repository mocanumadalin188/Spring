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

        String s1 = "Ana are mere\nasdsadasdas\n";
        String s2 = "e";

        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(s2));
        System.out.println(s1.charAt(3));
        System.out.println("abc".compareToIgnoreCase("ABC"));

        System.out.println(s1.endsWith(s2));

        System.out.println("NBA".equalsIgnoreCase("nba"));

        System.out.println(s1.indexOf("mere"));
        System.out.println(s1.indexOf('e', 8));
        System.out.println("".isBlank());
        String spaces = "";
        System.out.println(spaces.length());
        System.out.println(spaces.isEmpty());

        System.out.println(s1.lastIndexOf('A'));

        System.out.println(s1.replace('\n', 'P'));

        System.out.println(s1.startsWith(" ", 3));
        System.out.println("      bbbb          ".trim());
        System.out.println(s1.substring(2));
        System.out.println("xyz".toUpperCase());
        long l = 23;
        String ls = String.valueOf(23);
        System.out.println(ls.replace("2", "45"));
        System.out.println(s1.replace("X", "prune"));
    }
}
