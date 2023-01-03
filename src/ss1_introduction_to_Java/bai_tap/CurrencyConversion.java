package ss1_introduction_to_Java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền cần chuyển đổi:");
        usd = Double.parseDouble(scanner.nextLine());
        double rate = usd * 23000;
        System.out.println("Giá trị VNĐ: " + rate);
    }
}
