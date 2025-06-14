<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


   <!-- sending data from web.xml to servlet/jsp =>we can use config or application implicit object -->
     <!-- config object is one per servlet/jsp..means we can send different different data from  web.xml to servlet/jsp inside config object
     
     application object is one per whole web application..so that we can send common information from web.xml to all the servlet/jsp
    -->
        <%
            String db= config.getInitParameter("dbname"); //accessing data from config object
             out.print("<h1>database name  = "+db+"</h1>");
        
             String dbuser= config.getInitParameter("dbUsername"); //accessing data from config object
             out.print("<h1>database user name  = "+dbuser+"</h1>");
             
             String dbpass= config.getInitParameter("dbpass"); //accessing data from config object
             out.print("<h1>database password  = "+dbpass+"</h1>");
        %>
                     

</body>
</html>