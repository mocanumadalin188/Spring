package org.example.reflection;

public class House extends HouseParent{
    protected String field;
    private void method1(){
        System.out.println("Calling from method 1");
    }
    public void method2(){
        System.out.println("Calling from method 2");
    }

}
