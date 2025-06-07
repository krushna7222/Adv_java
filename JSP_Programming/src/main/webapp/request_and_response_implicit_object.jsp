<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String s = request.getParameter("search");
	
	response.sendRedirect("https://www.google.com/search?q="+s);
%>

</body>
</html>