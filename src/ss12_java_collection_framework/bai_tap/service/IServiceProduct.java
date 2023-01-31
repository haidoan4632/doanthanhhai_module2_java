package ss12_java_collection_framework.bai_tap.service;

import ss12_java_collection_framework.bai_tap.model.Product;

public interface IServiceProduct {
    void findAll();

    Product fixById(int id);

    void update(Product product);

    void add(Product product);

    void remove(int id);

    void searchProduct(String name);

    void sort();
}
