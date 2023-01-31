package ss11_dsa_cstack_queueu.bai_tap.count_element_in_string_map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWords {
    public static void main(String[] args) {
        String words;
        String[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input words ");
        words = scanner.nextLine();

        array = words.toLowerCase().split("");
        System.out.println(Arrays.toString(array));
        Map<String, Integer> myMap = new TreeMap<>();
        for (String s : array) {
            if (myMap.containsKey(s)) {
                myMap.put(s, myMap.get(s) + 1);
            } else {
                myMap.put(s, 1);
            }
        }
        System.out.println(myMap);
    }
}
