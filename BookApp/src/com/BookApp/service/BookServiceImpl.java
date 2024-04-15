package com.BookApp.service;

import com.BookApp.exceptions.BookNotFoundException;
import com.BookApp.exceptions.IdNotFoundException;
import com.BookApp.model.Book;
import com.BookApp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService {

    @Override
    public List<Book> getAll() {
        List<Book> books = BookDetails.showBooks();
        return books;
    }


    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks();
        List<Book> bookByAuthor = new ArrayList<>();

        for(Book book : books){
            if(book.getAuthor().startsWith(author)){
                bookByAuthor.add(book);
            }

        }
        if(bookByAuthor.isEmpty()){
            throw new BookNotFoundException();
        }
        return bookByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks();
        List<Book> bookByCategory = new ArrayList<>();
        for(Book book : books){
            if(book.getCategory().startsWith(category)){
                bookByCategory.add(book);
            }

        }
        if(bookByCategory.isEmpty()){
            throw new BookNotFoundException();
        }

        return bookByCategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks();
        Double priceValue = Double.parseDouble(String.valueOf(price));
        List<Book> bookByPrice = new ArrayList<>();
        for(Book book : books){
            if(book.getPrice() < priceValue){
                bookByPrice.add(book);
            }

        }
        if(bookByPrice.isEmpty()){
            throw new BookNotFoundException();
        }

        return bookByPrice;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        return null;

    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List<Book> books = BookDetails.showBooks();
        List<Book> bookById = new ArrayList<>();
        for(Book book:books){
            if(book.getBookId() == bookId){
                bookById.add(book);
            }
            return  book;
        }
        throw new IdNotFoundException("id not found");
    }
}
