package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
