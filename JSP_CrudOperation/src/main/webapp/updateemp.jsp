<%@page import="com.demo.DAO.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>Update data...</h1>
  
  
     <jsp:useBean id="e"  class="com.demo.bean.Employee"/>
   
    <jsp:setProperty property="*" name="e"/>
    
    
            <%
                         int status=   EmpDAO.Update(e);
            
                                      
                                    	  response.sendRedirect("viewemp.jsp");
                                    
            
            %>
    
    
    
</body>
</html>