package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15, 16);

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer numbers : nums) {
            if (numbers % 2 == 0) {
                evenNumbers.add(numbers);
            }
        }

        for (Integer even : evenNumbers)
            System.out.println(even);
    }
}
