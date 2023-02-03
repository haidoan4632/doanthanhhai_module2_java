package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;

public class SettingAlgorithmInsertionSort {
    static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > currentElement) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 15, 15, 15, 166, 15, 5, 1556, 6, 66, 61,};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
