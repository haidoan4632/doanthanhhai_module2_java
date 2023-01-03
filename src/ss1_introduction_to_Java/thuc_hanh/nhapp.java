package ss1_introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class nhapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nhập số: ");
        short number = scanner.nextShort();
        System.out.print(number);
        int a = number %2 ;
        int b = number % 2;
        System.out.println(a);
        System.out.println(b);
    }
}
