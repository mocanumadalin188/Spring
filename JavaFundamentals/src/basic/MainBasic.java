package basic;

public class MainBasic {
    public static void main(String[] args) {
        PersonBasic p = null;

//        Person q = new Person();
//        System.out.println(q.varsta);
        PersonBasic z = new PersonBasic(4);
        z.varsta = 15;
        System.out.println(z);
        // this

//        Person q;
//        q = new Person("ab", 'm', 12 , 172);
//        System.out.println(q);

        PersonBasic k = new PersonBasic("ab", 15, 'm' , 172);
        k.seteaza("Alin");

        k.gateste();
        z.gateste();

        PersonBasic.respira();

        PersonBasic.areNas = false;
        System.out.println(k);

        // compar k cu z
        System.out.println(z.compara(k));
        System.out.println(Exercitii.compara(z, k));
    }
}
