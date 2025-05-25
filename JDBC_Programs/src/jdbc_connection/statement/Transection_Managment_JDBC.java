package jdbc_connection.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
Transaction Management in JDBC is the process of combining all related operations into 
a single unit and executing on the rule "either all or none", is called Transaction Management in JDBC

e.g

t1
ram wants to send money to sham
1. ram checks balance
2.sending that amt to sham
3. amt received by sham


t2
wants to withdraw money from ATM
1.insert card
2. insert amt
3. insert pin
4. debited from your acc
5.received ca

*/

public class Transection_Managment_JDBC {


    public static void main(String[] args) throws Exception {
      
        Connection con = null;   //we are declaring the con variable here of Connection type..bcz,if we declared this con variable inside try block so we cannot be able to access it in catch block..so we declared this con variable outside the try catch block
        Statement st = null;
       

        try {

//         Class.forName("com.mysql.jdbc.Driver");
         
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDb", "root", "Patil@2003");
     
            
            con.setAutoCommit(false);
            
            st = con.createStatement();
//            st.executeUpdate("create table stud1(id int,name varchar(56),marks double,isPresent boolean)");
            st.executeUpdate("insert into stud1 values (111,'RAM',77.7,true)");
            st.executeUpdate("insert into stud1 values (112,'GITA',974.7,false)");
            st.executeUpdate("insert into stud1 values (113,'SHAM',664.7,true)");
           
            
            con.commit();   //commit means save all the above changes into the database
            
            System.out.println("Transaction is commited.");
            st.close();
            con.close();
            
        }  //try close
        
       
        catch (Exception e) {
           System.out.println("transaction rollback");
           con.rollback();  //rollback means starting all the operations from the beginning
        }
    }
}
//factory design pattern   main( object cre),=> factorymethod()=> shoes ,icecra