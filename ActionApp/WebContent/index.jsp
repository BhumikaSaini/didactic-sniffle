<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.nc.beans.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login form</title>
</head>
<body>
	<form>
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" value="${ param.username }"/>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/>
			</tr>
			<tr>
				<td><input type="submit" name="Login" value="Login"/>
			</tr>
		</table>
	</form>

	<%
		if(request.getParameter("Login")!=null) {
			User user = new User();
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			
			if("tom".equals(user.getUsername()) && "cat".equals(user.getPassword())) {
				RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
				request.setAttribute("user", user);
				rd.forward(request, response);
			}
			else {
				request.setAttribute("errorMsg", "Try again!");
			}
		}
	%>
	<h4 style="color: red">${errorMsg}</h4>

</body>
</html>