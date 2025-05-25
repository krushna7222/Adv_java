package jdbc_connection.preapared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

public class Revesring_recourd_in_Select_operation_using_Resultset_interface2 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO Auto-generated method stub
        
  
        
        //1.Load and register driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        //2. Establish connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","Patil@2003");
        
        
        //3.Create Statement object => it used to execute queries from java application
        PreparedStatement pst = con.prepareStatement("select * from emp where dept=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        pst.setString(1, "development");
        
        
        //4. Execute query
        
      ResultSet rc =  pst.executeQuery(); 
      
      System.out.println("| eid | name      | dept        | salary   |");
      while(rc.next()) {
    	  System.out.println("  "+rc.getInt(1)+"   "+rc.getString(2)+"    "+rc.getString(3)+"     "+rc.getString(4));
      }
        
      System.out.println();
      System.out.println("-------Reverse Order-------");
      System.out.println();

        
      while(rc.previous())
      {
    	  
    	  System.out.println("  "+rc.getInt(1)+"   "+rc.getString(2)+"    "+rc.getString(3)+"     "+rc.getString(4));
    	  
      }

        
        

        //5.close connection
        con.close();
        
        System.out.println("Success...");
        
        
    }

}