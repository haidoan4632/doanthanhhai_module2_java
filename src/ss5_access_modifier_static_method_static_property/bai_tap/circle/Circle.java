package ss5_access_modifier_static_method_static_property.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }
}
