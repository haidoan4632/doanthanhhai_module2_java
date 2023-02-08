package ss17_binary_file_serilalization.bai_tap.repository;

import ss17_binary_file_serilalization.bai_tap.model.Product;

public interface IProductRepository {
    void add(Product product);


    Product findById(int id);

    void seach(Product product);

    void list();
}
