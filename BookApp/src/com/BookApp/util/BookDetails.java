package com.BookApp.util;

import com.BookApp.model.Book;

import java.util.Arrays;
import java.util.List;

public class BookDetails {
    public static List<Book> showBooks(){
        return Arrays.asList(
                new Book("Java ","Farhan","Tech",1,1000.0),
                new Book("Python ","Prabha","Tech",2,2000.0),
                new Book("club","Sam","Fun",3,700.0),
                new Book("Html","Sam","Tech",4,3000.0),
                new Book("Angular","John","Tech",5,900.0));

    }
}
