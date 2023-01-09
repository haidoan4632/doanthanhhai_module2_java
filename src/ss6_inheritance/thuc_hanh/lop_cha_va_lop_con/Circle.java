package ss6_inheritance.thuc_hanh.lop_cha_va_lop_con;

public class Circle extends Geometric{
//    mở rộng trường dữ liệu của lớp cha
    private double radius;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, String filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return getRadius()*2 * Math.PI;
    }
    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
    }
    public double getDiameter(){
        return getRadius()*2;
    }
    public void printCircle(){
        System.out.println("The "+getColor() +"circle is created with the radius is"+radius);
    }
}
