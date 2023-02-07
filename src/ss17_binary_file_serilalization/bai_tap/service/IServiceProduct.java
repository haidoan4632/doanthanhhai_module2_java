package ss17_binary_file_serilalization.bai_tap.service;

import ss17_binary_file_serilalization.bai_tap.model.Product;

public interface IServiceProduct {
    void add(Product product);

    void findAll();

    Product findById(int id);

    void seach(Product product);

    void list();
}
