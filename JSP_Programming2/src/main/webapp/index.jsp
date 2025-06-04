<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP Page</title>
</head>
<body>

	<h2>Three type of jsp tags</h2>
	
		<ul>
			<li>Scriptlet Tag</li>
			<li>Declaration Tag </li>
			<li>Scripting Tag</li>
		</ul>
		
		<h3>Scriptlet Tag</h3>
		
		<%
			String name = "Krushna";
			
			out.println("My Name Is : "+name.toUpperCase());
			
			out.println("<br>addition of 33 and 99 Is : "+(33+99));
			
		%>
		<br>
		
		<h3>Declaration Tag</h3>
		
		<%!
		
			int count=0;
			
			public int increaseCount(){
				return count++;
			}
		
		%>
		
		<h3>Scripting Tag</h3>
		
		<%=
			
			"Count Is ="+increaseCount()
		%>
</body>
</html>