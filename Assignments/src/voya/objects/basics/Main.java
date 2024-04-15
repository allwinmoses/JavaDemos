package voya.objects.basics;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Java","John",700, "tech");
        Book book1 = new Book("Accounts", "paul", 400, "Accounts");

        book.getDetails();
        book.checkBook();

        book1.checkBook();

    }
}
