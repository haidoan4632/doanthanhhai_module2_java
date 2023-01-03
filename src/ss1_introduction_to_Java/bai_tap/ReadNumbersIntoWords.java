package ss1_introduction_to_Java.bai_tap;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nhập số: ");
        short number = scanner.nextShort();
        String readNumberIntoWord = null;
        if (number<0||number>999){
System.out.println("out of ability");
        } else {
            if(number>=0&&number<10){
                switch (number){
                    case 0:
                        readNumberIntoWord = "Zero";
                        break;
                    case 1:
                         readNumberIntoWord = "One";
                        break;
                    case 2:
                         readNumberIntoWord ="Two";
                        break;
                    case 3:
                         readNumberIntoWord = "Three";
                        break;
                    case 4:
                       readNumberIntoWord ="Four";
                        break;
                    case 5:
                        readNumberIntoWord ="Five";
                        break;
                    case 6:
                       readNumberIntoWord = "Six";
                       break;
                    case 7:
                        readNumberIntoWord = "Seven";
                        break;
                    case 8:
                        readNumberIntoWord = "Eight";
                        break;
                    case 9:
                        readNumberIntoWord = "Nine";
                        break;
                }
                System.out.print(readNumberIntoWord);
            }
            else if(number>=10 && number <20){
switch (number){
    case 10:
        System.out.print("Ten");
        break;
    case 11:
        System.out.print("Elevent");
        break;
    case 12:
        System.out.print("Twelve");
        break;
    case 13:
        System.out.print("Thirteen");
        break;
    case 14:
        System.out.print("Fourteen");
        break;
    case 15:
        System.out.print("Fifteen");
        break;
    case 16:
        System.out.print("Sixteen");
        break;
    case 17:
        System.out.print("Seventeen");
        break;
    case 18:
        System.out.print("Eighteen");
        break;
    case 19:
        System.out.print("Nineteen");
        break;

}
            }
            else if(number>=20 && number<100){
                int a = number/10;
                int b = number%10;
                switch (a){
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Fourty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
                switch (b){
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
            }

else if(number>=100 && number<=999) {
                int a = number/100;
                int b = number%100;
                int d = b/10;
                int c = b % 10;
                switch (a){
                    case 1:
                        System.out.print("One hundred ");
                        break;
                    case 2:
                        System.out.print("Two hundred ");
                        break;
                    case 3:
                        System.out.print("Three hundred ");
                        break;
                    case 4:
                        System.out.print("Four hundred ");
                        break;
                    case 5:
                        System.out.print("Five hundred ");
                        break;
                    case 6:
                        System.out.print("Six hundred ");
                        break;
                    case 7:
                        System.out.print("Seven hundred ");
                        break;
                    case 8:
                        System.out.print("Eight hundred ");
                        break;
                    case 9:
                        System.out.print("Nine hundred ");
                        break;
                }
                switch (b){
                    case 0:
                        System.out.print("");
                        break;
                    case 11:
                        System.out.print("Elevent ");
                        break;
                    case 12:
                        System.out.print("Twelve ");
                        break;
                    case 13:
                        System.out.print("Thirteen ");
                        break;
                    case 14:
                        System.out.print("Fourteen ");
                        break;
                    case 15:
                        System.out.print("Fifteen ");
                        break;
                    case 16:
                        System.out.print("Sixteen ");
                        break;
                    case 17:
                        System.out.print("Seventeen ");
                        break;
                    case 18:
                        System.out.print("Eighteen ");
                        break;
                    case 19:
                        System.out.print("Nineteen ");
                        break;
                }
                if(b>=20) {
                    switch (d) {
                        case 2:
                            System.out.print("Twenty ");
                            break;
                        case 3:
                            System.out.print("Thirty ");
                            break;
                        case 4:
                            System.out.print("Fourty ");
                            break;
                        case 5:
                            System.out.print("Fifty ");
                            break;
                        case 6:
                            System.out.print("Sixty ");
                            break;
                        case 7:
                            System.out.print("Seventy ");
                            break;
                        case 8:
                            System.out.print("Eighty ");
                            break;
                        case 9:
                            System.out.print("Ninety ");
                            break;
                    }
                }
                if(b<10||b>20)
                        switch (c) {
                            case 1:
                                System.out.print("One");
                                break;
                            case 2:
                                System.out.print("Two");
                                break;
                            case 3:
                                System.out.print("Three");
                                break;
                            case 4:
                                System.out.print("Four");
                                break;
                            case 5:
                                System.out.print("Five");
                                break;
                            case 6:
                                System.out.print("Six");
                                break;
                            case 7:
                                System.out.print("Seven");
                                break;
                            case 8:
                                System.out.print("Eight");
                                break;
                            case 9:
                                System.out.print("Nine");
                                break;
                        }
                }
            }
        }
    }

