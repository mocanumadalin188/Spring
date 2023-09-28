package joc;

import java.util.Objects;

// Avem un joc cu 2 jucatori. Jocul are un nr de niveluri. Are o dificultate : Da/ Nu, Are un nume al jocului.
//Are tip de joc
public final class Joc {
    private String nume;
    private int numarNiveluri;
    private boolean esteDificil;
    private String tip;
    private Jucator jucator1;
    private Jucator jucator2;

    private int numarTotalPuncte;

    public Joc(String nume, Jucator j1, Jucator j2) {
        this.nume = nume;
        this.jucator1 = j1;
        this.jucator2 = j2;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarNiveluri() {
        return numarNiveluri;
    }

    public void setNumarNiveluri(int numarNiveluri) {
        this.numarNiveluri = numarNiveluri;
    }

    public boolean isEsteDificil() {
        return esteDificil;
    }

    public void setEsteDificil(boolean esteDificil) {
        this.esteDificil = esteDificil;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Jucator getJucator1() {
        return jucator1;
    }

    public void setJucator1(Jucator jucator1) {
        this.jucator1 = jucator1;
    }

    public Jucator getJucator2() {
        return jucator2;
    }

    public void setJucator2(Jucator jucator2) {
        this.jucator2 = jucator2;
    }

    public int getNumarTotalPuncte() {
        return this.numarTotalPuncte;
    }

    public void setNumarTotalPuncte(int numarTotalPuncte) {
        this.numarTotalPuncte = numarTotalPuncte;
    }

    @Override
    public String toString() {
        return this.nume + ", " + this.numarNiveluri + ", " + this.esteDificil + ", " + this.tip + this.jucator1 + ", " + this.jucator2;
    }

    // numele jocului la fel si jucator 1  egal jucator2
    @Override
    public boolean equals(Object object) {
        Joc x = (Joc) object;
        return this.nume.equals(x.nume) && this.jucator1.equals(x.jucator1) && this.jucator2.equals(x.jucator2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, jucator1, jucator2);
    }

    //suma punctelor obtinute de ambii jucatori
    public int sumaPuncte() {
        return this.jucator1.getNumarPuncte() + jucator2.getNumarPuncte();
    }

    public void seteazaSumaTotala() {
        setNumarTotalPuncte(sumaPuncte());
    }

    public static int sumaPunctelorDouaJocuri(Joc joc1, Joc joc2) {
        return joc1.getNumarTotalPuncte() + joc2.getNumarTotalPuncte();
    }
}