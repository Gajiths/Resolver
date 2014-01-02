package com.bharp.inventry.service;

import com.bharp.inventry.domain.User;

public interface UserLoginService {
	
	public boolean userIsExists(String username) throws Exception;
	public void createUser(User user) throws Exception;
}
