package clase;

public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor("n1", "p1", 30);
        Carte c1 = new Carte("t1", a1);
        System.out.println(c1);
        //setam titlul cartii c1 cu ceva si setam autorul cu altceva
        // printam autorul cartii c1
        c1.setTitlu("t2");
        c1.setAutor(new Autor("n2", "p2", 40));
        System.out.println(c1.getAutor());
    }
}