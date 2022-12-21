package org.example.maps;

import java.util.HashMap;
import java.util.Map;

public class MapServices {
    public static Map<String, String> copyMap(Map<String,String> map){
        Map<String,String> result = new HashMap<>();
        for (Map.Entry<String,String> entry : map.entrySet()){
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

}
