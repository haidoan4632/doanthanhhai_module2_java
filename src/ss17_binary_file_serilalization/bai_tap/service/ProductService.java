package ss17_binary_file_serilalization.bai_tap.service;

import ss17_binary_file_serilalization.bai_tap.model.Product;
import ss17_binary_file_serilalization.bai_tap.repository.ProductRepository;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void seach(Product product) {
        productRepository.seach(product);
    }

    @Override
    public void list() {
        productRepository.list();
    }
}
