package ss18_string_and_regex.bai_tap.validate_class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
    private static final String REGEX_VALIDATE_CLASS;

    static {
        REGEX_VALIDATE_CLASS = "^[CAP][0-9]{4}[a-zA-Z0-9]*[GHIKLM]$";
        // [a-zA-Z0-9] có nghĩa là không có các ký tự đặc biệt
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_VALIDATE_CLASS);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Myclass: ");
        String myClass;
        myClass = scanner.nextLine();
        Matcher matcher = pattern.matcher(myClass);
        System.out.println(matcher.matches());
    }
}
