package ss12_java_collection_framework.bai_tap.reponsitory;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductResponsitory implements IReponsitoryProduct {

    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Máy bay", 10));
        productList.add(new Product(2, "Xe tăng", 2));
        productList.add(new Product(3, "Tên lửa", 1));
        productList.add(new Product(4, "Chiến hạm", 100));
    }

    @Override
    public void findAll() {
        for (Product product : productList
        ) {
            System.out.println(product.toString());

        }
    }

    @Override
    public Product fixById(int id) {
        for (Product i : productList
        ) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (product.getId() == productList.get(i).getId()) {
                productList.set(i, product);
                break;
            }
        }
    }

    @Override
    public void add(Product product) {
        productList.add(product);

    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public void searchProduct(String name) {
        for (Product product : productList) {
            if (product.getNameProduct().contains(name)) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(productList);
        Collections.reverse(Collections.singletonList(productList));
    }
}
