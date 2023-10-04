package arrays.loops;

import arrays.Persoana;

public class LoopMain {

    //for
    public static void main(String[] args) {
        String[] str = new String[]{"s1", "s2sd23", "asddasdas", "asddasdsasdaasdds", "abc", "bddh"};
//        i = 0 ,1 ,2
        // variabila de inceput ; conditie de oprire; pas de mers mai departe
        for (int i = 0; i < str.length; i += 1) {
            System.out.println(str[i].length());
        }
        //while

        Persoana[] p = new Persoana[4];
        p[0] = new Persoana("Victor", "Mocanu", "213432132113");
        p[1] = new Persoana("Ionut", "Popescu", "213412312455");
        p[2] = new Persoana("Adrian", "Ionescu", "656565656565");
        p[3] = new Persoana("Mirel", "Andrei", "43344343434343");
        // o sa printam numele persoanelor pana cand ajungem la Adrian
        int i = 0;
        //while (conditie)
        // cat timp conditia este adevarata , mergem mai departe.
        // cand conditia a devenit falsa, se iese din while
        while (p[i].getNume().equals("abc")) {
            System.out.println(p[i].getNume());
            i++;
        }

        System.out.println("----------------");

        i = 0;
        do {
            System.out.println(p[i].getNume());
            i++;
        } while (3 < 2);

//        int x[] = new int[]{1,2,3};

        int[] x = new int[]{10, 20, 30};
        for (int k = 0; k < x.length; k++) {
            if (x[k] == 20) {
                break;
            }
            System.out.println(x[k]);
        }
    }

}
