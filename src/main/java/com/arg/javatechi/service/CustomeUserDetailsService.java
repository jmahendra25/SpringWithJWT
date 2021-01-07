package com.arg.javatechi.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.arg.javatechi.entity.LoginInfo;
import com.arg.javatechi.repository.LoginInfoRepository;

@Service
public class CustomeUserDetailsService implements UserDetailsService {
	
	
	
	@Autowired
	private LoginInfoRepository loginInfoRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		LoginInfo loginInfo = loginInfoRepository.findByUsername(username);
		if(loginInfo==null)
			throw new UsernameNotFoundException("User 404");
		
		System.out.println("username is : "+loginInfo.getUsername());
		System.out.println("password is : "+loginInfo.getPassword());
		
		return new org.springframework.security.core.userdetails.User(loginInfo.getUsername(), loginInfo.getPassword(), new ArrayList<>());
	}

}
