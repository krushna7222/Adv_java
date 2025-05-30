package Student_Managment_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/View_Servlet")
public class View_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:5173"); // React's origin
		response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		
		
		PrintWriter out = response.getWriter();
		ArrayList<Student> s1 = null;
		
		try {
			 s1 = StudentDao.getAllStudent();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		out.println("<html>");
		out.println("<head><title>Student List</title></head>");
		out.println("<body style='margin: 0; padding: 0; font-family: Arial, sans-serif; background-color: #f4f4f4;'>");

		out.println("<div style='max-width: 90%; margin: 30px auto; padding: 20px; background-color: white; border-radius: 10px; box-shadow: 0 0 15px rgba(0,0,0,0.1);'>");
		out.println("<h2 style='text-align: center; color: #333; margin-bottom: 20px;'>Student Details</h2>");

		// Table styling
		out.println("<table style='border-collapse: collapse; width: 100%;'>");
		out.print("<tr style='background-color: #4CAF50; color: white;'>");
		out.print("<th style='padding: 12px; border: 1px solid #ddd;'>Roll No</th>");
		out.print("<th style='padding: 12px; border: 1px solid #ddd;'>Name</th>");
		out.print("<th style='padding: 12px; border: 1px solid #ddd;'>Email</th>");
		out.print("<th style='padding: 12px; border: 1px solid #ddd;'>Education</th>");
		out.print("<th style='padding: 12px; border: 1px solid #ddd;'>Phone</th>");
		out.print("<th style='padding: 12px; border: 1px solid #ddd;'>City</th>");
		out.print("<th style='padding: 12px; border: 1px solid #ddd;'>Edit</th>");
		out.print("<th style='padding: 12px; border: 1px solid #ddd;'>Delete</th>");
		out.print("</tr>");

		// Loop through student data
		int index = 0;
		for(Student s : s1) {
		    String bgColor = (index % 2 == 0) ? "#f9f9f9" : "#ffffff";
		    out.print("<tr style='background-color: " + bgColor + "; transition: background-color 0.3s;'>");
		    out.print("<td style='padding: 10px; border: 1px solid #ddd;'>"+s.getRollno()+"</td>");
		    out.print("<td style='padding: 10px; border: 1px solid #ddd;'>"+s.getName()+"</td>");
		    out.print("<td style='padding: 10px; border: 1px solid #ddd;'>"+s.getEmail()+"</td>");
		    out.print("<td style='padding: 10px; border: 1px solid #ddd;'>"+s.getEducation()+"</td>");
		    out.print("<td style='padding: 10px; border: 1px solid #ddd;'>"+s.getPhone()+"</td>");
		    out.print("<td style='padding: 10px; border: 1px solid #ddd;'>"+s.getCity()+"</td>");
		    out.print("<td style='padding: 10px; border: 1px solid #ddd;'><a style='text-decoration:none; color:blue' href='Edit_Servlet?rollno=" + s.getRollno() + "'>Edit</a></td>");
		    out.print("<td style='padding: 10px; border: 1px solid #ddd;'><a style='text-decoration:none; color:red' href='Delete_Servlet?rollno=" + s.getRollno() + "'>Delete</a></td>");
		    out.print("</tr>");
		    index++;
		}

		// End table and HTML
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
	
	}

}




//
//
//import com.google.gson.Gson;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//@WebServlet("/View_Servlet")
//public class View_Servlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		// Allow CORS
//		response.setHeader("Access-Control-Allow-Origin", "http://localhost:5173");
//		response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
//		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
//
//		response.setContentType("application/json");
//		PrintWriter out = response.getWriter();
//
//		List<Student> students = new ArrayList();
//
//		try {
//			students = StudentDao.getAllStudent(); // your DB method
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//
//		// Convert Java object to JSON
//		Gson gson = new Gson();
//		String json = gson.toJson(students);
//		out.print(json);
//	}
//}
