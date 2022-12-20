package org.example;

public class Main {
    public static void main(String[] args) {

        Shape shapeCircle = new Circle(10);
        System.out.println("Perimeter : " + shapeCircle.getPerimeter());

        Circle circle = new Circle(4);

        Shape shapeSquare = new Square(25);
        System.out.println("Perimeter : " + shapeSquare.getPerimeter());

        CompositeShape compositeShape = new CompositeShape(circle);

        ShapeArea shapeAreaCircle = new Circle(12);
        System.out.println(shapeAreaCircle.getArea());

        ShapeArea shapeAreaSquare = new Square(60);
        System.out.println(shapeAreaSquare.getArea());

        OuterClass outerClass = new OuterClass();
        //OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        System.out.println(outerClass.x + innerClass.y);

        //TODO - builder pattern java

        for (Days day : Days.values()) {
            System.out.println("Today is: " + day);
        }

        System.out.println(Days.LUNI.getValue());
        System.out.println(Days.LUNI.getOrder());

        Days days = Days.LUNI;
        switch (days) {
            case LUNI:
                System.out.println("luni");
                break;
            case MARTI:
                System.out.println("marti");
                break;

            default:
        }


    }
}