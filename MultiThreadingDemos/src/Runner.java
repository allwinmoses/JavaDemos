import Greetings.Greetings;

import java.util.concurrent.SynchronousQueue;

public class Runner implements Runnable {

    String name;
    Greetings greetings;

    public Runner(String name, Greetings greetings) {
        Thread t = new Thread();
        this.name = name;
        this.greetings = greetings;
        t.start();
    }

    @Override
    public void run() {
        synchronized(greetings){
            System.out.println(greetings.sayHello(name));
            System.out.println("done");
        }


    }
}
