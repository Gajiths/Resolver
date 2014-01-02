package com.bharp.inventry.dao.impl;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bharp.inventry.dao.UserLoginDAO;
import com.bharp.inventry.domain.User;



public class UserLoginDAOJDBCImpl implements UserLoginDAO{

	private DataSource dateSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public DataSource getdateSource() {
		return dateSource;
	}
	public void setdateSource(DataSource dateSource) {
		this.dateSource = dateSource;
		
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public boolean userIsExists(String username)
			throws Exception {
		String 	sqlStmt=" SELECT count(username)" +
				" From Users " +
				" WHERE username=? ";
		
		if(jdbcTemplate.queryForInt(sqlStmt,username)>0){
			return true;
		}
		return false;
	}
	@Override
	public void createUser(User user) throws Exception {
		// TODO Auto-generated method stub
		String 	sqlStmt="INSERT INTO users(username,password,firstName,lastName,Email) " +
						"Values(?,?,?,?,?)";
		 int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,Types.VARCHAR};

		jdbcTemplate.update(sqlStmt,new Object[]{user.getUsername(),user.getPassword(),user.getFirstName(),user.getLastName(),user.getEmail()},types);
		
	}
	
	
	
	
		
	
	}
	
	


