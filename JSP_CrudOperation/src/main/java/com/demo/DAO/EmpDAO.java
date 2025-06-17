package com.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Employee;

public class EmpDAO {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeesystem", "root", "Patil@2003");
			System.out.println("Database Connected....");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int Save(Employee e) {
		Connection con = EmpDAO.getConnection();
		int status = 0;
		try {
			PreparedStatement p = con
					.prepareStatement("insert into emp1 (name,password,email,sex,country) values(?,?,?,?,?)");

			p.setString(1, e.getName());
			p.setString(2, e.getPassword());
			p.setString(3, e.getEmail());
			p.setString(4, e.getSex());
			p.setString(5, e.getCountry());

			status = p.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return status;
	}

	public static List<Employee> getAllEMployee() {
		ArrayList<Employee> list = new ArrayList();

		Connection con = EmpDAO.getConnection();

		try {
			PreparedStatement p = con.prepareStatement("select * from emp1");

			ResultSet rs = p.executeQuery();

			while (rs.next()) {
				Employee e = new Employee();

				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setPassword(rs.getString("password"));
				e.setEmail(rs.getString("email"));
				e.setSex(rs.getString("sex"));
				e.setCountry(rs.getString("country"));

				list.add(e);

			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return list;
	}

	public static Employee getEMployee(int id) {
		Connection con = EmpDAO.getConnection();
		Employee e = new Employee();
		try {
			PreparedStatement p = con.prepareStatement("select * from emp1 where id=?");

			p.setInt(1, id);

			ResultSet rs = p.executeQuery();

			while (rs.next()) {

				e.setId(rs.getInt("id"));

				e.setName(rs.getString("name"));
				e.setPassword(rs.getString("password"));
				e.setEmail(rs.getString("email"));
				e.setSex(rs.getString("sex"));
				e.setCountry(rs.getString("country"));

			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return e;

	}

	public static int Update(Employee e) {
		int status = 0;

		Connection con = EmpDAO.getConnection();

		try {
			PreparedStatement p = con
					.prepareStatement("update emp1 set name=?,password=?,email=?,sex=?,country=? where id=? ");

			p.setString(1, e.getName());
			p.setString(2, e.getPassword());

			p.setString(3, e.getEmail());
			p.setString(4, e.getSex());
			p.setString(5, e.getCountry());

			p.setInt(6, e.getId());

			status = p.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return status;
	}

	public static int Delete(Employee u) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("delete from emp1 where id=?");
			ps.setInt(1, u.getId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

}
