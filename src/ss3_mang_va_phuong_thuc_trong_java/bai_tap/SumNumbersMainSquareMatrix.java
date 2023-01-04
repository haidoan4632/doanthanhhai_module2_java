package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbersMainSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        double array2D[][];
        double sum = 0;
        array2D = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "] của mảng: ");
                array2D[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array2D));
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                if (i == k) {
                    sum = sum + array2D[i][k];
                }
            }
        }
        System.out.println("Tổng các số ở đường chéo chính của ma trận vuông: "+ sum+ " ");
    }
}
