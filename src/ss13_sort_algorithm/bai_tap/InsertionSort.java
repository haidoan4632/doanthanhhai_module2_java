package ss13_sort_algorithm.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        final int[] arr = { 3,5,2,11,0};
        System.out.println("Arrays before: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int a = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > a) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = a;

            System.out.println("Arrays sau lần chèn thứ " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Arrays after sorting : " + Arrays.toString(arr));
    }
}
