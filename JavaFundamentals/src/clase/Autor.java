package clase;

import java.util.Objects;

public class Autor {
    //nume prenume varsta
    private String nume;
    private String prenume;
    private int varsta;

    public Autor(String nume){
        this.nume = nume;
    }

    public Autor(String nume, String prenume, int varsta){
        this(nume);
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume(){
        return this.nume;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public String getPrenume(){
        return this.prenume;
    }
    public void setPrenume(String prenume){
        this.prenume = prenume;
    }
    public int getVarsta(){
        return this.varsta;
    }
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return varsta == autor.varsta && Objects.equals(nume, autor.nume) && Objects.equals(prenume, autor.prenume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, varsta);
    }
}