package com.inter.extend;

public class ScientificCal extends BasicCalculator implements IScientific{
    @Override
    public void square(int x) {
        System.out.println(Math.pow(10,12));

    }

    @Override
    public void cube(int x) {
        System.out.println(Math.pow(10,12));

    }
}

