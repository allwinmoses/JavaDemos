package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape shape = new Rectangle();
        shapeFactory.printArea(shape, 10, 20);

        shapeFactory.printArea((int x, int y)->{
            System.out.println("Calculating sq Area");
        },10,20);

    };



}
