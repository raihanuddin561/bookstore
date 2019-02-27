package com.bookstore.service;

import com.bookstore.model.User;
import com.bookstore.security.PasswordResetToken;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	void createPasswordResetTokenForUser(final User user, final String token);
}
