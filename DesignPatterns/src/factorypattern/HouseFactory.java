package factorypattern;

/**
 * Not exposed to client , internal creation of objects within the factory based on input.
 */
public class HouseFactory {

    public House getHouse(String houseType) {
        if ("GLASS".equals(houseType)) {
            return new GlassHouse();
        } else if ("IRON".equals(houseType)) {
            return new IronHouse();
        } else if ("WOODEN".equals(houseType)) {
            return new WoodenHouse();
        }

        return null;
    }
}
