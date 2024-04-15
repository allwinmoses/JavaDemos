package com.inter.basics;

public class Car extends Vehicle implements IAccessroies{
    String type;
    void show(){
        if(type.equals("set")){
            System.out.println("laxuary car");
        }
    }
    @Override
    public void insuranceDetails() {
        super.insuranceDetails();
    }

    @Override
    void getDetails() {
        super.getDetails();
    }

    @Override
    void getMileage() {

    }
}

