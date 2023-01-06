package ss5_access_modifier_static_method_static_property.bai_tap.circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius : " + circle.getRadius());
        System.out.println("Area : " + circle.getArea());
    }
}
