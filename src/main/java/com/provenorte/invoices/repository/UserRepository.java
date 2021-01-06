package com.provenorte.invoices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.provenorte.invoices.model.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
