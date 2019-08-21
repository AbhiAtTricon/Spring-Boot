package com.tricon.MongoDBDemo.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tusers")
public class users {
	@Id
	private String id;
	private String username;
	private String password;
	private String emailid;
	private BigInteger contactNo;
	
	public users()
	{
		
	}

	public users(String username, String password, String emailid, BigInteger contactNo) {
		super();
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.contactNo = contactNo;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public BigInteger getContactNo() {
		return contactNo;
	}

	public void setContactNo(BigInteger contactNo) {
		this.contactNo = contactNo;
	}
	
	

}
