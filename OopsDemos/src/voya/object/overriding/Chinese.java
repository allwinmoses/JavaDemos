package voya.object.overriding;

public class Chinese extends Menu {
    @Override
    void showItems(String type) {
        super.showItems(type);


        }
    void printGames(){
        System.out.println("board games available");

//        if(type.equals("Starters")){
//            System.out.println("Grill");
//        } else if(type.equals("Lunch")){
//            System.out.println("Biryani");
//        }else{
//            System.out.println("Ice cream");
//        }

    }

}
