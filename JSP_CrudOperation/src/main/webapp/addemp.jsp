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


	<jsp:useBean id="e1" class="com.demo.bean.Employee"></jsp:useBean>

	<jsp:setProperty property="*" name="e1" />


	<%
        
           int ans  =  EmpDAO.Save(e1);
        
                if(ans>0)
                {
                	response.sendRedirect("EmpSuccess.jsp");
                }else
                {
                	response.sendRedirect("Error.jsp");
                }
        
        %>

</body>
</html>