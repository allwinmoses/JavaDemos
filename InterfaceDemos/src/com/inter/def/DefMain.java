package com.inter.def;

public class DefMain {
    public static void main(String[] args) {
        IBonusCalculator bonusCalculator = new CalculatorImpl1();
        bonusCalculator.calculate(2000);
        bonusCalculator.policyType();

        IAllowanceCalculator allowance =(IAllowanceCalculator) bonusCalculator;
        allowance.calculate(1000);
        allowance.policyType();

        IBonusCalculator.show();

    }
}
