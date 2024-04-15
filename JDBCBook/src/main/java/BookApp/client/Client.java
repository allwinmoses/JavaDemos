package BookApp.client;



import BookApp.exceptions.BookNotFoundException;
import BookApp.model.Book;
import BookApp.service.BookServiceImpl;
import BookApp.service.IBookService;
import BookApp.util.BookDetails;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws BookNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        List<Book> books = BookDetails.showBooks();

        IBookService bookService = new BookServiceImpl(books);
        List<Book> bookByCategory = bookService.getByCategory("tech");


        System.out.println("Enter category: ");
        String category = scanner.nextLine();

        try {
            bookByCategory = bookService.getByCategory(category);
            for (Book book : bookByCategory) {
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            System.out.println("book not found");
        }

        System.out.println("Enter Author: ");
        String author = scanner.nextLine();

        try {
            List<Book> bookByAuthor = bookService.getByCategory(category);
            for (Book book : bookByAuthor) {
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            System.out.println("book not found");
        }

          System.out.println("Enter price: ");
          String price = scanner.nextLine();

        try {
            List<Book> bookByPrice = bookService.getByPriceLessThan(Double.parseDouble(price));
            for (Book book : bookByPrice) {
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            System.out.println("book not found");
        }
        System.out.println("Enter Id: ");
        int bookID = scanner.nextInt();

        try {
            List<Book> bookById = bookService.getByPriceLessThan(bookID);
            for (Book book : bookById) {
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            System.out.println("book Id not found");
        }
    }
}
