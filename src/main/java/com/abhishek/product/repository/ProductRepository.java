package com.abhishek.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abhishek.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
