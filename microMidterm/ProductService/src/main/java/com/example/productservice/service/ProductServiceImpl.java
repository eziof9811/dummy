package com.example.productservice.service;

import com.example.productservice.entity.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProductById(long proId) {

        return productRepository.findById(proId).get();
    }

    @Override
    public List<Product> getAllProducts() {

        return (List<Product>) productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(long proId, Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(long proId) {

        productRepository.deleteById(proId);
    }
}
