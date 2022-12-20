package org.example;

public class Square extends Shape implements ShapeArea{
    private int l;

    public Square(int l){
        super();
        this.l = l;
    }

    @Override
    protected double getPerimeter() {
        return l*4;
    }
    public int getL(){
        return l;
    }
    public void setL(int l){
        this.l = l;
    }

    @Override
    public double getArea() {
        return l*l;
    }
}
