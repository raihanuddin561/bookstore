package com.bookstoreadminportal.service;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstoreadminportal.model.User;
import com.bookstoreadminportal.repository.PasswordResetTokenRepository;
import com.bookstoreadminportal.repository.RoleRepository;
import com.bookstoreadminportal.repository.UserRepository;
import com.bookstoreadminportal.security.PasswordResetToken;
import com.bookstoreadminportal.security.UserRole;

@Service
public class UserServiceImpl implements UserService {
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User createUser(User user, Set<UserRole> userRoles)throws Exception {
		// TODO Auto-generated method stub
		User localUser = userRepository.findByUsername(user.getUsername());
		if(localUser != null) {
			LOG.info("User{} already exists. Nothing will be done.",user.getUsername());
			throw new Exception("User already exists. Nothing will be done");
			
		}else {
			for(UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			
			localUser = userRepository.save(user);
		}
		return localUser;
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
