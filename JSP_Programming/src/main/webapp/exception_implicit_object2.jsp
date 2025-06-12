<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- EXCEPTION HANDLING IN JSP -->
      <!-- here "exception_implicit_object2.jsp" is acts like a catch block..which handles an exception -->

	<%@ page isErrorPage="true" %>
	
	<%
		out.print("<h1>Oops Sorry Exception IS Generated!!!</h1>");
		out.print("<h1>Exception</h1>"+exception);
	
	%>

</body>
</html>