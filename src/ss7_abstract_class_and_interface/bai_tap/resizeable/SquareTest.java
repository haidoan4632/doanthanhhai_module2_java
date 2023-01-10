package ss7_abstract_class_and_interface.bai_tap.resizeable;

public class SquareTest {
    public static void main(String[] args) {

        Square square = new Square();
        System.out.println(square);

        square = new Square(4);
        System.out.println(square);

        square = new Square("blue", false, 8);
        System.out.println(square);
    }
}
