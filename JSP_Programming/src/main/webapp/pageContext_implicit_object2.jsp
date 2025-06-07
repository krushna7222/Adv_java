<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>In 2nd Page Context JSP page</h1>
	
<%

		String name = (String) pageContext.getAttribute("name",pageContext.PAGE_SCOPE);
		List<Integer> numList = (List<Integer>) pageContext.getAttribute("numList",pageContext.PAGE_SCOPE);
		
		out.println("My Name IS = "+name);
		out.println("<br>Number Of List = "+numList);

	%>


</body>
</html>