package wrappers;

public class Main {

    public static void main(String[] args) {
        final int x;
        String z = "2";
        int xy = Integer.valueOf(z);

        Integer y = 3;
        System.out.println(y.intValue());

        System.out.println(xy);
        // wrappere peste primitive
        // boxing

        int o = 3;
        o = 4;
        o++;
        final int q = 9;
    }
}
