package com.list.custom;

import java.util.Comparator;

public class PriceSort implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
