package ss7_abstract_class_and_interface.bai_tap.resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("red", false, 10);
        System.out.println(circle);
    }
}
