package com.vinayparihar.userregistrationproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vinayparihar.userregistrationproject.beans.Users;
import com.vinayparihar.userregistrationproject.service.IUserService;
import com.vinayparihar.userregistrationproject.service.impl.UserService;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	private static Logger logger = LoggerFactory.getLogger(RegistrationServlet.class);
	private static final long serialVersionUID = 1L;

	private Users users;
	// private UserDAO userDAO;
	private IUserService userService;
	private int status;
	private PrintWriter printWriter;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			logger.debug("Entered doPost method of RegistrationServlet class");
			response.setContentType("text/html");
			printWriter = response.getWriter();
			logger.debug(
					"Assigning data from form to setter of User class in doPost method of RegistrationServlet class");
			users = new Users();
			users.setUserId(Integer.parseInt(request.getParameter("userid")));
			users.setFirstName(request.getParameter("firstname"));
			users.setLastName(request.getParameter("lastname"));
			users.seteMail(request.getParameter("email"));
			users.setPassword(request.getParameter("password"));

			/*
			 * int userid = Integer.parseInt(request.getParameter("userid")); String
			 * firstname = request.getParameter("firstname"); String lastname =
			 * request.getParameter("lastname"); String email =
			 * request.getParameter("email"); String password =
			 * request.getParameter("password");
			 * 
			 * logger.debug(
			 * "Assigning data from form to setter of User class in doPost method of RegistrationServlet class"
			 * ); users.setUserId(userid); users.setFirstName(firstname);
			 * users.setFirstName(lastname); users.setFirstName(email);
			 * users.setFirstName(password);
			 */

			logger.debug(
					"Passing form data to UserDAO class create user method in doPost method of RegistrationServlet class");
			// status = userDAO.createUser(users);
			userService = new UserService();
			status = userService.createUser(users);

			if (status != 0) {
				printWriter.println("<h2 align='center'> Registration Successfull!!!</h2>");
			} else
				printWriter.println("<h2 align='center'> Registration Failed!!!</h2>");

		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			logger.error("Errror occured in createUser method of RegistrationServlet class " + ioe);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Errror occured in createUser method of RegistrationServlet class " + e);
		}
	}
}
