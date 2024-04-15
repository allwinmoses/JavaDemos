package com.util.map;

import java.util.*;

public class MapStageDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap = new HashMap<>();

        stateMap.put("Karnataka", Arrays.asList("Bengaluru","Tumkur","Dhavangere"));
        stateMap.put("TamilNadu",Arrays.asList("Madurai","Chennai","coimbature"));
        stateMap.put("Maharastra",Arrays.asList("nagapur","pune","mumbai"));



        Set<Map.Entry<String,List<String>>> entries = stateMap.entrySet();

        for(Map.Entry<String,List<String>> entry : entries){
            System.out.println(entry);
        }

        for (String stateName : stateMap.keySet()){
            System.out.println("State: "+stateName);
            List<String> cities = stateMap.get(stateName);
                    for(String city : cities){
                        System.out.println("City: "+city);
                    }

        }


    }
}
