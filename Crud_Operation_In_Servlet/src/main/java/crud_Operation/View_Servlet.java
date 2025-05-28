package crud_Operation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/View_Servlet")
public class View_Servlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            ArrayList<Emp> list = EmpCon.view();;

            out.println("<h2>Employee List</h2>");
            out.println("<table border='1'>");
            out.println("<tr><th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
            
            for (Emp emp : list) {
                out.println("<tr>");
                out.println("<td>" + emp.getId() + "</td>");
                out.println("<td>" + emp.getName() + "</td>");
                out.println("<td>" + emp.getPassword() + "</td>");
                out.println("<td>" + emp.getEmail() + "</td>");
                out.println("<td>" + emp.getCountry() + "</td>");
                out.println("<td><a href='Edit_Servlet?id=" + emp.getId() + "'>Edit</a></td>");
                out.println("<td><a href='Delete_Servlet?id=" + emp.getId() + "'>Delete</a></td>");
                out.println("</tr>");
            }

            out.println("</table>");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
	}

}
