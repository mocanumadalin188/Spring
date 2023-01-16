package boundGeneric;

public class Pisica extends Animal{
    private int nrDeVieti;

    public Pisica(String habitat, boolean domestic, int nrDeVieti) {
        super(habitat, domestic);
        this.nrDeVieti = nrDeVieti;
    }

    public int getNrDeVieti() {
        return nrDeVieti;
    }

    public void setNrDeVieti(int nrDeVieti) {
        this.nrDeVieti = nrDeVieti;
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "nrDeVieti=" + nrDeVieti +
                "} " + super.toString();
    }
}
