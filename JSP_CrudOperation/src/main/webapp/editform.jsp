<%@page import="com.demo.bean.Employee"%>
<%@page import="com.demo.DAO.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <jsp:include page="index.html"/>

     <%
             int id=Integer.parseInt(request.getParameter("id"));
     
                     Employee e  =  EmpDAO.getEMployee(id);
            
                     
     %>


   <div class="container border border-5 border-primary p-5 m-auto mt-5">
   
     <form class="row g-3"  action="updateemp.jsp" method="post">
       <div class="col-md-12">
    <label for="name" class="form-label">Id</label>
    <input type="hidden" class="form-control" name="id"   value="<%=e.getId()  %>" id="inputEmail4">
  </div>
  <div class="col-md-6">
    <label for="name" class="form-label">Name</label>
    <input type="text" class="form-control" name="name" value="<%=e.getName() %>" id="inputEmail4">
  </div>
  <div class="col-md-6">
    <label for="inputPassword4" class="form-label">Password</label>
    <input type="password" class="form-control" name="password" value="<%=e.getPassword() %>" id="inputPassword4">
  </div>
  <div class="col-12">
    <label for="inputAddress" class="form-label">Email</label>
    <input type="email" class="form-control" name="email"  value="<%=e.getEmail() %>"  placeholder="1234 Main St">
  </div>
    <div class="col-md-6">
    <label for="gender" class="form-label">Gender </label>
  </div>
  <div class="col-md-12">
  
    <label for="gender" class="form-label">Male</label>
    <input type="radio"  name="sex" value="male"  id="inputAddress2" >
    <label for="inputCity" class="form-label">Female</label>
    <input type="radio"   name="sex" value="female"  id="inputCity">
  </div>

  <div class="col-md-4">
    <label for="inputcountry" class="form-label">Country</label>
    <select id="inputcountry" name="country" class="form-select">
      <option selected>India</option>
      <option>Pakistan</option>
      <option>USA</option>
      <option>UK</option>
    </select>
  </div>
  


  <div class="col-12">
    <button type="submit" class="btn btn-primary">Sign in</button>
  </div>
</form>
        
      
   
   
   
   </div>

</body>
</html>