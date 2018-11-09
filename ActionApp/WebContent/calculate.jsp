<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form>
		<div>
			Enter First number:
			<input type="text" name="fnum" value="${param.fnum}"/>
		</div>
		<div>
			Enter Second number:
			<input type="text" name="snum" value="${param.snum}"/>
		</div>
		<div>
			Select operation
			<select name="op">
				<option value="+">Add</option>
				<option value="-">Subtract</option>
				<option value="*">Multiply</option>
				<option value="/">Divide</option>
			</select>
		</div>
		<input type="submit" name="Submit" value="Submit"/>
	</form>
	
	<c:set var="num1" value="${param.fnum}" scope="session"></c:set>
	<c:set var="num2" value="${param.snum}" scope="session"></c:set>
	<c:set var="op" value="${param.op}" scope="session"></c:set>
	<c:choose>
	<!--<c:if test="${op ne null and op eq '+'}">
		${num1+num2}
	</c:if>
	<c:if test="${op ne null and op eq '-'}">
		${num1-num2}
	</c:if>
	<c:if test="${op ne null and op eq '*'}">
		${num1*num2}
	</c:if>
	<c:if test="${op ne null and op eq '/'}">
		${num1/num2}
	</c:if>-->
	<c:if test="${not empty param.calc}">
	<c:when test="${op eq '+'}">
		${num1+num2}
	</c:when>
	<c:when test="${op eq '+'}">
		${num1+num2}
	</c:when>
	<c:when test="${op eq '+'}">
		${num1+num2}
	</c:when>
	<c:when test="${op eq '+'}">
		${num1+num2}
	</c:when>
	
	</c:choose>
	</c:if>
</body>
</html>