<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>JSP Tag</h2>


<!-- 	ScriptLess Tag  -->
 	
	<%
		int a=10;
		int b=20;
		out.print("<h2>Additiom is = "+(a+b)+"</h2>");
	
	%>
	
	<!-- 	Declaration Tag  -->
	
	<%!
		int r=9;
		double pi=3.14;
		
		double areaOfCircle(){
			return pi*r*r;
		}
	
	%>
	
	<!-- 	Expression Tag  -->
	
	<%=
		"<h2><i>Area Of Circle = "+areaOfCircle()
	%>

</body>
</html>