package ss17_binary_file_serilalization.bai_tap.service;

import ss17_binary_file_serilalization.bai_tap.model.Product;

public interface IProductService {
    void add(Product product);

    Product findById(int id);

    void seach(Product product);

    void list();
}
