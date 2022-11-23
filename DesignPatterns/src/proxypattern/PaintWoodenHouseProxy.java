package proxypattern;

public class PaintWoodenHouseProxy implements House {

    private PaintWoodenHouse paintWoodenHouse;

    @Override
    public void paint() {
        // DO SOMETHING BEFORE/AFTER/AROUND, you are in control
        if (paintWoodenHouse == null) {
            paintWoodenHouse = new PaintWoodenHouse();
        }
        // calls the method on the original object untouched
        paintWoodenHouse.paint();
    }
}
