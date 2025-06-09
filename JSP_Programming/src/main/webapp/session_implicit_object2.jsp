<%@page import="java.util.ArrayList"%>
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

<h1>In 1nd Session JSP page</h1>

	<%

		String name = (String) session.getAttribute("name");
		List<Integer> numList = (List<Integer>) session.getAttribute("numList");
		
		out.println("My Name IS = "+name);
		out.println("<br>Number Of List = "+numList);

	%>

</body>
</html>