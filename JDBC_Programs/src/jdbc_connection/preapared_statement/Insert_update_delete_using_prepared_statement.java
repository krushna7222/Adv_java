package jdbc_connection.preapared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_update_delete_using_prepared_statement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		  
        //1.Load and register driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        //2. Establish connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","Patil@2003");
        
        
        //Insert
        
//        //3.Create Statement object => it used to execute queries from java application
//        PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?,?)");
//        
//        pst.setInt(1, 201);
//        pst.setString(2, "Sujit");
//        pst.setString(3, "Marketing");
//        pst.setDouble(4, 45425.225);
//
//        
//        
//        //4. Execute query
//        
//        
//        int i = pst.executeUpdate();
//        System.out.println(i+" Query Updated...");
        
        
        
        //Update
        
//      //3.Create Statement object => it used to execute queries from java application
//        PreparedStatement pst = con.prepareStatement("update emp set dept=? where eid=?");
//        
//        pst.setString(1, "Sales");
//        pst.setInt(2, 101);
//        
//        
//        //4. Execute query
//        
//        
//        int i = pst.executeUpdate();
//        System.out.println(i+" Query Updated...");
        
        
        
        //Delete
        
        
//      //3.Create Statement object => it used to execute queries from java application
//      PreparedStatement pst = con.prepareStatement("delete from emp where eid=?");
//      
//      pst.setInt(1, 101);
//      
//      
//      //4. Execute query
//      
//      
//      int i = pst.executeUpdate();
//      System.out.println(i+" Query Updated...");
        
        
        


        
        
        //5.close connection
        con.close();
        
        System.out.println("Success...");
        

	}

}
