import Greetings.Greetings;

public class RunThread {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        Runner runner = new Runner("Ram",greetings);
        Runner runner1 = new Runner("Tom", greetings);
        Runner runner2 = new Runner("sam", greetings);
        Runner runner3 = new Runner("john", greetings);

        runner.run();
        runner1.run();
        runner2.run();
        runner3.run();





    }

}
