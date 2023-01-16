package boundGeneric;

public class Animal extends Fiinta{
    private boolean domestic;

    public Animal(String habitat, boolean domestic) {
        super(habitat);
        this.domestic = domestic;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "domestic=" + domestic +
                "} " + super.toString();
    }
}
