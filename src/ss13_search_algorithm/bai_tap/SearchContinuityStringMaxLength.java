package ss13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchContinuityStringMaxLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> list1 = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Input string: ");
        String string = scanner.nextLine();


        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > list1.size()) {
                list1.clear();
                list1.addAll(list);
            }
        }
        for (Character ch : list1) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
