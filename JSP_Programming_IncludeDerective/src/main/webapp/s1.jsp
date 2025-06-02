<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.html" %>

		<%= request.getParameter("username") %>
		
		<%
			
			String uname = request.getParameter("username");
		
		session.setAttribute("uname", uname);
		
			
		%>
		
		
		<a href="welcome.jsp">Click To Go welcome Page</a>
		

</body>
</html>