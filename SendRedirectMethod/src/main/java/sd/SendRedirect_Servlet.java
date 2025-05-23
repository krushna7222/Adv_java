package sd;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/SendRedirect_Servlet")
public class SendRedirect_Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s = req.getParameter("search");
		String c = req.getParameter("choice");
		
		switch (c) {
		case "google": {
			
			resp.sendRedirect("https://www.google.com/search?q="+s);
					}
		break;
		case "amazon": {
			
			resp.sendRedirect("https://www.amazon.in/s?k="+s);
					}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + c);
		}
		
	}
}
