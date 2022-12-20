package org.example.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        House house = new House();
        Method[] methods = house.getClass().getMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }
        House houseReflectionInstance = null;
        try{
            houseReflectionInstance =(House) Class.forName("org.example.reflection.casa").newInstance();
        }catch (ClassNotFoundException c){
            System.out.println("ERROR!");
            try{
                throw new MyException("my exception");
            }catch (MyException e){
                System.out.println("___");
            }
        }finally {
            System.out.println("Finally block executed");
        }
        System.out.println("house normally instantiated: " + house.hashCode());
//        System.out.println("house reflection instantiated: " + houseReflectionInstance.hashCode());
//        System.out.println(houseReflectionInstance.getClass().getSuperclass());

//        Method method = Class.forName("org.example.reflection.House").getDeclaredMethod("method1",null);
//        method.setAccessible(true);
//        method.invoke(house,null);
          //      house.method1();








    }
}
