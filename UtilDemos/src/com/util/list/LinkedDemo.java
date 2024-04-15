package com.util.list;

import java.util.LinkedList;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Sspring");
        list.add("node");
        list.add("maven");
//        System.out.println(list);
        list.addFirst("Html");
        list.addLast("Css");
        list.set(1,"react");
//        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println();

        for(String s: list)
            System.out.println(s);
    }
}
