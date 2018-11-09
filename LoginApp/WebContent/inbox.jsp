<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<%! java.time.LocalDate today = java.time.LocalDate.now(); %>
	<%! int count = 0; %>
	<% int localCount = 0; %>
	<%! 
		void incrementCount() {
			count++;
		}
	%>
	<h3>Home Page : Inbox</h3>
	<h3 style="color:green">
		<%
			out.println(request.getAttribute("msg"));
			incrementCount();
		%>
	</h3>
	<h3>
		You have <%=count%> visits to my site
	</h3>
	<h3>
		You have <%=++localCount%> local visits to my site
	</h3>
	<h3>
		Today is: <%=today%>
	</h3>
	
	
</body>
</html>