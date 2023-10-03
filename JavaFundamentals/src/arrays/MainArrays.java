package arrays;

public class MainArrays {
    public static void main(String[] args) {
        // tip_date[] nume_variabila (initializare sau nu)
        int[] numere = new int[5];
        for(int x : numere){
            System.out.println(x);
        }
        System.out.println(numere[4]);
        String[] strings = new String[]{"str1", "str2", "str3", "str4"};
        System.out.println(strings[1]);
        Persoana p1 = new Persoana("Mocanu", "Madalin", "2131512313131");
        Persoana[] pArray = new Persoana[]{
              p1,
              new Persoana("Ionut", "Popescu", "213412312455"),
              new Persoana("Adrian", "Ionescu", "656565656565"),
              new Persoana("Mirel", "Andrei", "43344343434343")
        };

        System.out.println(pArray[0]);
        pArray[0] = new Persoana("Victor", "Mocanu", "213432132113");
        System.out.println(pArray[0]);

        System.out.println(pArray.length);

        // printam toate numele persoanelor din pArray.
        for(int i = 0; i < pArray.length; i++){
            System.out.println(pArray[i].getNume());
        }

        System.out.println("---------------------");

        int j = 0;
        while(j < pArray.length){
            System.out.println(pArray[j].getPrenume());
            j++;
        }

        System.out.println("-----------------");
        String chA = "Array de caractere";
        char[] arr = chA.toCharArray();
        for(char x : arr){
            System.out.println(x);
        }
        System.out.println("---------------");
        String propozitie = "Am definit o propozitie";
        String[] cuvinte = propozitie.split(" ");
        for(String cuvant : cuvinte){
            System.out.println(cuvant);
        }

    }
}
