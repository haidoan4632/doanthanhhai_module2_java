package ss1_introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        //nhập chiều rộng
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        //nhập chiều dài
        float area = width * height;
        System.out.println("Area is: "+ area);
    }
}
