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

	<c:set var="n" value="89"></c:set>

	<c:if test="${n%2 == 0}">
		<h2>${n} Is Even Number..</h2>
	</c:if>
	
	<c:if test="${n%2 != 0}">
		<h2>${n} Is Odd Number..</h2>
	</c:if>

</body>
</html>