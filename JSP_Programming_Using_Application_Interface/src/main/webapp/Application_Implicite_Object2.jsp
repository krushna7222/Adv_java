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

		String education = application.getInitParameter("education");
		
		String course = application.getInitParameter("course");
		
		String cname = application.getInitParameter("class-name");
		
		String tname = application.getInitParameter("trainer-name");
	
	%>
	
	<%=
	
			"<h3>My Name : "+ name+"</h3>" +"<br>"+
			"<h3>My Education : "+education+"</h3>"+"<br>"+
			"<h3>My Course Name : "+course+"</h3>"+"<br>"+
			"<h3>My Class Name : "+cname+"</h3>"+"<br>"+
			"<h3>Trainer Name : "+tname+"</h3>"
	%>
</body>
</html>