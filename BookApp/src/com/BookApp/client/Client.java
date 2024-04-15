//package com.BookApp.client;
//
//import com.BookApp.exceptions.BookNotFoundException;
//import com.BookApp.model.Book;
//import com.BookApp.service.BookServiceImpl;
//import com.BookApp.service.IBookService;
//import com.BookApp.util.BookDetails;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Client {
//    public static void main(String[] args)  {
//        Scanner scanner = new Scanner(System.in);
////        String name = scanner.next();
//        List<Book> books = BookDetails.showBooks();
//
//        IBookService bookService = new BookServiceImpl();
////        List<Book> bookByCategory = bookService.getByCategory("tech");
//
//
//        System.out.println("Enter category: ");
//        String category = scanner.nextLine();
//
//        try {
//            List<Book> bookByCategory = bookService.getByCategory(category);
//            for (Book book : bookByCategory) {
//                System.out.println(book);
//            }
//        }catch (BookNotFoundException e){
//            System.out.println("book not found");
//        }
//
//        System.out.println("Enter Author: ");
//        String author = scanner.nextLine();
//
//        try {
//            List<Book> bookByAuthor = bookService.getByCategory(category);
//            for (Book book : bookByAuthor) {
//                System.out.println(book);
//            }
//        }catch (BookNotFoundException e){
//            System.out.println("book not found");
//        }
//
//          System.out.println("Enter price: ");
//          String price = scanner.nextLine();
//
//        try {
//            List<Book> bookByPrice = bookService.getByPriceLessThan(Double.parseDouble(price));
//            for (Book book : bookByPrice) {
//                System.out.println(book);
//            }
//        }catch (BookNotFoundException e){
//            System.out.println("book not found");
//        }
//        System.out.println("Enter Id: ");
//        int bookID = scanner.nextInt();
////
////        try {
////           List<Book> bookById = bookService.getById(bookID);
////            for (Book book : bookById) {
////                System.out.println(book);
////            }
////        }catch (BookNotFoundException e){
////            System.out.println("book Id not found");
////        }
//    }
//}
