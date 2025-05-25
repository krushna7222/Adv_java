package jdbc_connection.statement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ALL_crud_jdbc {

    public static void main(String[] args)  throws ClassNotFoundException, SQLException {
        
          
          //1.load and register driver class
          Class.forName("com.mysql.cj.jdbc.Driver");   //database dependent
          
          
          //2.establish connection
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","Patil@2003");  
          
        
          //3.create Statement  object=> it used to execute queries from java application to database
          Statement stmt = con.createStatement();
         
          
          
          //4.execute query
       stmt.executeUpdate("create table stud(id int primary key,name varchar(45),city varchar(66))");
         System.out.println("table created...........");
         
         
       stmt.executeUpdate("insert into stud values(1,'harsh','pune')");
       stmt.executeUpdate("insert into stud values(2,'avinash','nagpur')");
       stmt.executeUpdate("insert into stud values(3,'ketan','mumbai')");
       System.out.println("\nData inserted...........");
        
       
       
       stmt.executeUpdate("update stud set city='nasik' where id=2");
       System.out.println("\nData updated...........");
        
       
       stmt.executeUpdate("delete from stud where id=3");
       System.out.println("\nData deleted...........");
        
      ResultSet rs =stmt.executeQuery("select * from stud");
      
      System.out.println("\n\nData display...........");
        
      while(rs.next())
      {
          System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));  
      }
       
       
        //5.close connection
        con.close();
          
        System.out.println("success...");  
    }
}

