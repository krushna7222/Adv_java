<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>First JSP Page</h1>

	<%
		int a = 5;
		int b= 12;
		
		int c = a+b;
		
		out.print("<h2><i>Addition is = "+c+"</i></h2>");
	%>

</body>
</html>