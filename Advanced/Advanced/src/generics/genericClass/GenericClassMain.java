package generics.genericClass;

import generics.Device;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class GenericClassMain {

    public static void main(String[] args) {
//        GenericClass1 genericClass1 = new GenericClass1();
//        genericClass1.printCollection(List.of(new Device("manufacturer", "2KB", "200KB")));
//
//        GenericClass2 genericClass2 = new GenericClass2();
//        genericClass2.printCollection(List.of("string"));
//        // raw use TODO make it non raw
//        // required OBJECT
//        GenericInterface genericInterface = new GenericInterface() {
//            @Override
//            public void printCollection(Collection collection) {
//                for (Object obj : collection) {
//                    System.out.println(obj.toString());
//                }
//            }
//        };
//        genericInterface.printCollection(List.of(1, 2, 3));

        Pair<String, String, Integer> pair = new Pair<>();
        pair.setKey("a");
        pair.setValue("b");
        pair.setResult(List.of(1));
        System.out.println(pair.bb());

    }
}
