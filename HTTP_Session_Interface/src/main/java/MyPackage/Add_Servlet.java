package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Add_Servlet")
public class Add_Servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));

		int c = a+b;
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Addition = "+c+"</h1>");
		
		HttpSession session = request.getSession();		// if session exist then get this else create new session
//		HttpSession session = request.getSession(true);  always create new session
//		HttpSession session = request.getSession(false);  alwayes get old session

		
		session.setAttribute("sum", c);
		
//		session.invalidate();
		
		out.print("<a href='Squre_Servlet'>Find Squre</a>");
		
	}

}
