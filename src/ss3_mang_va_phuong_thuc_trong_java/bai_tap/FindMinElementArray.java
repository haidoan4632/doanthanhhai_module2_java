package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ [" + i + "]");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Giá trị min: " + min);
    }
}
