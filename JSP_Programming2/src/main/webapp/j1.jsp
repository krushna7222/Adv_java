<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<%= request.getParameter("username") %>
		
		<%
			
			String uname = request.getParameter("username");
			
			if(uname==null || uname.trim().isEmpty())
			{
				
				response.sendRedirect("login.html");
			}
			else
			{
				
				session.setAttribute("uname", uname);
				
				response.sendRedirect("welcome.jsp");
			}
		%>

</body>
</html>