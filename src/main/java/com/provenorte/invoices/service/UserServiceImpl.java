package com.provenorte.invoices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provenorte.invoices.model.User;
import com.provenorte.invoices.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> toList() {
		return userRepository.findAll();
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public void create(User user) {
		userRepository.save(user);		
	}

	@Override
	public void delete(Long id) {
		
		
	}
}
