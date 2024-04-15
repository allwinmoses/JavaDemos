package com.list.custom;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java","Mark",800),
                new Book("Python", " John",700),
                new Book("Life", "Bible", 500),
                new Book("Spring", "Sam",400));
        System.out.println("Before sorting");
        for(Book nbook:books){
            System.out.println(nbook);
        }

        System.out.println("After Sorting");
        Collections.sort(books);
        for(Book nbook: books)
            System.out.println(nbook);
    }


}
