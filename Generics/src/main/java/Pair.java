import java.util.List;

public class Pair<K,V,T> {
    private K key;
    private V value;
    private List<T> list;


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

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public String concatenate(){
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        sb.append(value);
        for (T i : this.list){
            sb.append(i);
        }
        return sb.toString();
    }
}
