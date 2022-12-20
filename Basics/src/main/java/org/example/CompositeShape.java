package org.example;

public class CompositeShape {
    private Shape shape;

    public CompositeShape(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
