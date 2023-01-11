package ss7_abstract_class_and_interface.bai_tap.resizeable;

import java.util.Arrays;

public class GeneralTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("tím", true, 10);
        shapes[1] = new Rectangle(2.5, 3.8, "orange", true);
        shapes[2] = new Square("blue", false, 8);

        double percent = Math.random() * 100;

        System.out.println("Before the change: ");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
        System.out.println(Arrays.toString(shapes));

        System.out.println("After the change: ");

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                Circle shapes0 = (Circle) shapes[i];
                shapes0.resize(percent);

            } else if (shapes[i] instanceof Rectangle) {
                Rectangle shapes0 = (Rectangle) shapes[i];
                shapes0.resize(percent);

            } else if (shapes[i] instanceof Square) {
                Square shapes0 = (Square) shapes[i];
                shapes0.resize(percent);

            }
        }
    }
}
