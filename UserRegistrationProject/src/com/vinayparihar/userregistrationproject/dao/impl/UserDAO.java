package com.vinayparihar.userregistrationproject.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vinayparihar.userregistrationproject.beans.Users;
import com.vinayparihar.userregistrationproject.dao.IUserDAO;
import com.vinayparihar.userregistrationproject.utils.DBUtils;

public class UserDAO implements IUserDAO {

	private static final Logger logger = LoggerFactory.getLogger(UserDAO.class);
	
	private Connection connection;
	private PreparedStatement prepareStatement;
	private int result;

	@Override
	public int createUser(Users user) {
		try {
			logger.debug("Entered createUser method of UserDAO class");
			connection = DBUtils.getDBConnection();
			prepareStatement = connection.prepareStatement(INSERT_USER);
			prepareStatement.setInt(1, user.getUserId());
			prepareStatement.setString(2, user.getFirstName());
			prepareStatement.setString(3, user.getLastName());
			prepareStatement.setString(4, user.geteMail());
			prepareStatement.setString(5, user.getPassword());
			result = prepareStatement.executeUpdate();
			logger.debug("Retrived data from database in UserDAO class createUser method");
		} catch (SQLException sqe) {
			// TODO Auto-generated catch block
			logger.error("Errror occured in createUser method of UserDAO class "+ sqe);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Errror occured in createUser method of UserDAO class "+ e);
		}finally
		{
			if(connection!=null) {
				try {
					connection.close();
					connection=null;
				} catch (SQLException sqe) {
					// TODO Auto-generated catch block
					logger.error("Errror occured in createUser method of UserDAO class "+ sqe);
				}
			}
		}
		return result;
	}

	

}
