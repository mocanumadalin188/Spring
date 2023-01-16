package boundGeneric;

public class Caine extends Animal{
    private String rasa;

    public Caine(boolean domestic, String rasa,String habitat) {
        super(habitat,domestic);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public String toString() {
        return "Caine{" +
                "rasa='" + rasa + '\'' +
                "} " + super.toString();
    }
}
