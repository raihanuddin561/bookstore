package com.bookstore.service;

import java.util.Set;

import com.bookstore.model.User;
import com.bookstore.security.PasswordResetToken;
import com.bookstore.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	User findByEmail(String email);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception ;
	User save(User user);
}
