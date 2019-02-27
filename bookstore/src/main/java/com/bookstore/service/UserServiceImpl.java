package com.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.model.User;
import com.bookstore.repository.PasswordResetTokenRepository;
import com.bookstore.security.PasswordResetToken;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private PasswordResetTokenRepository passwordResetTokenRepository;
	@Override
	public PasswordResetToken getPasswordResetToken(final String token) {
		// TODO Auto-generated method stub
		return passwordResetTokenRepository.findByToken(token);
	}

	@Override
	public void createPasswordResetTokenForUser(final User user,final String token) {
		final PasswordResetToken myToken = new PasswordResetToken(token,user);
		passwordResetTokenRepository.save(myToken);
		
	}

}
