package com.provenorte.invoices.service;

import java.util.List;

import com.provenorte.invoices.model.Product;

public interface ProductService {

	List<Product> findAll();
	Product findById(Long id);
	void save(Product product);
	void delete(Long id);
}
