package conditionals;

public class MainSwitch {
    public static void main(String[] args) {
        //switch (variabila) {case [constante]: instructiuni; break;}
        int x = 6;
        int y = 4;
        int s = x + y;
        // byte , short , int , char , wrapperele lor , String , enum
        switch (s) {
            case 12 :
                System.out.println("Suma este 6");
                break;
            case 8 :
                System.out.println("Suma este 8");
                break;
            case 7 :
                System.out.println("Suma este 7");
                break;
            case 10 :
                System.out.println("Suma este 10");
                break;
            case 11 :
                System.out.println("Suma este 11");
                break;
            case 6 :
                System.out.println("Suma este 6");
                break;
            default:
                System.out.println("Default");
                break;
        }

        String i = "Ana are mere";
        switch (i.length()){
            case 10:
                System.out.println("Da");
                break;
            default:
                System.out.println("def");
                break;
        }

        Days o = Days.LUNI;
//        if(o == Days.VINERI){
//
//        }

        switch (o) {
            case LUNI:
                System.out.println("abcccccc");
                break;
            case MARTI:
                System.out.println("nu");
                break;
            default:
                System.out.println("DDDD");
        }
        System.out.println(o.getValue());
        System.out.println(o.getEng());
    }

}
