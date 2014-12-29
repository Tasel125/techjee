package com.techandsolve.ejbs;

import javax.ejb.Remote;

import com.techandsolve.entities.User;

@Remote
public interface UserEJBRemote {

	public void registerUser(User user);
	public User authenticateUser(String email, String password);
	
}
