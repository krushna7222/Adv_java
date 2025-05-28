package crud_Operation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/Edit_Servlet2")
public class Edit_Servlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	          throws ServletException, IOException {  
	       
	        response.setContentType("text/html");  
	        
	        PrintWriter out=response.getWriter();  
	        out.print("<body background='https://images.pexels.com/photos/255379/pexels-photo-255379.jpeg?auto=compress&cs=tinysrgb&h=627&fit=crop&w=1200'>"); 
	        int id=Integer.parseInt(request.getParameter("id"));  
	        
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");
	        String email=request.getParameter("email");  
	        String country=request.getParameter("country");
	        
	       
	        Emp e=new Emp();  
	        e.setId(id); 
	        e.setName(name);  
	        e.setPassword(password);  
	        e.setEmail(email);  
	        e.setCountry(country);  
	          
	        
	        int status=EmpCon.update(e);   
	        
 
	        if(status>0){  
	            response.sendRedirect("View_Servlet");  
	        }else{  
	            out.println("Sorry! unable to update record");  
	        }  
	          
	        out.close();  
	    }  

}
