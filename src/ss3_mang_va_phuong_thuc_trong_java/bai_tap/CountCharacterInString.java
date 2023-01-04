package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String str = "Hello cac ban, minh la hai ne!";
        char characters;
        characters = scanner.nextLine().charAt(0);
        System.out.println(characters);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == characters) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + characters +
                " trong chuỗi " + str + " = " + count);
    }
}

