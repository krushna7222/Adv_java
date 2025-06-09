<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="a" value="7"></c:set>
	<c:set var="b" value="7"></c:set>
	
	<h2>Value of A  = <c:out value="${a}"></c:out></h2>
	<h2>Value of B  = <c:out value="${b}"></c:out></h2>
	
	<h2>Addition of A and b is = <c:out value="${a+b}"></c:out></h2>
	
	<c:remove var="a"/>
	<c:remove var="b"/>
	
	<h2>after remove value of A  = <c:out value="${a}"/>
	<h2>after remove value of B  = <c:out value="${b}"/>
	

</body>
</html>