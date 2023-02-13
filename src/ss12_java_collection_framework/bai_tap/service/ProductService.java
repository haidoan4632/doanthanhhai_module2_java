package ss12_java_collection_framework.bai_tap.service;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.reponsitory.IReponsitoryProduct;
import ss12_java_collection_framework.bai_tap.reponsitory.ProductResponsitory;

public class ProductService implements IServiceProduct {
    private final IReponsitoryProduct reponsitory = new ProductResponsitory();

    @Override
    public void findAll() {
        reponsitory.findAll();
    }

    @Override
    public Product findById(int id) {
        return reponsitory.findById(id);
    }

    @Override
    public void update(Product product) {
        reponsitory.update(product);
    }

    @Override
    public void add(Product product) {
        reponsitory.add(product);
    }

    @Override
    public void remove(int id) {
        reponsitory.remove(id);
    }

    @Override
    public void searchProduct(String name) {
        reponsitory.searchProduct(name);
    }

    @Override
    public void sort() {
        reponsitory.sort();
    }
}
