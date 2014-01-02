package com.bharp.inventry.dao;

import com.bharp.inventry.domain.User;

public interface UserLoginDAO {
	public boolean userIsExists(String username) throws Exception;
	public void createUser(User user) throws Exception;

}
