package genericMethod;

import java.util.*;

public class GenericMethod {
    public static void main(String[] args) {
        List<String> strings = List.of(" str1 ", " str2 ", " str3 ");
        displayElements(strings);
        List<Device> devices = new ArrayList<>();
        Device d1 = new Device("Manufacture 1", "2KB", "10Gb");
        Device d2 = new Device("Manufacture 2", "4KB", "20Gb");
        devices.add(d1);
        devices.add(d2);
        displayElements(devices);
        List<Integer> integers = List.of(1,2,3);
        displayElementsInParticular(devices,integers);

        Map map2 = new HashMap();
        map2.put("a","b");
        map2.put(1,2);
        System.out.println(map2);

        Map<String, String> map3 = new HashMap<String,String>();
        map3.put("a","b");
        //map3.put(1,2);
        System.out.println(map2);

    }

    private static <T> void displayElements(Collection<T> input){
        for (T i: input) {
            System.out.println(i);
        }
    }

    private static <T,R> void displayElementsInParticular(Collection<T> input, Collection<R> input2){
        for(T i : input){
            if(i instanceof String){
                System.out.println("String: " + i);
            } else if (i instanceof Integer) {
                System.out.println("Integer: " +i);
            } else if (i instanceof Device) {
                System.out.println("Device: " + i);
            }
        }
        for(R i : input2){
            if(i instanceof String){
                System.out.println("String: " + i);
            } else if (i instanceof Integer) {
                System.out.println("Integer: " +i);
            } else if (i instanceof Device) {
                System.out.println("Device: " + i);
            }
        }


    }

}
