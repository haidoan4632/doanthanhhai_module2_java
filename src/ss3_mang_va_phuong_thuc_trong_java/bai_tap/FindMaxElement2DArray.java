package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElement2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double array2D[][];
        array2D = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "] của mảng: ");
                array2D[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array2D));
        double max = array2D[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if( array2D[i][j] > max){
                    max = array2D[i][j];

               }
            }
        }
        System.out.println(" Giá trị lớn nhất trong mảng"+ max);

    }
}
