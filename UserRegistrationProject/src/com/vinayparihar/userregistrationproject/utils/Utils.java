package com.vinayparihar.userregistrationproject.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
				System.out.println(System.getProperty("user.dir"));
				String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
				String appConfigPath = rootPath +"../"+ "jdbc.properties";
				//properties.load(new FileInputStream("C:/Users/VinayParihar/Git/repository/UserRegistrationProject/WebContent/jdbc.properties"));
				FileReader reader=new FileReader(appConfigPath);  
				
				properties.load(reader);

			}
			return properties.getProperty(key);
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			logger.error("Errror occured in getProperty method of Utils class " + fnfe);
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			logger.error("Errror occured in getProperty method of Utils class " + ioe);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Errror occured in createUser method of UserDAO class " + e);
		}
		return null;
	}
	
}
