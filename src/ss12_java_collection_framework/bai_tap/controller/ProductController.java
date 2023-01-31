package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.service.IServiceProduct;
import ss12_java_collection_framework.bai_tap.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static final IServiceProduct service = new ProductService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("Product Manager");
            System.out.println("1.List");
            System.out.println("2.FixById");
            System.out.println("3.add");
            System.out.println("4.remove");
            System.out.println("5.searchProduct");
            System.out.println("6.sortReponsitory");
            System.out.println("7.exit");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    service.findAll();
                    break;
                case 2:
                    System.out.println("Input Id: ");
                    int id2 = Integer.parseInt(scanner.nextLine());

                    Product c = service.fixById(id2);

                    if (c != null) {

                        System.out.println("Input Name: ");
                        String name = scanner.nextLine();
                        System.out.println("Input Price: ");
                        int price = Integer.parseInt(scanner.nextLine());

                        c.setNameProduct(name);
                        c.setMoney(price);
                        service.update(c);

                    } else {
                        System.out.println("Not exited");
                    }
                    break;
                case 3:
                    System.out.print("Input Name: ");
                    String nameProduct = scanner.nextLine();
                    System.out.print("Input ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input Price: ");
                    int money = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(id, nameProduct, money);
                    service.add(product);
                    break;
                case 4:
                    System.out.print("Input ID: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    service.remove(id1);
                    break;

                case 5:
                    System.out.println("Input Name: ");
                    String name5 = scanner.nextLine();
                    service.searchProduct(name5);
                    break;
                case 6:
                    service.sort();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input again");
            }
        }
        while (true);

    }
}

