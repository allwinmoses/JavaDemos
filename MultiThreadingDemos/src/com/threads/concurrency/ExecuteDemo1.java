package com.threads.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(()->{
            System.out.println("Doing polling");
            Greetings greet = new Greetings();
            greet.message("Priya", 20);
        });

        executorService.execute(()->{
            System.out.println("Name is");
            Greetings greet = new Greetings();
            greet.message("Sam",10);
        });


    }
}
