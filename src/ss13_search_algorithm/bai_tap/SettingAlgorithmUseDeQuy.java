package ss13_search_algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SettingAlgorithmUseDeQuy {
    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input arrays size");
        int sizeA = Integer.parseInt(scanner.nextLine());
        int[] arrays;
        arrays = new int[sizeA];
        for (int i = 0; i < sizeA; i++) {
            System.out.println("Input element [" + i + "] của mảng 1");
            arrays[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        System.out.println("Input element want search: ");
        int element = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(arrays, element));
        System.out.println(Arrays.binarySearch(arrays, element));
        //? dòng 38
    }
}
