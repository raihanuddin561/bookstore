package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	User findByEmail(String email);

}
