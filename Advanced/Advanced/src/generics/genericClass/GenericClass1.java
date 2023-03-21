package generics.genericClass;

import generics.Device;

import java.util.Collection;

public class GenericClass1 implements GenericInterface<Device> {

    @Override
    public void printCollection(Collection<Device> collection) {
        System.out.println("printing devices");
    }
}
