package templatepattern;

/**
 * Behavioural
 */
public class HousingClient {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        System.out.println("Building wooden house...");
        //using template method
        houseType.buildHouse();

        houseType = new GlassHouse();

        System.out.println("Building glass house...");
        houseType.buildHouse();
    }

}
