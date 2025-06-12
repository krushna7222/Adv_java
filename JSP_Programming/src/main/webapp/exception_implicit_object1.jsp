<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- //divide by zero exception will  occurred here
                // which will get handled in "exception_implicit_object2.jsp" file -->
                
<%@ page errorPage="exception_implicit_object2.jsp" %>

	<%
	
		int a[] = {1,0,28,47,30,58,1,4};
		
		out.print(a[2]);
		out.print(a[4]);
		out.print(a[0]);
		out.print(a[50]);
	
	%>
	

</body>
</html>