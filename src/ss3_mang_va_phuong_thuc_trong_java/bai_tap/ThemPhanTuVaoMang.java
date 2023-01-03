package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size;
        int array[];
        int number;
        int index;
        int j;
        Scanner scanner = new Scanner(System.in);
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter number: ");
        number = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter index: ");
        index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index >= array.length) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {

            for (j = array.length - 1; j > index; j--) {
                array[j] = array[j - 1];
            }
            array[index] = number;
        }
        System.out.println(Arrays.toString(array));
    }
}
