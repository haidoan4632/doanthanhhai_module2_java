package ss4_class_and_object_in_java.bai_tap.stopwatch;

import java.util.Arrays;
import java.util.Scanner;

public class MainStopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        System.out.print("Nhập độ dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ [" + i + "] ");
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

        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

    }
}
