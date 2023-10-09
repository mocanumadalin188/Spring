package varargs;

public class VarArgMain {

    public static void main(String[] args) {
        int[] p = new int[]{2,3,5};
        System.out.println(sum("a",1,2,3));
        System.out.println(sum("a", p));
    }


    public static int sum(String x, int... a){
        int sum = 0;
        for(int i = 0 ; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }
}
