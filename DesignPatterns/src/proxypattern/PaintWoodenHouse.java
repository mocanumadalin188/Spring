package proxypattern;

public class PaintWoodenHouse implements House {

    public PaintWoodenHouse() {
        System.out.println("bringing heavy materials needed for painting..");
    }

    @Override
    public void paint() {
        System.out.println("painting done");
    }
}
