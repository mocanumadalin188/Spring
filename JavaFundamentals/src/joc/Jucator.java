package joc;

import java.util.Objects;

public class Jucator {
    private String nume;
    private long id;
    private int numarPuncte;
    private boolean esteVeteran;

    public Jucator(String nume, long id, boolean esteVeteran) {
        this.nume = nume;
        this.id = id;
        this.esteVeteran = esteVeteran;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumarPuncte() {
        return this.numarPuncte;
    }

    public void setNumarPuncte(int numarPuncte) {
        this.numarPuncte = numarPuncte;
    }

    public boolean isEsteVeteran() {
        return this.esteVeteran;
    }

    public void setEsteVeteran(boolean esteVeteran) {
        this.esteVeteran = esteVeteran;
    }

    //nume, id, nr puncte, veteran sau nu
    @Override
    public String toString() {
        return this.nume + ", " + this.id + ", " + this.numarPuncte + ", " + this.esteVeteran;
    }

    @Override
    public boolean equals(Object object) {
        Jucator x = (Jucator) object;
        //2 jucatori sunt identici cand au toate campurile egale
        return this.nume.equals(x.nume) && this.id == x.id && this.numarPuncte == x.numarPuncte && this.esteVeteran == x.esteVeteran;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, id, numarPuncte, esteVeteran);
    }


}