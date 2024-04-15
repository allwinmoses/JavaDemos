package voya.object.overriding;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu =new Chinese();
        menu.showItems("Breakfast");

        Chinese chinese = (Chinese)menu;
        chinese.printGames();

        menu = new Indian();
        menu.showItems("lunch");



    }


}

