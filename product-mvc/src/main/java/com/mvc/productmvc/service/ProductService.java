package com.mvc.productmvc.service;

import com.mvc.productmvc.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProductById(int id);
    void saveProduct(Product product);
    void deleteProduct(int id);
}
