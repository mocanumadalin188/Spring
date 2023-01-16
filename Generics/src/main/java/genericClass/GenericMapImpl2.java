package genericClass;

import genericMethod.Device;

import java.util.Map;

public class GenericMapImpl2 implements GenericMap<String, Device> {

    @Override
    public Map<String, Device> putMap(Map<String, Device> map, String key, Device value) {
        return null;
    }

    @Override
    public Device getMap(Map<String, Device> map, String key) {
        return null;
    }
}
