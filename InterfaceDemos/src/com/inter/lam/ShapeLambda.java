package com.inter.lam;

public class ShapeLambda {
    public static void main(String[] args) {
        IShape iShape = (x,y)-> System.out.println("Rect "+(x*y));
        iShape.area(10,20);

        IShape iShape1 =(x,y)-> System.out.println(x+y);
        iShape1.area(2,4);
    }

}
