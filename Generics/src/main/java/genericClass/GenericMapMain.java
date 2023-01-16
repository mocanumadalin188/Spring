package genericClass;

import genericMethod.Device;

import java.util.HashMap;
import java.util.Map;

public class GenericMapMain {
    public static void main(String[] args) {
        Map<String,String> input = new HashMap<>();
        input.put("k1","v1");
        input.put("k2","v2");
        input.put("k3","v3");
        Map<Integer, Device> input2 = new HashMap<>();
        input2.put(1,new Device("m1", "2KB", "3GB"));
        input2.put(2,new Device("m2", "4KB", "6GB"));
//        displayElements(input);
//        displayElements(input2);
        GenericMap<String,String> input3 = new GenericMapImpl1<String,String>( );
        input3.putMap(input,"k4","v4");
        System.out.println(input3.getMap(input,"k2"));
        displayElements(input);
    }

    private static <K,V> void displayElements(Map<K,V> map){
        for (Map.Entry<K,V> entry:map.entrySet()) {
            System.out.println(entry);
        }
    }
}
