package voya.objects.basics;

public class Book {

    String title ;
    String author;
    int price;
    String category;

    public Book(String title, String author, int price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    void getDetails(){
        System.out.println("Title "+title);
        System.out.println("Author "+author);
        System.out.println("Price "+price);
        System.out.println("Category "+category);
    }

    void checkBook(){
        if(price>500){
            System.out.println(title+ " Premium books");

        }else{
            System.out.println(title+ " standard books");
        }
    }

}
