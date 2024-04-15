package com.BookApp.service;

import com.BookApp.exceptions.BookNotFoundException;
import com.BookApp.exceptions.IdNotFoundException;
import com.BookApp.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAll();
    List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException;
    List<Book> getByCategory(String category) throws BookNotFoundException;
    List<Book> getByPriceLessThan(double price) throws  BookNotFoundException;
    List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;
    Book getById(int bookId) throws IdNotFoundException;


}
