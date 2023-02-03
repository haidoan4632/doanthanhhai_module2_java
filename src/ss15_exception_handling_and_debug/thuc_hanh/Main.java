package ss15_exception_handling_and_debug.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n vui lòng nhập chỉ số của một phần tử bất kỳ");
        int x = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("\n Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("lỗi");
        }
    }
}
