package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
		
	
	static Connection con;
	
	public static Connection connectionDB() throws ClassNotFoundException, SQLException {
		
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    //2. Establish connection
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","Patil@2003");
    
    System.out.println("DataBase Connected...");
	
    
//    Statement stmt = con.createStatement();
    
//    stmt.executeUpdate("create table employee(eid int primary key,name varchar(30),salary double,isPresent boolean)");
    
//    con.close();
    
//    System.out.println("Employee Table Created Succesfully...");

       return con;
	}	
}
