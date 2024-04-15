package search.example.search.service;

import org.springframework.stereotype.Repository;
import search.example.search.entity.Product;

import java.util.List;

@Repository
public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
