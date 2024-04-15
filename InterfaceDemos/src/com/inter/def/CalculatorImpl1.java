package com.inter.def;

public class CalculatorImpl1 implements IBonusCalculator, IAllowanceCalculator {
    @Override
    public void calculate(double amount) {
        System.out.println(amount*5);

    }

    @Override
    public void policyType() {
        System.out.println("policy type");

    }
}
