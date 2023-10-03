package arrays.exercitii;

public class Main {
    public static void main(String[] args) {
        // o metoda care primeste ca parametru un array de string-uri
        // si intoarce un nou array cu elementele in ordine inversa
        String[] str = new String[]{"Ana", "are", "mere", "si", "pere"};
        String[] rezultat = inverseaza(str);

        for(String s : rezultat){
            System.out.println(s);
        }

        String input = "propozitie de verificat ";
        System.out.println(nrAparitii(' ', input));
    }

    public static String[] inverseaza(String[] init){
        String[] rezultat = new String[init.length];
        for(int i = init.length - 1; i >= 0; i--){
            rezultat[init.length - i - 1] = init[i];
        }
        return rezultat;
    }

    // o metoda care intoarce numarul de aparitii al unui caracter X dat in string-ul Y
    public static int nrAparitii(char c, String s){
        int nrAparitii = 0;
        for(int i = 0; i < s.length(); i++){
            if(c == s.charAt(i)){
                nrAparitii++;
            }
        }

        return nrAparitii;
    }

}
