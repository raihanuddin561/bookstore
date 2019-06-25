package com.bookstoreadminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstoreadminportal.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
