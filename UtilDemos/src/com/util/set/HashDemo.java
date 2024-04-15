package com.util.set;

import java.util.*;

public class HashDemo {
    public static void main(String[] args) {
//        Set<String> hashSet = new HashSet<>();
//      Set<String> hashSet = new TreeSet<>();
        Set<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Apple");
        hashSet.add("pineapple");
        hashSet.add("Orange");
        hashSet.add("kiwi");
        hashSet.add("100");
        hashSet.add(null);
        hashSet.add("Apple");
//        System.out.println(hashSet);
        System.out.println(hashSet);
        for(String element : hashSet){
            System.out.println(element);
        }

        List<String> fruits = Arrays.asList("apple","orange","apple");
        Set<String>  newfruits = new HashSet<>(fruits);
        System.out.println(newfruits);

    }

}
