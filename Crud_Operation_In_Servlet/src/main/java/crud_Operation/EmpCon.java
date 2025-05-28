package crud_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EmpCon {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Connection con =null;
		
        Class.forName("com.mysql.cj.jdbc.Driver");

         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_servlet","root","Patil@2003");
		
         System.out.println("Java Database Connectivity Done...");
         
		return con;
	}
	
	public static int save(Emp e) throws ClassNotFoundException, SQLException {
		Connection con = EmpCon.getConnection();
		
//		Emp e = new Emp()
		
		PreparedStatement pst = con.prepareStatement("insert into empdata values(?,?,?,?,?)");
		
		pst.setInt(1,e.getId());
		pst.setString(2, e.getName());
		pst.setString(3, e.getPassword());
		pst.setString(4, e.getEmail());
		pst.setString(5, e.getCountry());
		
		int i = pst.executeUpdate();
		
		pst.close();
		con.close();
		
		return i;
	}
	
	
	public static ArrayList<Emp> view() throws ClassNotFoundException, SQLException {
		  ArrayList<Emp> list = new ArrayList<>();
		  
		Connection con = EmpCon.getConnection();

		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from empdata");
		
		
		while (rs.next()) {
	        Emp emp = new Emp();
	        emp.setId(rs.getInt("id"));
	        emp.setName(rs.getString("name"));
	        emp.setPassword(rs.getString("password"));
	        emp.setEmail(rs.getString("email"));
	        emp.setCountry(rs.getString("country"));

	        list.add(emp);
	    }

	    stmt.close();
	    con.close();

	    return list;
		
	}
	
	public static Emp getSingleEmployee(int id) {
		Emp emp = new Emp();;
		 try {
			Connection con = EmpCon.getConnection();
			
			PreparedStatement pst = con.prepareStatement("select * from empdata where id=?");
			pst.setInt(1, id);
			
			ResultSet rs =  pst.executeQuery();
			
			if(rs.next()) {
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setPassword(rs.getString(3));
				emp.setEmail(rs.getString(4));
				emp.setCountry(rs.getString(5));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return emp;
	}
	
	 public static int update(Emp e){  
         int i=0;  
         try{  
                Connection con=EmpCon.getConnection();  
             PreparedStatement ps=con.prepareStatement("update empdata set name=?,password=?,email=?,country=? where id=?");  
            
             
             
             ps.setString(1,e.getName());  
             ps.setString(2,e.getPassword());  
             ps.setString(3,e.getEmail());  
             ps.setString(4,e.getCountry());  
             ps.setInt(5,e.getId());  
               
             i=ps.executeUpdate();  
               
             con.close();  
         }catch(Exception ex){ex.printStackTrace();}  
           
         return i;  
     }

	public static int delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = EmpCon.getConnection();
		
		
		PreparedStatement pst = con.prepareStatement("Delete from empdata where id=?");
		
		pst.setInt(1, id);
		
		int i = pst.executeUpdate();
		
		pst.close();
		con.close();
		
		return i;
	}
	
}
