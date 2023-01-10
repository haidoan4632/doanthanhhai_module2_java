package ss7_abstract_class_and_interface.bai_tap.colorable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Square square = new Square(8);
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        System.out.println(Arrays.toString(shapes));
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                square.howToColor();
            }
        }
    }
}
