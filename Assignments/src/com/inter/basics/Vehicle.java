package com.inter.basics;

import com.inter.basics.IInsurance;

public abstract class Vehicle implements IInsurance {
    String brand;
    String model;
    double price;

    @Override
    public void insuranceDetails() {
        System.out.println("Insurance claimed");
    }

    void getDetails(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
        
    }
    abstract void getMileage();
}
