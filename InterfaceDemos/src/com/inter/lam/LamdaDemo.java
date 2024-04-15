package com.inter.lam;

public class LamdaDemo {
    public static void main(String[] args) {
        IGreeter greet = (String message)->{
            System.out.println(message);
        };
        greet.greetMessage("Great Day");

        greet = message -> System.out.println(message+"!!!!");
        greet.greetMessage("Wow");
    }
}
