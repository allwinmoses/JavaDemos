package voya.oops.overloading;

public class Vehicle {
    String brand;
    double price;
    String model;

    public Vehicle() {
        System.out.println("default");
    }

    public Vehicle(String brand) {
        this();
        System.out.println("one");
        this.brand = brand;
    }

    public Vehicle(String brand, String model) {
        this(brand);
        System.out.println("two");
        this.brand = brand;

    }

    public Vehicle(String brand, double price, String model) {
        this(model,brand);
        System.out.println("three");
        this.brand = brand;
        this.price = price;

    }

    void getDetails(){
        System.out.println("brand "+brand);
        System.out.println("price "+price);
        System.out.println("model "+model);
    }
    void print(){
        if(model!=null)
            System.out.println("Model "+model);
        if(brand!=null)
            System.out.println("Brand "+brand);
        if(price>0)
            System.out.println("Price "+price);

    }
}

