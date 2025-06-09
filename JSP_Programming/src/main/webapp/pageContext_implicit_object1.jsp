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
<h1>In 1st Page Context JSP page</h1>
	
	<%
		String name = "Krushna Shahane";
		
		List<Integer> l1 = new ArrayList<Integer>();
				l1.add(9);
				l1.add(12);
				l1.add(2003);
				
				pageContext.setAttribute("name", name,pageContext.PAGE_SCOPE);
				pageContext.setAttribute("numList", l1,pageContext.PAGE_SCOPE);
	
	%>
	
	<button><a href="pageContext_implicit_object2.jsp">Go To 2nd Page</a></button>

</body>
</html>