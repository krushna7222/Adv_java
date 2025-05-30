package Student_Managment_System;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


@WebServlet("/Edit_Servlet2")
public class Edit_Servlet2 extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		int rno = Integer.parseInt(request.getParameter("rollno"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		long phone = Long.parseLong(request.getParameter("phone"));
		String education = request.getParameter("education");
		String city = request.getParameter("city");
		
		Student s1 = new Student(rno,name,education,phone,city,email);
		int result = 0;
		
		try {
			 result = StudentDao.updateStudent(s1);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result>0) {
			out.print("<h2><i>Student Detail Updated...</i></h2>");
			response.sendRedirect("View_Servlet");
		}else {
			out.print("<h2><i>Student Detail Not Updated...</i></h2>");
			response.sendRedirect("View_Servlet");
		}
		
	}

}
