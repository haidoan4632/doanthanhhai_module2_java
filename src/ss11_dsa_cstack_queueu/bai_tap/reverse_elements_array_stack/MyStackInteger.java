package ss11_dsa_cstack_queueu.bai_tap.reverse_elements_array_stack;

import java.util.Scanner;
import java.util.Stack;

public class MyStackInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đưa phần tử vào mảng");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("before stack");
        System.out.println(stack);
        System.out.println("after stack");
        while (!stack.empty()) {
            stack1.push(stack.pop());
        }
        for (int i = 0; i < n; i++) {
            stack.push(stack1.get(i));
        }
        System.out.println(stack);
    }
}

