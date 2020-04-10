package com.vinayparihar.userregistrationproject.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBUtils {

	private static final Logger logger = LoggerFactory.getLogger(DBUtils.class);
	
	public static Connection getDBConnection() throws SQLException {
		Connection connection = null;
		try {
			logger.debug("Entered getDBConnection method of DBUtils class");
			logger.debug("loading MySQL drivers in getDBConnection method of DBUtils class");
			Class.forName(Utils.getProperty("driver"));
			logger.debug("Creating Connection in getDBConnection method of DBUtils class");
			connection = DriverManager.getConnection(Utils.getProperty("url"),Utils.getProperty("username"),Utils.getProperty("password"));

		} catch (ClassNotFoundException cnfe) {
			logger.error("Errror occured in createUser method of DBUtils class "+ cnfe);
		} catch (Exception e) { 
			logger.error("Errror occured in createUser method of DBUtils class "+ e);
		}

		return connection;
	}

}
