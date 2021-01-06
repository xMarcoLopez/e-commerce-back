package com.provenorte.invoices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.provenorte.invoices.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
