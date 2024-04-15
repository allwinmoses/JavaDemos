package com.util.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"java");
        hashMap.put(10, "Spring");
        hashMap.put(8,"Node");
        hashMap.put(null, "Css");
        hashMap.put(null, "Angular");
        hashMap.put(5, "Html");
        hashMap.put(6,"react");
        System.out.println(hashMap);

        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(102));
        System.out.println(hashMap.getOrDefault(102,"JSP"));
        System.out.println(hashMap.containsKey(1));
        hashMap.values();

        System.out.println();
        Set<Integer> keys = hashMap.keySet();
        for(Integer key : keys){
            System.out.println(key+ " "+hashMap.get(key));
        }

        System.out.println();
        System.out.println("Using entry set");
        Set<Map.Entry<Integer, String>>entries = hashMap.entrySet();

        for(Map.Entry<Integer, String>entry:entries){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
