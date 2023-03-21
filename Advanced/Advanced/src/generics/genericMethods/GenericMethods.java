package generics.genericMethods;

import generics.Device;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("str1", "str2", "str3");
        displayElements(strings);
        System.out.println();
        displayElementsParticularity(strings);

        List<Integer> integers = Arrays.asList(1, 2, 3);
        displayElements(integers);
        System.out.println();
        displayElementsParticularity(integers);


        List<Device> devices = new ArrayList<>();

        devices.add(new Device("manufacturer1", "2GB", "500KB"));
        devices.add(new Device("manufacturer2", "3GB", "400KB"));
        devices.add(new Device("manufacturer2", "1GB", "300KB"));
        displayElements(devices);
        System.out.println();
        displayElementsParticularity(devices);
    }

    private static <T> void displayElements(Collection<T> input) {
        for (T elem : input) {
            System.out.println(elem.toString());
        }
    }

    private static <T> void displayElementsParticularity(Collection<T> input) {
        for (T elem : input) {
            if (elem instanceof String) {
                System.out.println("printing string");
            } else if (elem instanceof Integer) {
                System.out.println("printing integer");
            } else if (elem instanceof Device) {
                System.out.println("printing device");
            }
            System.out.println(elem.toString());
        }
    }
}
