package com.threads.basics;

class Child extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println(i+"x"+i +" = "+(i*5));
        } try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

     Child (String name,int priority){
         System.out.println(this);
//         this.start();

    }

}



public class ExThread {
    public static void main(String[] args) {
//        Child child1 = new Child("child-one",10);
        Child child2 = new Child("child-two",6);
        child2.setDaemon(true);
        child2.start();



        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println(i+"x"+i +" = "+(i*5));
        }try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
//        try{
//            child1.join();
//            child2.join();
//        } catch (InterruptedException e){
//            e.printStackTrace();
        }
    }



