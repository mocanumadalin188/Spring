package conditionals.exercitii;

public enum Anotimp {
    PRIMAVARA(10, 25),
    VARA(15, 35),
    TOAMNA(5, 20),
    IARNA(-10, 10);

    private final int minim;
    private final int maxim;

    Anotimp(int minim, int maxim){
        this.minim = minim;
        this.maxim = maxim;
    }

    public int getMinim() {
        return minim;
    }

    public int getMaxim() {
        return maxim;
    }
}