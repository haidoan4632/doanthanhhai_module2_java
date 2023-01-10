package ss7_abstract_class_and_interface.bai_tap.colorable;

public class Square extends Shape implements Colorable {
    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return this.edge * this.edge;
    }

    public double getPerimeter() {
        return 4 * this.edge;
    }

    @Override
    public String toString() {
        return "Diện tích hình vuông: " + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
