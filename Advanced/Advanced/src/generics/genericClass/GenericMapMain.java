package generics.genericClass;

import generics.Device;

import java.util.HashMap;
import java.util.Map;

// TODO raw use or not
public class GenericMapMain {

    public static void main(String[] args) {
        Map<String, String> stringVSstring = new HashMap<>();
        stringVSstring.put("key1", "value1");
        stringVSstring.put("key2", "value2");

        GenericMapImplRaw genericMapImplRaw = new GenericMapImplRaw();
        genericMapImplRaw.getMap(stringVSstring, "key");
        genericMapImplRaw.putMap(stringVSstring, "key3", "value3");
        genericMapImplRaw.getMap(stringVSstring, "key3");

        // https://stackoverflow.com/questions/2770321/what-is-a-raw-type-and-why-shouldnt-we-use-it

        genericMapImplRaw.putMap(stringVSstring, 1, "value4");
        System.out.println(stringVSstring);

        Map<Integer, Device> intVSdevice = new HashMap<>();
        intVSdevice.put(1, new Device("manufact", "1KB", "1MB"));
        intVSdevice.put(2, new Device("manufact", "2KB", "2MB"));
        genericMapImplRaw.putMap(intVSdevice, 3, new Device("manufact", "3KB", "3MB"));
        genericMapImplRaw.getMap(intVSdevice, 3);


        stringVSstring.clear();

        stringVSstring.put("key1", "value1");
        stringVSstring.put("key2", "value2");

        GenericMapImplParameterized genericMapImplParameterized = new GenericMapImplParameterized();
        genericMapImplParameterized.getMap(stringVSstring, "key");
        genericMapImplParameterized.putMap(stringVSstring, "key3", "value3");
        genericMapImplParameterized.getMap(stringVSstring, "key3");

        // compilation error
//        genericMapImplParameterized.putMap(stringVSstring, 1, "value4");
        System.out.println(stringVSstring);
    }
}
