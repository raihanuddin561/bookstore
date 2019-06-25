package com.bookstoreadminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstoreadminportal.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	User findByEmail(String email);

}
