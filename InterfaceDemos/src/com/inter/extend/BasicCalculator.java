package com.inter.extend;

import com.inter.extend.ICalculator;

public class BasicCalculator implements ICalculator {
    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }

    @Override
    public void sub(int x, int y) {
        System.out.println(x+y);

    }
}
