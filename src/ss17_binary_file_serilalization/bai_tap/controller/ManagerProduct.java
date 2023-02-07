package ss17_binary_file_serilalization.bai_tap.controller;

import ss17_binary_file_serilalization.bai_tap.model.Product;
import ss17_binary_file_serilalization.bai_tap.service.ServiceProduct;

import java.util.Scanner;

public class ManagerProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceProduct serviceProduct = new ServiceProduct();
        int menu = 0;
        do {
            System.out.println("1.list");
            System.out.println("2.add ");
            System.out.println("3.seach");
            System.out.println("4. exit");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    serviceProduct.list();
                    break;
                case 2:
                    System.out.print("Input ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input nameProduct: ");
                    String name = scanner.nextLine();
                    System.out.print("Input PlaceOfProduct: ");
                    String place = scanner.nextLine();
                    System.out.println("Input PriceOfProduct: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input ColorOfProduct: ");
                    String color = scanner.nextLine();
                    Product product = new Product(id, name, place, price, color);
                    serviceProduct.add(product);
                    break;
                case 3:
                    System.out.println("seach id:");
                    int seachId = Integer.parseInt(scanner.nextLine());
                    Product product1 = serviceProduct.findById(seachId);
                    if (product1 != null) {
                        serviceProduct.seach(product1);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        } while (true);

    }
}
