package ss13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchStringRaiseLengthMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }

}




