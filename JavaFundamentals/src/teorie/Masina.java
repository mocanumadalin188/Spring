package teorie;

public class Masina {

    private String marca;
    private String model;
    private int anFab;
    private String motor;

    public Masina() {

    }

    public Masina(String marca, String model, int anFab, String motor) {
        this.marca = marca;
        this.model = model;
        this.anFab = anFab;
        this.motor = motor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFab() {
        return this.anFab;
    }

    public void setAnFab(int anFab) {
        this.anFab = anFab;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", anFab=" + anFab +
                ", motor='" + motor + '\'' +
                '}';
    }
}
