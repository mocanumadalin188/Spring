package clase;

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
}