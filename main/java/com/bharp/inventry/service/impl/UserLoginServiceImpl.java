package com.bharp.inventry.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.bharp.inventry.dao.UserLoginDAO;
import com.bharp.inventry.dao.impl.UserLoginDAOJDBC;
import com.bharp.inventry.dao.impl.UserLoginDAOJDBCImpl;
import com.bharp.inventry.domain.User;
import com.bharp.inventry.service.UserLoginService;



@Service 
public class UserLoginServiceImpl  implements UserLoginService{
	@Autowired 
	private UserLoginDAO userLoginDAOJDBC;
	public boolean userIsExists(String username)
			throws Exception {
		
		return userLoginDAOJDBC.userIsExists(username);
	}
	@Override
	public void createUser(User user) throws Exception {
		// TODO Auto-generated method stub
		if(!userIsExists(user.getUsername())){
			userLoginDAOJDBC.createUser(user);
		}
		
	}
}

	
	


