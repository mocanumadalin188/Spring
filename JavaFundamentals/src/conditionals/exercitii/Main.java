package conditionals.exercitii;

public class Main {
    public static void main(String[] args) {
        Joc j1 = new Joc("fotbal", Anotimp.IARNA, 10);
        Joc j2 = new Joc("basket", Anotimp.TOAMNA, 6);
        Joc j3 = new Joc("volei", Anotimp.VARA, 4);

        System.out.println(j1.verifica(34));
        System.out.println(j3.verifica(34));

//        Anotimp o = Anotimp.IARNA;
        Anotimp aj1 = j2.getAnotimp();


        switch (aj1){
            case IARNA:
                System.out.println("Jocul se poate juca iarna.");
                break;
            case VARA:
                System.out.println("Jocul se poate juca vara.");
                break;
            case PRIMAVARA:
                System.out.println("Jocul se poate juca primavara.");
                break;
            case TOAMNA:
                System.out.println("Jocul se poate juca toamna.");
                break;
            default:
                System.out.println("Jocul nu se poate juca in nici un anotimp.");
                break;
        }

        System.out.println(j2.verificaNume());
    }
}