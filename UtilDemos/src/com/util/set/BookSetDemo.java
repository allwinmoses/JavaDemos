package com.util.set;

import com.list.custom.Book;

import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java","kathy",900),
                new Book("Java","kathy",900),
                new Book("python","sam",800),
                new Book("spring","paul",700),
                new Book("Jsp","Robin",900));

        System.out.println("List Book");
        for(Book book:books)
            System.out.println(book);
        System.out.println();
        System.out.println("set Books");
//        Set<Book> bookSet = new LinkedHashSet<>(books);
        Set<Book> bookSet = new TreeSet<>(books);
        for(Book book:bookSet){
            System.out.println(book);
        }
    }

}
