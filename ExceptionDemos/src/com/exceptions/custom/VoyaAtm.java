package com.exceptions.custom;

public class VoyaAtm {
    public static void main(String[] args) throws OutOfLimitsException, NegativeBalanceException {
        System.out.println(" in ATM");
        VoyaBank voyaBank = new VoyaBank(1000);
        voyaBank.withdraw(2000);

    }
}
