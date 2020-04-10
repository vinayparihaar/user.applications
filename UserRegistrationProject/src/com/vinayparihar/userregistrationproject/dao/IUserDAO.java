package com.vinayparihar.userregistrationproject.dao;

import java.sql.Connection;

import com.vinayparihar.userregistrationproject.beans.Users;

public interface IUserDAO {

	public static final String INSERT_USER = "INSERT INTO practicedb.tbluser(id,firstName,lastName,email,password)VALUES(?,?,?,?,?)";

	public  int createUser(Users user);

	

}
