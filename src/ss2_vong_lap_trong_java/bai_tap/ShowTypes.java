package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {

        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Hiển thị các loại hình: ");
            System.out.println("1. Print the rectangle  ");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) ");
            System.out.println("3. Print isosceles triangle ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle  ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) ");
                    System.out.println("botton-left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

                    System.out.println("top-left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5 - i; j > 0; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

                    System.out.println("botton-right");
                    for (int i = 1; i <= 5; i++) {
                        int j;
                        for (j = 5; i <= j; j--) {
                            System.out.print(" ");
                        }
                        for (j = 1; j <= i; j++) {

                            System.out.print('*');
                        }
                        System.out.println("");
                    }

                    System.out.println("top-right");
                    for (int i = 1; i <= 5; i++) {
                        int j;
                        for (j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (j = 5; j >= i; j--) {

                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("3. Print isosceles triangle ");
                    for (int i = 1; i <= 7; i++) {
                        int j;
                        for (j = 7; i <= j; j--) {
                            System.out.print(" ");
                        }
                        for (j = 1; j <= (2 * i - 1); j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }
    }
}