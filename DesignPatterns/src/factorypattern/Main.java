package factorypattern;

/**
 * Creational
 */
public class Main {
    public static void main(String[] args) {
        HouseFactory factory = new HouseFactory();

        House woodenHouse = factory.getHouse("WOODEN");
        woodenHouse.build();
        House ironHouse = factory.getHouse("IRON");
        ironHouse.build();
        House glassHouse = factory.getHouse("GLASS");
        glassHouse.build();
    }
}
