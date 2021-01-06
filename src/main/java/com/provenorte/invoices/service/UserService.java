package com.provenorte.invoices.service;

import java.util.List;

import com.provenorte.invoices.model.User;

public interface UserService {

	List<User> toList();
	User findById(Long id);
	void create(User user);
	void delete(Long id);
}
