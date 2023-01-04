package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbersColums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double array2D[][];
        int column;
        double sum = 0;
        array2D = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]của mảng: ");
                array2D[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array2D));
        System.out.println("Bạn muốn tính tổng cột mấy: ");

        column = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 4; k++) {
                if (i == column){
                    sum = sum + array2D[column][k];

                }
            }
        }
        System.out.println("Tổng của cột cần tính là: " + sum);
    }
}

