package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends  HttpServlet{

    @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
        resp.setContentType("text/html");   //MIME
       // resp.setContentType("msword/application"); 
        
        
      String u =req.getParameter("uname");
      
      PrintWriter   out= resp.getWriter();
      
      out.print("<h2>Welcome, "+u+"</h2>");
    
      
        
  }
  
}
