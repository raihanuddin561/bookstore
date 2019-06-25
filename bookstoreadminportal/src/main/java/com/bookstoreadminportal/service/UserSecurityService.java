package com.bookstoreadminportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bookstoreadminportal.model.User;
import com.bookstoreadminportal.repository.UserRepository;

@Service
public class UserSecurityService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByUsername(username);
		if(null == user)
		{
			throw new UsernameNotFoundException("Username not found");
		}
		return user;
	}
	
}
