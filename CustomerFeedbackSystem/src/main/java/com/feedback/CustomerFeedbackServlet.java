package com.feedback;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

public class CustomerFeedbackServlet extends HttpServlet {

    private static final String URL = "jdbc:mysql://localhost:3306/feedbackdb";
    private static final String USER = "root";
    private static final String PASSWORD = "Patil@2003";

    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found!");
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String feedback = request.getParameter("feedback");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO feedback (name, email, feedback) VALUES (?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, feedback);
                
                int result = stmt.executeUpdate();

                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                if (result > 0) {
                    out.println("<h2>Feedback submitted successfully!</h2>");
                } else {
                    out.println("<h2>Error submitting feedback.</h2>");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM feedback";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                out.println("<h1>Customer Feedback</h1>");
                while (rs.next()) {
                    out.println("<p><strong>Name:</strong> " + rs.getString("name") + "</p>");
                    out.println("<p><strong>Email:</strong> " + rs.getString("email") + "</p>");
                    out.println("<p><strong>Feedback:</strong> " + rs.getString("feedback") + "</p>");
                    out.println("<hr>");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
