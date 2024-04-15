package com.inter.lam;

public class MenuLambda {
    public static void main(String[] args) {

        IMenu iMenu = () -> System.out.println(" Chineses : Noodles");
        IMenu iMenu1 = () -> System.out.println(" Indian : Idly, Biryani");
        IMenu iMenu2 = () -> System.out.println("Italian : Fries, Salad");

        iMenu.showMenus();
        iMenu1.showMenus();
        iMenu2.showMenus();
    }
}