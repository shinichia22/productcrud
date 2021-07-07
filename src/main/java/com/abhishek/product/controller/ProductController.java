package com.abhishek.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.abhishek.product.entity.Product;
import com.abhishek.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/addProduct")
	public ModelAndView addProduct() {
		ModelAndView model = new ModelAndView();
		Product product = new Product();
		model.addObject("productForm", product);
		model.setViewName("addproductform");
		return model;
	}

	@PostMapping("/saveProduct")
	public ModelAndView saveProduct(@ModelAttribute("productForm") Product product) {
		productService.saveProduct(product);
		return new ModelAndView("redirect:/products");
	}

	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return productService.saveProducts(products);
	}

	@GetMapping("/products")

	public ModelAndView findAllProducts() {
		ModelAndView model = new ModelAndView("productlistpage");
		List<Product> productList = productService.getProducts();
		System.out.print("************" + productList + "***************");
		model.addObject("productlist", productList);

		return model;
	}

	@GetMapping("/product/{id}")
	public Optional<Product> findProductById(@PathVariable int id) {
		return productService.getProduct(id);
	}

	@GetMapping("/product/{name}")
	public Product findProductByName(@PathVariable String name) {
		return productService.getProductName(name);
	}

	@GetMapping("/update/{id}")
	public ModelAndView editProduct(@PathVariable int id) {
		ModelAndView model = new ModelAndView();

		Product product = productService.updateProduct(id);
		model.addObject("productForm", product);
		model.setViewName("addproductform");

		return model;
	}

	@GetMapping("/delete/{id}")
	public ModelAndView deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
		return new ModelAndView("redirect:/products");

	}

}
