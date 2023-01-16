package genericClass;

import java.util.Map;

public interface GenericMap<K,V> {
    Map<K,V> putMap(Map<K,V> map, K key, V value);
    V getMap(Map<K,V> map, K key);
}
