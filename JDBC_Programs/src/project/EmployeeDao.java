package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {
	
	public static void createEmployee(Employee e1) throws Exception  {
		// TODO Auto-generated method stub
		Connection con = DB.connectionDB();;
		PreparedStatement pst = con.prepareStatement(Query.insert);
		pst.setInt(1,e1.getEid());
		pst.setString(2, e1.getName());
		pst.setDouble(3, e1.getSalary());
		pst.setBoolean(4, e1.getisPresent());
		
		pst.executeUpdate();
		con.close();
		System.out.println("Data is Inserted Succesfully...");
	}

	public static void ReadData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = DB.connectionDB();
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(Query.read);
		
		System.out.println("\n| eid | name        | salary     | isPresent |\n");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getDouble(3)+"      "+rs.getBoolean(4));
		}
		
		con.close();
		System.out.println("Data is Displayed...");

		
	}

	public static void updateEmployeeName(int eid, String name) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = DB.connectionDB();
		try {
		PreparedStatement pst = con.prepareStatement(Query.updateName);
		
//		pst.setString(1, "name");
		pst.setString(1, name);
		pst.setInt(2, eid);
		
		pst.executeUpdate();
		
		con.close();
		System.out.println("Name is Updated Succesfully...");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

	public static void updateEmployeeSalary(int eid, double salary) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = DB.connectionDB();
		PreparedStatement pst = con.prepareStatement(Query.updateSalary);
		pst.setDouble(1, salary);
		pst.setInt(2, eid);
		
		pst.executeUpdate();

		con.close();
		System.out.println("Salary is Updated Succesfully...");
	}

	public static void updateEmployeePresent(int eid, boolean isPresent) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Connection con = DB.connectionDB();
		PreparedStatement pst = con.prepareStatement(Query.updatePresenty);
		pst.setBoolean(1, isPresent);
		pst.setInt(2, eid);
		
		pst.executeUpdate();

		con.close();
		System.out.println("Presenty is Updated Succesfully...");
	}

	public static void deleteEmployee(int eid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = DB.connectionDB();
		PreparedStatement pst = con.prepareStatement(Query.delete);
		pst.setInt(1, eid);
		
		pst.executeUpdate();

		con.close();
		System.out.println("Employee is Deleted Succesfully...");
	}



}
