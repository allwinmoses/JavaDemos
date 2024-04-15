package com.oops.beam;

public class BeamMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Honda");
        vehicle.setModel("v3");
        vehicle.setPrice(1234);
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle);
    }
}
