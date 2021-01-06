package com.provenorte.invoices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.provenorte.invoices.model.Product;
import com.provenorte.invoices.service.ProductService;

@RestController
@RequestMapping("/v1/products")
public class ProductRestController {

	@Autowired
	private ProductService productService;

	@GetMapping
	public List<Product> getProducts() {
		return productService.findAll();
	}

	@GetMapping("/{id}")
	public Product findById(@PathVariable Long id) {
		return productService.findById(id);
	}

	@PostMapping
	public void save(@RequestBody Product product) {
		product.setActive(1);
		productService.save(product);
	}

	@PutMapping("/{id}")
	public void update(@PathVariable Long id) {
		Product product = productService.findById(id);
		productService.save(product);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		productService.delete(id);
	}
}
