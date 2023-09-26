package basic;

public class PersonBasic {
    // HAS-A
    public String nume;
    public int varsta;
    public char gen;
    public int inaltime;

    public static boolean areNas = true;

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", gen=" + gen +
                ", inaltime=" + inaltime +
                '}';
    }

    // access modifier + nume_clasa


    public PersonBasic(String n) {
        nume = n;
        varsta = 12;
    }

    public PersonBasic(int v) {
        varsta = v;
    }

    public PersonBasic(String nume, int varsta, char gen, int inaltime){
        this.nume = nume;
        this.varsta = varsta;
        this.gen = gen;
        this.inaltime = inaltime;
    }

    public void seteaza(String nume) {
        this.nume = nume;
    }

    public void gateste(){

    }

    public static void respira(){

    }

    public boolean compara(PersonBasic p){
        return p.varsta == this.varsta;
    }
}
