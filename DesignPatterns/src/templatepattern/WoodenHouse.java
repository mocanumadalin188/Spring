package templatepattern;

public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("wooden walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("wooden pillars");
    }

}
