package org.example.exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Service {
    public static boolean hasDuplicates(List<String> listStr){
        Set<String> setString = new HashSet<>();
        for(String string : listStr){
            boolean res = setString.add(string);
            if(!res){
                return true;
            }
        }
        return false;
    }

    public static boolean hasDuplicates2(List<String> listStr){
        Set<String> setString = new HashSet<>(listStr);
        return listStr.size() != setString.size();
    }
}
