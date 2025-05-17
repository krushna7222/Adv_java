package jdbc_connection.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



//5 steps

//drivers => programs that connects hardware with software or software with software/connectors
//1.load(adding driver project) and register(adding driver in memory) driver class
//2.establish connection
//3.create Statement object
//4.execute query
//5.close connection

public class Select_operation_using_Resultset_interface {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO Auto-generated method stub
        
        
        //1.Load and register driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        //2. Establish connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","Patil@2003");
        
        
        //3.Create Statement object => it used to execute queries from java application
        Statement stmt = con.createStatement();
        
        
        //4. Execute query
//        stmt.executeUpdate("insert into emp values(101,'Raj','Testing',34172.85)");

//        stmt.executeUpdate("update emp set name='Raj Kumar' where eid=101");

//        stmt.executeUpdate("delete from emp where eid=104");
        
        
      ResultSet rc =  stmt.executeQuery("select * from emp"); 
      
      System.out.println("| eid | name      | dept        | salary   |");
      while(rc.next()) {
    	  System.out.println("  "+rc.getInt(1)+"   "+rc.getString(2)+"    "+rc.getString(3)+"     "+rc.getString(4));
      }
        
        

        
        

        //5.close connection
        con.close();
        
        System.out.println("Success...");
        
    }

}