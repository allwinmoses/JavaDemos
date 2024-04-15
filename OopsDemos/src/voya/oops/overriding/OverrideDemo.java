package voya.oops.overriding;

public class OverrideDemo {
    public static void main(String[] args) {
        Sports sports = new Indoor();
        String[] inGames = sports.showTypes();
        for(String game:inGames)
            System.out.println(game);

        sports = new Outdoor();
        String[] outGames = sports.showTypes();
        for(String game:outGames)
            System.out.println(game);
    }
}
