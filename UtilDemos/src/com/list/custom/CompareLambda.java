package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
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

        Collections.sort(vehicles, (o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));

    }


}
