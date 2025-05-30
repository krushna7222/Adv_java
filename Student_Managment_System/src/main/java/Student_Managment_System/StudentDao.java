package Student_Managment_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao {
	


	public static int save(Student s1) throws ClassNotFoundException, SQLException {
		
		Connection con =  DBConn.getConnection();
		
		PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?,?,?)");
		
		pst.setInt(1, s1.getRollno());
		pst.setString(2, s1.getName());
		pst.setString(3, s1.getEducation());
		pst.setLong(4, s1.getPhone());
		pst.setString(5, s1.getCity());
		pst.setString(6, s1.getEmail());
		
		int result = pst.executeUpdate();
		
		pst.close();
		con.close();
		
		return result;
	}

	public static ArrayList getAllStudent() throws ClassNotFoundException, SQLException {
		
		Connection con = DBConn.getConnection();
		
		PreparedStatement pst = con.prepareStatement("select * from student");
		
		ResultSet rs = pst.executeQuery();
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		while (rs.next()) {
			Student s1 = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4),rs.getString(5),rs.getString(6));
			
			list.add(s1);
		}
		
		pst.close();
		con.close();
		
		return list;

	
		
	}

	public static int deleteStudent(int rno) throws ClassNotFoundException, SQLException {

		Connection con = DBConn.getConnection();

		PreparedStatement pst = con.prepareStatement("delete from student where rollno=?");
		
		pst.setInt(1, rno);
		
		int result = pst.executeUpdate();
		
		return result;
	}

	public static Student getSingleStudent(int rno) throws ClassNotFoundException, SQLException {
		
		Connection con = DBConn.getConnection();
		
		PreparedStatement pst = con.prepareStatement("select * from student where rollno=?");
		
		pst.setInt(1, rno);
		
		ResultSet rs = pst.executeQuery();
		
		Student s1 = null;
		
		while(rs.next()) {
			 s1 = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4),rs.getString(5),rs.getString(6));
		}
		return s1;
		
	}

	
	public static int updateStudent(Student s1) throws ClassNotFoundException, SQLException {
		
		Connection con = DBConn.getConnection();
		
		PreparedStatement pst = con.prepareStatement("update student set name=?,email=?,phone=?,education=?,city=? where rollno=?");
		
		pst.setString(1, s1.getName());
		pst.setString(2, s1.getEmail());
		pst.setLong(3, s1.getPhone());
		pst.setString(4, s1.getEducation());
		pst.setString(5, s1.getCity());
		pst.setInt(6, s1.getRollno());
		
		int result =  pst.executeUpdate();
		System.out.println(result);
		return result;
		
	}

}
