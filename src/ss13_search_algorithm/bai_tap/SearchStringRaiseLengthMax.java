package ss13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchStringRaiseLengthMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string");
        String string = input.nextLine();
        LinkedList<Character> list1 = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > list1.size()) {
                list1.clear();
                list1.addAll(list);
            }
            list.clear();
        }
        for (Character ch : list1) {
            System.out.print(ch);
        }
        System.out.println();
    }

}




