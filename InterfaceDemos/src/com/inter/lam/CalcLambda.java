package com.inter.lam;

public class CalcLambda {
    public static void main(String[] args) {
        IMyCalculator iMyCalculator = (x,y)->{
          int sum =x+y;
          return x+y;
        };

        System.out.println(iMyCalculator.calculate(1,2));


        IMyCalculator iMyCalculator1 = (x,y)-> x*y;
        System.out.println(iMyCalculator1.calculate(12,3));
    }
}
