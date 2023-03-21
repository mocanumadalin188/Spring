package generics.genericClass;

import java.util.Map;

// TODO raw or not
public class GenericMapImplRaw implements GenericMap {

    @Override
    public Map putMap(Map input, Object key, Object value) {
        input.put(key, value);
        System.out.println(input);
        return input;
    }

    @Override
    public Object getMap(Map input, Object key) {
        System.out.println(input.get(key));
        return input.get(key);
    }
}
