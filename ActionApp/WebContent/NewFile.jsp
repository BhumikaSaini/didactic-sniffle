<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="companyName" value="Netcracker Technologies Ltd" scope="session"></c:set>
	<c:set var="Locations" value="Pune,Hyderabad,Bangalore" scope="session"></c:set>
	<c:forEach var="idx" begin="1" end="5" step="1">
		<c:if test="${idx%2 ne 0}">
			<h3 class="odd">${idx}: I work in ${companyName}</h3>
		</c:if>
		<c:if test="${idx%2 eq 0}">
			<h3 class="odd">${idx}: I work in ${companyName}</h3>
		</c:if>
		
</body>
</html>
