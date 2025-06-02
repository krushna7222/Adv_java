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
	
		String name = application.getInitParameter("name");
		out.print("<h2>My Name : "+ name+"</h2>");
		
		String education = application.getInitParameter("education");
		out.print("<h2>My Education : "+education+"</h2>");
		
		String course = application.getInitParameter("course");
		out.print("<h2>My Course Name : "+course+"</h2>");
		
		String cname = application.getInitParameter("class-name");
		out.print("<h2>My Class Name : "+cname+"</h2>");
		
		String tname = application.getInitParameter("trainer-name");
		out.print("<h2>Trainer Name : "+tname+"</h2>");
	
	%>
	

</body>
</html>