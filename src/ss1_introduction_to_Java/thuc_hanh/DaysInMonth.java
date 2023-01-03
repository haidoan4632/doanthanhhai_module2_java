package ss1_introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count days?");
        int month = scanner.nextInt();
        String daysInMonth = null;
        switch (month){
            case 2:
                daysInMonth = "28 or 29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31 ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30 ngày";
        }
        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
    }
}
