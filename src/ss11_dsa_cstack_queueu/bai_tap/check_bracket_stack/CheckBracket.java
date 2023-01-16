package ss11_dsa_cstack_queueu.bai_tap.check_bracket_stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static boolean Bracket(String bracket) {
        Stack<String> bStack = new Stack<>();
        String[] stringArray = bracket.split("");
        for (String s : stringArray) {
            if (s.equals("(")) {
                bStack.push(s);
            } else if (s.equals(")")) {
                if (bStack.isEmpty()) {
                    return false;
                } else bStack.pop();
            }
        }
        return bStack.empty();
    }

    public static void main(String[] args) {
        System.out.println("Nhập biểu thức toán học cần check");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Bracket(inputString);
        if (Bracket(inputString)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}





