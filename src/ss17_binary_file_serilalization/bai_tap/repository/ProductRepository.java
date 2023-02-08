package ss17_binary_file_serilalization.bai_tap.repository;

import ss17_binary_file_serilalization.bai_tap.model.Product;
import ss17_binary_file_serilalization.thuc_hanh.demo.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private static final String FILE_PATH = "E:\\doanthanhhai_module2_java\\src\\ss17_binary_file_serilalization\\bai_tap\\product.dat";

    public static void writeObjectList(List<Product> productList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(productList);
        oos.close();
    }

    public static List<Product> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Product> productList1 = (List<Product>) ois.readObject();
        return productList1;
    }

    Student student = new Student();
    static List<Product> productList = new ArrayList<>();


    static {
        Product product = new Product(1, "a", "new1", 7.0, "blue");
        Product product1 = new Product(2, "a", "new2", 6.0, "blue");
        Product product2 = new Product(3, "a", "new3", 5.0, "blue");
        Product product3 = new Product(4, "a", "new4", 4.0, "blue");
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        try {
            writeObjectList(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void add(Product product) {
        productList.add(product);

    }


    @Override
    public Product findById(int id) {

        for (Product product : productList) {
            if (product.getIdProduct() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void seach(Product product) {

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getIdProduct() == product.getIdProduct()) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void list() {
        for (Product product : productList) {
            System.out.println(product);
        }
        try {
            productList = readObjectList();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
