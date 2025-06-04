<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP Page</title>
</head>
<body>

<%@ include file="Header.html" %>

<form action="s1.jsp">
	
		<input type="text" name="username" placeholder="Enter Your Username">	<br><br>
		
		<input type="submit" value="Submit">
	
	</form>
</body>
</html>