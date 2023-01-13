package ss11_dsa_cstack_queueu.bai_tap.decimal;

import java.util.Scanner;
import java.util.Stack;

public class Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> decimal = new Stack<>();
        Stack<Integer> decimal1 = new Stack<>();
        System.out.println("Nhập số cần chuyển đổi từ hệ thập phân sang nhị phân");
        int number = Integer.parseInt(scanner.nextLine());
        int sodu;
        if (number < 0) {
            System.out.println("Không chuyển đổi được");
        } else if (number == 0) {
            System.out.println("0");
        } else {
            while (number > 0) {
                sodu = number % 2;
                decimal.push(sodu);
                number = number / 2;
            }
            while (!decimal.empty()) {
                decimal1.push(decimal.pop());
            }
            for (int i = 0; i < decimal1.size(); i++) {
                decimal.push(decimal1.get(i));
            }
//        System.out.print(decimal);
            String a = null;
            for (int i = 0; i < decimal.size(); i++) {
                a = String.valueOf(decimal.get(i));
                System.out.print(a);
            }
        }
    }
}

