package clase;

public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor("Viorel", "Andrei", 30);
        Autor a2 = a1;
        Autor a3 = new Autor("Viorel", "Andrei", 22);
        a1 = a3;

        System.out.println(a1.getPrenume());
        System.out.println(a2.getPrenume());
        a2.setVarsta(15);

        System.out.println(a1.getVarsta());

        Carte c1 = new Carte("t1", a1);
        System.out.println(c1);
        //setam titlul cartii c1 cu ceva si setam autorul cu altceva
        // printam autorul cartii c1
        c1.setTitlu("t2");
        c1.setAutor(new Autor("n2", "p2", 40));
        System.out.println(c1.getAutor());
        c1.setPret(30);
        // Vrem sa marim pretul unei Carti cu x%(unde x e un int(5)) , sa returnam noul pret dar sa-l si setam
        Carte c2 = new Carte("t5", a1);
        c2.setPret(10);
        c2.marestePretul(50);
        System.out.println(c2.getPret());
        System.out.println(c2.getAutor().getNume());

        // variabilele locale si referintele sunt puse pe stack

        // obiectele in sine sunt puse in HEAP

        System.out.println(a1);

        System.out.println(a1.hashCode());
        System.out.println(a3.hashCode());
        System.out.println(a2.hashCode());

        System.out.println(a1 == a3);

        String x = new String("abc");
        String y = new String("abc");
        System.out.println(x == y);
        System.out.println(x.equals(y));
        // int , short , byte,  long , char, boolean, float , double

        System.out.println(a1.equals(a2));


    }
}