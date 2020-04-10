<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<body>
	<h1>User Login System in Servlet and Jsp by MVC pattern using
		MySQL</h1>
	<form action="RegistrationServlet" method="post">
		<!-- <p>SignUp Here</p> -->
		<table id="regform" cellspacing="20" align="center">
			<tr>
				<td>USER ID :</td>
				<td><input type="text" id="id" name="userid"
					placeholder="Enter only digits" required="required"></td>
			</tr>
			<tr>
				<td>FIRST NAME:</td>
				<td><input type="text" name="firstname"
					placeholder="Enter Alphabetics only" required></td>
			</tr>

			<tr>
				<td>LAST NAME:</td>
				<td><input type="text" name="lastname"
					placeholder="Enter Alphabetics only" required></td>
			</tr>
			<tr>
				<td>EMAIL:</td>
				<td><input type="email" name="email"
					placeholder="Enter your email" required></td>
			</tr>

			<tr>
				<td>PASSWORD:</td>
				<td><input type="password" name="password"
					placeholder="Enter your password" required></td>
			</tr>

			<tr>
				<td colspan=5 align="center"><button type="submit">REGISTER</button></td>
			</tr>
		</table>
		<!-- <p>
			Already Registered ?? Then,<a href="login.jsp">Login Here</a>
		</p> -->
	</form>
</body>
</body>

</html>

