package conditionals.exercitii;

public class Joc {
    //nume joc, anotimp (enum)
    private String nume;
    private Anotimp anotimp;
    private int numarJucatori;

    public Joc(String nume, Anotimp anotimp, int numarJucatori){
        this.nume = nume;
        this.anotimp = anotimp;
        this.numarJucatori = numarJucatori;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Anotimp getAnotimp() {
        return anotimp;
    }

    public void setAnotimp(Anotimp anotimp) {
        this.anotimp = anotimp;
    }

    public int getNumarJucatori() {
        return numarJucatori;
    }

    public void setNumarJucatori(int numarJucatori) {
        this.numarJucatori = numarJucatori;
    }
    //in functie de temperatura curenta vrem sa vedem daca putem juca jocul sau nu(prea cald/ prea frig) si returnam string-ul
    //"jocul nostru se poate juca" sau "jocul nostru nu se poate juca" in functie de caz
    public String verifica(int temperatura){
        String valoare = "Jocul nostru nu se poate juca.";
        if (temperatura >= anotimp.getMinim() && temperatura <= anotimp.getMaxim()){
            valoare = "Jocul nostru se poate juca.";
        }
        return valoare;
    }

    //verifica daca numele jocului are acelasi nr de caractere cu nr de jucatori ai jocului
    //daca da atunci o sa returnam temeratura maxima a anotimpului jocului respectiv
    public int verificaNume(){
        if (nume.length() == numarJucatori){
            return anotimp.getMaxim();
        }
        return 0;
    }

}