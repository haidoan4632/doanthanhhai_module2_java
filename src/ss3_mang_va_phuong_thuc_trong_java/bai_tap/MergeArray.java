package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeA = Integer.parseInt(scanner.nextLine());
        int sizeB = Integer.parseInt(scanner.nextLine());
        int a[];
        int b[];
        a = new int[sizeA];
        b = new int[sizeB];
        for (int i = 0; i < sizeA; i++) {
            System.out.println("Nhập phần tử thứ [" + i + "] của mảng 1");
            a[i] = Integer.parseInt(scanner.nextLine());

        }
        for (int i = 0; i < sizeB; i++) {
            System.out.println("Nhập phần tử thứ [" + i + "] của mảng 2");
            b[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];

        }
        for (int i = 0; i < b.length; i++) {
            c[(a.length) + i] = b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
