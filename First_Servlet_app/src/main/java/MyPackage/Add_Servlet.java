package MyPackage;


//doPost() method can accept and process only post request coming from client(.html)
//doGet() method can accept and process only get request coming from client(.html)
//service() method can accept and process both get and post requests coming from client(.html)
	
//public void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException
//public void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Add_Servlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int c = a+b;
		
		PrintWriter out = resp.getWriter();
		out.print("<h1><i>Addition is : "+c+"</i></h1>");
	}
	
}
