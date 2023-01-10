package ss7_abstract_class_and_interface.bai_tap;

import ss7_abstract_class_and_interface.bai_tap.resizeable.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
