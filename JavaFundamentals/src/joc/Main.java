package joc;

public class Main {
    public static void main(String[] args) {

        Jucator j1 = new Jucator("Dragos", 1, true);
        j1.setNumarPuncte(200);

        Jucator j2 = new Jucator("Alin", 2, true);
        j2.setNumarPuncte(20);

        Joc joc = new Joc("Macao", j1, j2);
        joc.setTip("Joc de carti");
        joc.setNumarNiveluri(0);

        System.out.println(joc.sumaPuncte());
        joc.seteazaSumaTotala();

        Joc bowling = new Joc("Macao", j1, j2);
        bowling.setTip("relaxare");
        bowling.setNumarNiveluri(1);

        j1.setNumarPuncte(30);
        j2.setNumarPuncte(50);

        System.out.println(joc.equals(bowling));
        System.out.println(bowling.sumaPuncte());
        bowling.seteazaSumaTotala();
        System.out.println(bowling.getNumarTotalPuncte());

        System.out.println(Joc.sumaPunctelorDouaJocuri(joc, bowling));
    }
}