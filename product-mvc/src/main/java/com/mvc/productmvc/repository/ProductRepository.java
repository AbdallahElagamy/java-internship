package com.mvc.productmvc.repository;

import com.mvc.productmvc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
