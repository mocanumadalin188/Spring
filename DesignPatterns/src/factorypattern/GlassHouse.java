package factorypattern;

public class GlassHouse implements House {

    @Override
    public void build() {
        System.out.println("Building the glass house");
    }
}
