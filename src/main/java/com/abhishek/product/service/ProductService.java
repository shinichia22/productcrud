package com.abhishek.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhishek.product.entity.Product;
import com.abhishek.product.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Optional<Product> getProduct(int id) {
		return productRepository.findById(id);
	}

	public Product getProductName(String name) {
		return productRepository.findByName(name);
	}

	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "Product deleted! " + id;
	}

	public Product updateProduct(int id) {
		Product existingProduct = productRepository.findById(id).orElse(null);
		return existingProduct;
	}

}
