package mathematics_operations;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Div_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));

		PrintWriter out = res.getWriter();
		
		
		if (a<b || a==0) {
			out.print("<h1><i>Enter Valid Numbers</i></h1>");
		}else {
			 int c = a/b;
			 out.print("<h1><i>Division Is : "+c+"</i></h1>");
		}
		
		
	}
	
}
