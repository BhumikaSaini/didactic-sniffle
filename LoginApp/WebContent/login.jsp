<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<h2>Login Page</h2>
	<form action="validate.html" method="post">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="uname" required/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pwd" required/></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="login"/></td>
			</tr>
		</table>
	</form>
	
	<h3 style="color: red">
	<%
		if(request.getAttribute("msg")!=null)
		{
			out.println(request.getAttribute("msg"));
		}
	%>
	</h3>

	<%-- <h3>
	<%
		for(int i=0; i<5; i++) {
			out.println("Hello from JSP");
		}
		out.println("Session ID:"+session.getId());
	%>
	</h3> --%>

</body>
</html>