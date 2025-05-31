package Student_Managment_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


@WebServlet("/Edit_Servlet")
public class Edit_Servlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		

		int rno = Integer.parseInt(request.getParameter("rollno"));
		
		PrintWriter out = response.getWriter();

		Student stud = null;
		
		try {
			 stud = StudentDao.getSingleStudent(rno);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(stud.getName());
		
		out.print("<body style=\"font-family: Arial, sans-serif; background-color: #eef2f3; padding: 40px;\">");
		out.print("<div style=\"max-width: 500px; margin: auto; background: #fff; padding: 30px; border-radius: 10px; box-shadow: 0 0 15px rgba(0,0,0,0.1);\"> ");
		out.print("<h2 style=\"text-align: center; color: #333;\">Edit Student Information</h2>");
		out.print("<form action=\"Edit_Servlet2\" method=\"post\"> ");
		out.print("<label style=\"display: block; margin-top: 15px; font-weight: bold;\">Roll No:</label>");
		out.print("<input type=\"number\" name=\"rollno\" readonly " +
		          "value=\"" + stud.getRollno() + "\" " +
		          "style=\"background-color: #e5e7eb; width: 100%; padding: 10px; margin-top: 5px; border: 1px solid #ccc; border-radius: 5px;\" />");
		out.print("<label style=\"display: block; margin-top: 15px; font-weight: bold;\">Name:</label>");
		out.print("<input type='text' name='name' value='"+stud.getName()+"' style=\"width: 100%; padding: 10px; margin-top: 5px; border: 1px solid #ccc; border-radius: 5px; />");
		out.print(" <label style=\"display: block; margin-top: 15px; font-weight: bold;\">Email:</label>");
		out.print("<input type=\"email\" name=\"email\"   value="+stud.getEmail()+" style=\"width: 100%; padding: 10px; margin-top: 5px; border: 1px solid #ccc; border-radius: 5px;\" />");
		out.print(" <label style=\"display: block; margin-top: 15px; font-weight: bold;\">Phone:</label>");
		out.print("<input type=\"tel\" name=\"phone\"    value="+stud.getPhone()+"  style=\"width: 100%; padding: 10px; margin-top: 5px; border: 1px solid #ccc; border-radius: 5px;\" />");
		out.print(" <label style=\"display: block; margin-top: 15px; font-weight: bold;\">Education:</label>");
		out.print("<input type=\"text\" name=\"education\"    value="+stud.getEducation()+"  style=\"width: 100%; padding: 10px; margin-top: 5px; border: 1px solid #ccc; border-radius: 5px;\" />");
		out.print(" <label style=\"display: block; margin-top: 15px; font-weight: bold;\">City:</label>");
		out.print("<input type=\"text\" name=\"city\"   value="+stud.getCity()+" style=\"width: 100%; padding: 10px; margin-top: 5px; border: 1px solid #ccc; border-radius: 5px;\" />");
		
		out.print("<button type=\"submit\"   style=\"margin-top: 25px; width: 100%; padding: 12px; background-color: #007bff; color: white; font-size: 16px; border: none; border-radius: 5px; cursor: pointer;\">Edit Student Detail</button>");

	}

}
