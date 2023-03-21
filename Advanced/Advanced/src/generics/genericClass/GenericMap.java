package generics.genericClass;

import java.util.Map;

public interface GenericMap<K, V> {

    Map<K, V> putMap(Map<K, V> input, K key, V value);

    V getMap(Map<K, V> input, K key);

}
