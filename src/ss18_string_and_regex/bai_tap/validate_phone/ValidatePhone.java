package ss18_string_and_regex.bai_tap.validate_phone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String REGEX_VALIDATE_PHONE;

    static {
        REGEX_VALIDATE_PHONE = "^[0-9]{2}[0][0-9]{9}$";
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_VALIDATE_PHONE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Myphone: ");
        String myPhone;
        myPhone = scanner.nextLine();
        Matcher matcher = pattern.matcher(myPhone);
        System.out.println(matcher.matches());
    }
}
