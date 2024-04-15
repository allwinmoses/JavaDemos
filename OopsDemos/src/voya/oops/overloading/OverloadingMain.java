package voya.oops.overloading;

public class OverloadingMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calcArea(10);
        shape.calcArea(2.0);
        int rect = shape.calcArea(10,20);
        System.out.println("Rect "+rect);
        double tri = shape.calcArea(12.0,4);
        System.out.println("tri "+tri);
    }
}
