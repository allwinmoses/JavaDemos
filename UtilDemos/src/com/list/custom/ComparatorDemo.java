package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles =
                Arrays.asList(
                        new Vehicle("City", "Honda",23_90_000),
                                new Vehicle("bmw", "b1",23_90_000),
                                        new Vehicle("City","Honda",23_90_000),
                                        new Vehicle("City", "Honda",23_90_000));

        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle);
    }
        System.out.println("Sort by brand");

        Collections.sort(vehicles,new BrandSort());
        for(Vehicle vehicle:vehicles)
            System.out.println(vehicle);

        System.out.println("Sort by brand");

        Collections.sort(vehicles,new ModelSort());
        for(Vehicle vehicle:vehicles)
            System.out.println(vehicle);


//        Collections.sort()

    }

}
