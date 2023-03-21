package generics.genericClass;

import java.util.List;

public class Pair<K, V, R> {

    K key;
    V value;
    List<R> result;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public List<R> getResult() {
        return result;
    }

    public void setResult(List<R> result) {
        this.result = result;
    }

    public String bb() {
        StringBuilder str = new StringBuilder();
        str.append(key);
        str.append(value);
        result.forEach(b -> str.append(b));
        return str.toString();
    }
}
