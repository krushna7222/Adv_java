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


@WebServlet("/Save_Servlet")
public class Save_Servlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		int rno = Integer.parseInt(request.getParameter("rollno"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		long phone = Long.parseLong(request.getParameter("phone"));
		String education = request.getParameter("education");
		String city = request.getParameter("city");
		
		Student s1 = new Student(rno,name,education,phone,city,email);
		
		try {
			int result = StudentDao.save(s1);
			
			if(result>0) {
			System.out.println("Data inserted Successfully");
			out.println("Data inserted Successfully");
			
			RequestDispatcher  rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response); 
			}else {
				System.out.println("Data Not inserted");
				out.println("Data Not inserted");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
