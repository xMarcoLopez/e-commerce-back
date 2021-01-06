package com.provenorte.invoices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.provenorte.invoices.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	@Query(value="FROM Product p WHERE p.active=1")
	List<Product> activeProducts();
}
