package conditionals;

public class MainIf {
    // if (conditie1){instructiune1} elseif(conditie2){instructiuni2..N} else{instructiuneN+1}
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int s = x + y;
        if (s == 6) {
            System.out.println("Suma este 7");
        }
        else{
            System.out.println("Orice altceva");
        }

        // vreau sa verific daca un string are 10 caracvtere . Daca da , o sa returnez un substring cu primele 5 caractere din el, iar daca nu ,atunci iau doar primele  3 caractere.
    }

    public String transforma(String p){
        String noulString;
        if(p.length() == 10){
            noulString = p.substring(0,5);
        }
        else{
            noulString = p.substring(0, 3);
        }
        return noulString;
    }

    public String transforma2(String p){
        if(p.length() == 10){
            return p.substring(0,5);
        }
        else{
            return p.substring(0, 3);
        }
    }
}
