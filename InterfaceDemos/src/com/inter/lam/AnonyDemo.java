package com.inter.lam;

public class AnonyDemo {
    public static void main(String[] args) {
        IGreeter greeter = new IGreeterImpl();
        greeter.greetMessage("Wecome to Lambda");

        IGreeter greeter1 = new IGreeter(){

            @Override
            public void greetMessage(String message) {
                System.out.println("Hello");
            }
        };
        greeter1.greetMessage("Great day");
    }


}
