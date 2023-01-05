package ss4_class_and_object_in_java.bai_tap.quadracticequaition;

public class QuadracticEquation {
    private double a, b, c;

    public QuadracticEquation() {
    }

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(getB() * getB() - 4 * getA() * getC())) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(getB() * getB() - 4 * getA() * getC())) / (2 * getA());
    }
}
