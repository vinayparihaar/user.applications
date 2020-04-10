package com.vinayparihar.userregistrationproject.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.tomcat.jni.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {

	private static final Logger logger = LoggerFactory.getLogger(Utils.class);
	private static Properties properties;

	public static String getProperty(String key) {
		try {
			logger.debug("Entered createUser method of UserService class");
			if (properties == null) {
				properties = new Properties();
				//properties.load(new FileInputStream("C:/Users/VinayParihar/Git/repository/UserRegistrationProject/WebContent/jdbc.properties"));
				System.out.println(new java.io.File("jdbc.properties").getAbsolutePath());
				properties.load(new FileInputStream("jdbc.properties"));

			}
			return properties.getProperty(key);
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			logger.error("Errror occured in createUser method of UserDAO class " + fnfe);
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			logger.error("Errror occured in createUser method of UserDAO class " + ioe);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Errror occured in createUser method of UserDAO class " + e);
		}
		return null;
	}
	
	

}
