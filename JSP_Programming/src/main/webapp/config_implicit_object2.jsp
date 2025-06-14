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
            String sname= config.getInitParameter("serverName"); //accessing data from config object
             out.print("<h1>server name  = "+sname+"</h1>");
        
             String s_port= config.getInitParameter("serverPort"); //accessing data from config object
             out.print("<h1>server port  = "+s_port+"</h1>");
             
        %>
  
</body>
</html>