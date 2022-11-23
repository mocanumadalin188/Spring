package templatepattern;

public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("glass walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("glass pillars");
    }

}
