package basic;

public class Person {
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


    public Person(String n) {
        nume = n;
        varsta = 12;
    }

    public Person(int v) {
        varsta = v;
    }

    public Person(String nume, int varsta, char gen, int inaltime){
        this.nume = nume;
        this.varsta = varsta;
        this.gen = gen;
        this.inaltime = inaltime;
    }

    public void seteaza(String nume) {
        this.nume = nume;
    }
}
