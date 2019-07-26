package com.haris.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.haris.demo.model.*;
import com.haris.demo.dao.*;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = repo.findByUsername(username);
		
		if (user == null)
		{
			throw new UsernameNotFoundException("User 404");
		}
		return new UserPrincipal(user);
	}
	public List<User> getUsers(){
		List<User> users = repo.findAll();
		System.out.println("Getting data from db : " + users );
		return users;
	}

}
	