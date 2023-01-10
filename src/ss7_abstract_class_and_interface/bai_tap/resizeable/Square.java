package ss7_abstract_class_and_interface.bai_tap.resizeable;

public class Square extends Shape implements Resiable {
    private double edge = 1;

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
        return edge * edge;
    }

    public double getPerimeter() {
        return 4 * edge;
    }

    @Override
    public String toString() {
        return "Chu vi hình vuông trước khi thay đổi: " + getPerimeter() + " Diện tích hình vuông trước khi thay đổi: " + getArea()
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình vuông sau khi random: " + getArea() * percent);
        System.out.println(" Chu vi hình vuông sau khi random: " + getPerimeter() * percent);
    }
}
