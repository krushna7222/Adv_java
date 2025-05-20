package jdbc_connection.collable_statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Collable_Statment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
   
        
        //1.Load and register driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        //2. Establish connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","Patil@2003");
        
        
        //3.Create Statement object => it used to execute queries from java application
        CallableStatement cst = con.prepareCall("call getDetail1()");
        
        
        //4. Execute query
        
      boolean result =  cst.execute(); 
      
      
      if(result) {
    	  
      ResultSet rs =cst.getResultSet();
      System.out.println("| eid | name      | dept        | salary   |");
      while(rs.next()) {
    	  System.out.println("  "+rs.getInt(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"     "+rs.getString(4));
      }
      
      }
      
      System.out.println();
      
      if(cst.getMoreResults()) {
    	  
          ResultSet rs =cst.getResultSet();
          
          System.out.println("| eid | name      | dept        | salary   |");
          while(rs.next()) {
        	  System.out.println("  "+rs.getInt(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"     "+rs.getString(4));
          }
          
          }
        
        

        //5.close connection
        con.close();
        
        System.out.println("Success...");
	}

}
