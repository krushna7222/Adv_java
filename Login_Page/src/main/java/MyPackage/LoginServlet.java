package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
  {
        resp.setContentType("text/html");   //MIME
        
      String u  =   req.getParameter("uname"); //u= raj
      String p  =req.getParameter("pass");     //p =1234

      PrintWriter   out= resp.getWriter();
      
      
       // if( u.equals("sm") &&  p.equals("abcd"))
         if(  p.equals("abcd"))  
         {
            RequestDispatcher  rd = req.getRequestDispatcher("/welcome");
              rd.forward(req, resp);
        }
         else
         {
              out.print("<h1>Sorry!!!! Invalid username or password...</h1>");
              RequestDispatcher  rd = req.getRequestDispatcher("/index.html");
              rd.include(req, resp);
         }
      
  }
}
