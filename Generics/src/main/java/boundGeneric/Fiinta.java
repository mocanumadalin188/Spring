package boundGeneric;

public class Fiinta extends FiintaParent{
    private String habitat;

    public Fiinta(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Fiinta{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
}
