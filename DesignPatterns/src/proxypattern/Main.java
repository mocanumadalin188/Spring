package proxypattern;

/**
 * Structural
 */
public class Main {
    public static void main(String[] args) {
        House houseProxy = new PaintWoodenHouseProxy();

        houseProxy.paint();
        houseProxy.paint();
    }
}
