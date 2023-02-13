package ss15_exception_handling_and_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("Input b: ");
        float b = Float.parseFloat(scanner.nextLine());
        System.out.println("Input c: ");
        float c = Float.parseFloat(scanner.nextLine());
        check(a, b, c);
    }

    private static void check(float a, float b, float c) {
        try {
            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                System.out.println("Đây là 3 cạnh của một tam giác ");
            } else {
                throw new IllefalTriangleException("Lỗi");
            }
        } catch (IllefalTriangleException e) {
            System.out.println("Đây không phải là 3 cạnh của một tam giác");
        } finally {
            System.out.println("Chương trình hoàn tất");
        }
    }
}
