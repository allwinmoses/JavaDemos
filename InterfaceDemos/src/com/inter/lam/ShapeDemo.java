package com.inter.lam;

public class ShapeDemo {
    public static void main(String[] args) {
        IShape shape = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println(x+y);
            }
        };
        shape.area(10,12);
    }
}
