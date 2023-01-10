package ss7_abstract_class_and_interface.bai_tap.resizeable;

public class Rectangle extends Shape implements Resiable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Chu vi hình chữ nhật trước khi thay đổi: " + getPerimeter() + " Diện tích hình chữ nhật trước khi thay đổi: " + getArea()
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình chữ nhật sau khi random: " + getArea() * percent);
        System.out.println(" Chu vi hình chữ nhật sau khi random: " + getPerimeter() * percent);
    }
}
