package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int number;
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.print("Enter a number: ");
        number = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < array.length; j++) {
            if (number == array[j]) {
                array[j] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
