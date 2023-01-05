package ss4_class_and_object_in_java.bai_tap.quadracticequaition;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập c: ");
        double c = Double.parseDouble(scanner.nextLine());

        QuadracticEquation quadraticEquation = new QuadracticEquation(a, b, c);

        System.out.println("Delta = " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.print("nghiệm thứ 1 = " + quadraticEquation.getRoot1());
            System.out.print("nghiệm thứ 2 = " + quadraticEquation.getRoot2());

        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("phương trình có 2 nghiệm kép x1 = x2 = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
