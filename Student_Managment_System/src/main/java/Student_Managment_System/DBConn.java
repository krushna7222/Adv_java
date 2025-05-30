package Student_Managment_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	
	static Connection conn;
	
	public static Connection getConnection() throws ClassNotFoundException {
		
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment","root","Patil@2003");
			System.out.println("Database Connected Succesfully!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}
