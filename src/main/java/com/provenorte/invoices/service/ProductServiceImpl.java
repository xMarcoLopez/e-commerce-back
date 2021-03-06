package com.provenorte.invoices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.apache.commons.lang.RandomStringUtils;

import com.provenorte.invoices.model.Product;
import com.provenorte.invoices.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		return productRepository.activeProducts();
	}

	@Override
	public Product findById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public void save(Product product) {
		product.setCode(RandomStringUtils.randomAlphanumeric(6).toUpperCase());
		product.setActive(1);	
		productRepository.save(product);	
	}

	@Override
	public void delete(Long id) {
		Product product = productRepository.findById(id).orElse(null);
		product.setActive(0);
		productRepository.save(product);
		
	}

}
