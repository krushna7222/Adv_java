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
			
			if(uname.equals("admin")){
				out.println("<br>Welcome "+uname);
			}else{
				out.println("<br>Something went wrong");

			}
		%>

</body>
</html>