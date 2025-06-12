<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <%--   <h2>Without Expression Language</h2> 
    <%
          int a = Integer.parseInt(request.getParameter("n1"));
          int b = Integer.parseInt(request.getParameter("n2"));
          
          out.print("add = "+ (a+b));
    %> --%>
    
    
      <!-- Expression language is used to access data from request or session object and it prints that data on browser -->
 
      <h2>With Expression Language</h2> 
      
          <h3><u>Add  = ${  param.n1+ param.n2} </u></h3>
      
  
</body>
</html>