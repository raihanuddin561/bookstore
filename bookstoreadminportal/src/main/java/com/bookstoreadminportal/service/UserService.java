package com.bookstoreadminportal.service;

import java.util.Set;

import com.bookstoreadminportal.model.User;
import com.bookstoreadminportal.security.PasswordResetToken;
import com.bookstoreadminportal.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	User findByEmail(String email);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception ;
	User save(User user);
}
