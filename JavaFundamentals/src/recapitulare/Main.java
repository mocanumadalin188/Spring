package recapitulare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pagina p1 = new Pagina("Textul de pe prima pagina din carte", true);
        Pagina p2 = new Pagina("A fost scris textul de pe a doua pagina", false);

        Pagina p3 = new Pagina("Inventam niste texte", false);
        Pagina p4 = new Pagina("Rezolvam cerintele", true);
        Pagina p5 = new Pagina("Daca vreti pauza puteti sa spuneti", false);

        Carte c1 = new Carte("Tainele scrisului", new Pagina[]{p1, p2}, new String[]{"romana"}, TipCarte.PROZA, new String[]{"Capitolul 1"});
        Carte c2 = new Carte("LuceafaruL", new Pagina[]{p3, p4, p5}, new String[]{"romana", "franceza"}, TipCarte.POEZIE, new String[]{"C1", "C2", "C3"});

        Carte[] cartiA1 = new Carte[2];
        cartiA1[0] = c1;
        cartiA1[1] = c2;
        Autor a1 = new Autor("Calin", 40, cartiA1);

        Pagina p6 = new Pagina("Plec la mare;la", false);
        Pagina p7 = new Pagina("Acusi vine weekendul", false);
        Pagina p8 = new Pagina("Nu avem idei", false);
        Pagina p9 = new Pagina("Iubesc traficul de la 12", false);

        Carte c3 = new Carte("Traficul din Bucuresti", new Pagina[]{p6, p7, p8, p9}, new String[]{"romana"}, TipCarte.CRITICA, new String[]{"Tristete"});

        Autor a2 = new Autor("Anton", 60, new Carte[]{c3});

        Autor[] autori = new Autor[]{a1, a2};
//
//        System.out.println(Arrays.toString(a1.numaraPagini()));
//
//        Carte[] rez = a1.verificaTitlulCartilor("L");
//        for (Carte c : rez){
//            if (c != null){
//                System.out.println(c);
//            }
//        }


        System.out.println(a1);

        boolean aux = Carte.verificaDouaCarti(c1, c2);
        System.out.println(aux);

        Boolean aux2 = Carte.verificaDouaCarti(c1, c2);
        System.out.println(aux2);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.hashCode());

//        boolean aux = Carte.verificaDouaCarti(c1, a2);
//        System.out.println(aux);

        System.out.println(Arrays.toString(Autor.stringAutori(autori)));
        System.out.println();

        System.out.println(a1.titluriCart(0));

        System.out.println(c3.numarAparitii("la"));

        System.out.println(Arrays.toString(a1.printPagina("LuceafaruL", "cerintele")));
    }

}