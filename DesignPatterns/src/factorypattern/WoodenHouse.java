package factorypattern;

public class WoodenHouse implements House {
    @Override
    public void build() {
        System.out.println("Building the wooden house");
    }
}
