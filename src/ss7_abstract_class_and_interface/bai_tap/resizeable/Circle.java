package ss7_abstract_class_and_interface.bai_tap.resizeable;

public class Circle extends Shape implements Resiable {
    private double radius = 1;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Chu vi hình tròn trước khi thay đổi: " + getPerimeter() + " Diện tích hình tròn trước khi thay đổi: " + getArea()
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình tròn sau khi random: " + getArea() * percent);
        System.out.println(" Chu vi hình tròn sau khi random: " + getPerimeter() * percent);
    }
}
