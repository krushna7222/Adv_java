package jdbc_connection.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



//5 steps

//drivers => programs that connects hardware with software or software with software/connectors
//1.load(adding driver project) and register(adding driver in memory) driver class
//2.establish connection
//3.create Statement object
//4.execute query
//5.close connection

public class Create_Database {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO Auto-generated method stub
        
        
        //1.Load and register driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        //2. Establish connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Patil@2003");
        
        
        //3.Create Statement object => it used to execute queries from java application
        Statement stmt = con.createStatement();
        
        
        //4. Execute query
        stmt.executeUpdate("create database javaDB");
        
        
        //5.close connection
        con.close();
        
        
        System.out.println("Success...");
        
    }

}