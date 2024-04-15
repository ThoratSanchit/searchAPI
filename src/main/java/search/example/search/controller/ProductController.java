package search.example.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import search.example.search.entity.Product;
import search.example.search.service.ProductService;

import java.util.List;
@RestController
@RequestMapping("/search/products")

public class ProductController {
    @Autowired
private ProductService productService;
    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping("/postData")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
