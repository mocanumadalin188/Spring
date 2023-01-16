package genericClass;

import java.util.Map;

public class GenericMapImpl1<K,V> implements GenericMap<K, V> {


    @Override
    public Map<K, V> putMap(Map<K, V> map, K key, V value) {
        map.put(key,value);
        return map;
    }

    @Override
    public V getMap(Map<K, V> map, K key) {
        return map.get(key);
    }
}
