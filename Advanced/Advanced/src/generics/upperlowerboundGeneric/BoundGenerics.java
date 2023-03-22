package generics.upperlowerboundGeneric;

import generics.Computer;
import generics.Device;
import generics.Gadget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BoundGenerics {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("str1", "str2", "str3");
//        displayElements(strings);
        List<Device> devices = List.of(new Device("manuf1", "2KB", "4KB"));
        displayChildElements(devices);
        List<Computer> computers = List.of(new Computer("manufComp", "8GB", "500GB", "Nvidia"));
        displayChildElements(computers);
        List<Gadget> gadgets = new ArrayList<>();
        displayParentElements(gadgets);
    }

    // upper and lower bounded wildcards

    private static void displayChildElements(Collection<? extends Device> input) {
        for (Device device : input) {
            System.out.println(device);
        }
    }

    private static void displayParentElements(Collection<? super Device> input) {
        for (Object device : input) {
            System.out.println(device);
        }
    }
}
