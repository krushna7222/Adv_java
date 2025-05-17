package metadata_interface;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

//DatabaseMetaData interface is used to get metadata(information) about database
public class DatabaseMetaData_Demo {

    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO Auto-generated method stub

        
//        Class.forName("com.mysql.jdbc.Driver");
        
    Connection con    =DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","Patil@2003");
        
    //in this program, there is no need to create statement interface object,
    //bcz we are not firing any query here, we just want to get the information of database
    //Statement stmt = con. createStatement(); 
    
    DatabaseMetaData dbmd =  con.getMetaData(); 
    
         
    
    
    
         System.out.println("the driver name is : "+dbmd.getDriverName());
         
         System.out.println("the driver version is : "+dbmd.getDriverVersion());
        
         System.out.println("the user name is : "+dbmd.getUserName()); //root
         
         System.out.println("the product name is : "+dbmd.getDatabaseProductName());
         
         System.out.println("the product version is : "+dbmd.getDatabaseProductVersion());
          
    }
}
