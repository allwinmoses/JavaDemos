package com.exceptions.custom;

public class VoyaBank {
    double balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws OutOfLimitsException ,NegativeBalanceException{
        System.out.println("in withdraw method");
        try {

            if (balance - amount <= 0)
                throw new NegativeBalanceException("balance is negative");
            if(amount>1000)
                throw new OutOfLimitsException("limit exceeded");
        } catch (NegativeBalanceException e)
        {
            System.out.println("exception "+e.getMessage());
        }
        System.out.println("GoodBye");
    }
}
