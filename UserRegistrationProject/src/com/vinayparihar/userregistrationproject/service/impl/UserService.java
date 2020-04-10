package com.vinayparihar.userregistrationproject.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vinayparihar.userregistrationproject.beans.Users;
import com.vinayparihar.userregistrationproject.dao.IUserDAO;
import com.vinayparihar.userregistrationproject.dao.impl.UserDAO;
import com.vinayparihar.userregistrationproject.service.IUserService;

public class UserService implements IUserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	private IUserDAO userDAO;

	public int createUser(Users user) {
		logger.debug("Entered createUser method of UserService class");
		userDAO= new UserDAO();
	
		return userDAO.createUser(user);
	}

}
