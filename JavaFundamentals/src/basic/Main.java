package basic;

public class Main {
    public static void main(String[] args) {
        Person p = null;

//        Person q = new Person();
//        System.out.println(q.varsta);
        Person z = new Person(4);
        z.varsta = 15;
        System.out.println(z);

//        Person q;
//        q = new Person("ab", 'm', 12 , 172);
//        System.out.println(q);

        Person k = new Person("ab", 12, 'm' , 172);
        k.seteaza("Alin");
        System.out.println(k);
    }
}
