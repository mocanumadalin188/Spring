package org.example;

public class Circle extends Shape implements ShapeArea{
    private int r;
    private static final double PI = 3.14;

    public Circle(int r) {
        super();
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    protected double getPerimeter() {
        return 2*PI*r;
    }

    @Override
    public double getArea() {
        return PI*r*r;
    }
}
