package ss6_inheritance.bai_tap.bai3;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point.getX() + " " + point.getY());
        System.out.println("Change x and y");
        point.setXY(3, 4);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point.toString());
    }
}
