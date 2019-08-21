package com.tricon.MongoDBDemo.services;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.MongoDBDemo.model.users;
import com.tricon.MongoDBDemo.repository.userRepo;

@Service
public class userService {
	
	@Autowired
	private userRepo userrepo;
	
	public String createUser(String username, String password, String emailid, BigInteger contactNo)
	{
		users user = new users(username,password,emailid,contactNo);
		userrepo.save(user);
		return ("New user created with id: " + user.getId());
	}
	
	public List<users> listusers()
	{
		return userrepo.findAll();
	}

}
