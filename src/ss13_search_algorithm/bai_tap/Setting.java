package ss13_search_algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Setting {
    static int[] array = new int[5];

    static int binarySearch(int[] array, int left, int right, int value) {
        while (right > left) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (value > array[mid]) {
                left = mid + 1;
            } else if (value < array[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Nhập số cần tìm vào: ");
        int num = Integer.parseInt(scanner.nextLine());
        Arrays.sort(array);

        int index = binarySearch(array, 0, array.length, num);

        if (index != -1) {
            System.out.println("phần tử nằm vị trí là: " + index);
        } else {
            System.out.println("Không tìm thấy phần tử trong mảng");
        }

    }
}
