package ss11_dsa_cstack_queueu.bai_tap.check_palindrome_string_using_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalindromeStringUsingQueue {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần check");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        inputString = inputString.toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.offer(inputString.charAt(i));
        }
        System.out.println(queue);
        StringBuilder reverseString = new StringBuilder();
        while (!queue.isEmpty()) {
            reverseString.append(queue.poll());
        }
        System.out.println(reverseString);
        if (inputString.equals(reverseString.toString())) {
            System.out.println("Đây là chuỗi đối xứng.");
        } else {
            System.out.println("Đây không phải là chuỗi đối xứng.");
        }
    }
}

