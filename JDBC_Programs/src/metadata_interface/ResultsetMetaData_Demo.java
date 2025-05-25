package metadata_interface;


//ResultSetMetaData(used to get information about table) => metadata(data about data)
//DatabaseMetaData(used to get information about database)
   
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetMetaData_Demo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      // TODO Auto-generated method stub

          
//           Class.forName("com.mysql.jdbc.Driver");    //1
            
            Connection con  =DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","Patil@2003");  //2
            
            Statement st =   con.createStatement();    //3
            
         
            
           ResultSet rs=  st.executeQuery("select * from emp");   //4//create,insert,dle
           
           while(rs.next())
             {
             
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
                 
             }
             System.out.println();
           //ResultSetMetaData is used to get metadata(information) about table

             ResultSetMetaData  rsmd   =rs.getMetaData();    // here,getMetaData() is used to return the object of  ResultSetMetaData
            
            System.out.println("total columns of stud table : "+rsmd.getColumnCount()); //4
            
            System.out.println("column present at 3rd index in stud table : "+rsmd.getColumnName(3)); //sal
            
            System.out.println("column type of 3rd column : "+rsmd.getColumnTypeName(3)); //double
            

            System.out.println("the table name is  : "+rsmd.getTableName(1)); //emp
            
          //  rsmd.
            
            con.close();   //5
            
      }
  }
