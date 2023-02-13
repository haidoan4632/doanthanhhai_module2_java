package ss12_java_collection_framework.bai_tap.reponsitory;

import ss12_java_collection_framework.bai_tap.model.Product;

public interface IReponsitoryProduct {
    void findAll();

    Product findById(int id);

    void update(Product product);

    void add(Product product);

    void remove(int id);

    void searchProduct(String name);

    void sort();
}
