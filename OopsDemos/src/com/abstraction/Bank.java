package com.abstraction;

import java.sql.SQLOutput;

public abstract class Bank {
    abstract void carLoan();
    abstract void housingLoan();
    abstract void eduLoan();

    void admin(){
        System.out.println("admin details in bank");
    }
}
