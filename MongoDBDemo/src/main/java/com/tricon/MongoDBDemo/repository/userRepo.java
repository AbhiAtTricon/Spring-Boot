package com.tricon.MongoDBDemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tricon.MongoDBDemo.model.users;

@Repository
public interface userRepo extends MongoRepository<users, String>{
	
	

}
