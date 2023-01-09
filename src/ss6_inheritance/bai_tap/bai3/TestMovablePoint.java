package ss6_inheritance.bai_tap.bai3;

import java.util.Arrays;

public class TestMovablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1, 2);
        System.out.println("Change XSpeed and YSpeed");
        moveablePoint.setSpeed(3, 4);
        moveablePoint.move();
        System.out.println(Arrays.toString(moveablePoint.move()));
        System.out.println(moveablePoint.toString());
    }
}
