package ss7_abstract_class_and_interface.bai_tap.resizeable;

import java.util.Arrays;

public class GeneralTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        Circle circle = new Circle("tím", true, 10);
        System.out.println(circle.toString());
        circle.resize(Math.random() * 100);

        Rectangle rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle.toString());
        rectangle.resize(Math.random() * 100);

        Square square = new Square("blue", false, 8);
        System.out.println(square.toString());
        square.resize(Math.random() * 100);
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        System.out.println(Arrays.toString(shapes));
    }
}
