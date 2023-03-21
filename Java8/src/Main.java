import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // mapul initial este o colectie de Entry-uri
        Map<String,Integer> map = new HashMap<>();     // de preferat un obiect imutabil ca si cheie, altfel s-ar calcula hashul de fiecare data
        map.put("John", 10);
        map.put("Mike", 15);
        map.put("Anne", 5);
        map.put("Bella", 20);

        // sortare dupa cheie
        Map<String, Integer> sortedMap = new TreeMap<>(map);    // TreeMap mi le-a sortat dupa cheie
        System.out.println(sortedMap);

        // pastrez ordinea
        // Entry - este o intrare de cheie - valoare
        List<Map.Entry<String, Integer>> entries = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entries.add(entry);
        }

        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            // alegem ordinea listei/colectiei - dupa valoare aici
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {  // comparam entry-uri
                return e2.getValue() - e1.getValue();   // dupa cheie se face la fel, dar trebuie folosit compareTo()
            }   // > descr; < cresc; 0 egale
        });

        // linkedHashMap - ca sa pastrez ordinea
        Map<String, Integer> sortedMapV2 = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : entries) {
            sortedMapV2.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMapV2);

    }
}
