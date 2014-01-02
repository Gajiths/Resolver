package com.bharp.inventry.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bharp.inventry.dao.UserLoginDAO;



public class UserLoginDAOJDBC implements UserLoginDAO{

	private DataSource dateSource;
	private JdbcTemplate jdbcTemplate;
	public DataSource getdateSource() {
		return dateSource;
	}
	public void setdateSource(DataSource dateSource) {
		this.dateSource = dateSource;
		this.jdbcTemplate= new JdbcTemplate(dateSource);
	}
	
	public boolean userIsExists(String username, String password)
			throws Exception {
		String 	sqlStmt=" SELECT count(Emaloyee_id)" +
				" From Users " +
				" WHERE Emaloyee_id=? AND Password=? ";
		
		if(jdbcTemplate.queryForInt(sqlStmt,username,password)>0){
			return true;
		}
		return false;
	}
		
	}
	
	


