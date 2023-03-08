package com.example.productservice.service;

import com.example.productservice.entity.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(long proId);
    List<Product> getAllProducts();
    void addProduct(Product product);
    void updateProduct(long proId, Product product);
    void deleteProduct(long proId);
}
