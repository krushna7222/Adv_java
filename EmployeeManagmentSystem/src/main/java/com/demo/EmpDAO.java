package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	//save
	//update
	//delete
	//getByID
	//GetAllData

	     public static  Connection getConnection()
	     {
	    	   
	    	   Connection con =null;
	    	          
	    	         try {
	    	        	 Class.forName("com.mysql.cj.jdbc.Driver");  
						con=DriverManager.getConnection("jdbc:mysql://localhost/employeedb","root","Patil@2003");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	   
	    	         return con;
	    	     
	    	 
	    	 
	     }
	     
	          public static int save(Employee e) 
	          {
	        	  
	        	  Connection con= EmpDAO.getConnection();
	        	  
	        	 int status=0;
	        	
				try {
					 String s1 = "insert into emp (name,password,email,country) values (?,?,?,?)";
		        	  
					  PreparedStatement p = con.prepareStatement(s1);
					
					
				      
//	        	     String n1 = e.getName();
//	        	  
//	        	     p.setString(1, n1);
	        	  
	        	  
	        	       p.setString(1, e.getName());
	        	  
	        	       p.setString(2, e.getPassword());
	        	       p.setString(3, e.getEmail());
	        	       
	        	       p.setString(4, e.getCountry());
	        	       
	        	       
	        	      status= p.executeUpdate();
					
					
				} catch (SQLException e1) {
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	  
	        
	        	  
	        	      
	        	      return status;
	        	  
	        	  
	          }
	     
	     
	        public static List<Employee> getAllEmployee()
	        {
	        	
	        	
	        	Connection con= EmpDAO.getConnection();
	        	List<Employee>  list = new ArrayList<Employee>();
	        	try {
					PreparedStatement p= con.prepareStatement("select * from emp");
			
	        	
	        	                    ResultSet rs= p.executeQuery();
	        	
	        	                     while(rs.next())
	        	                     {
	        	                    	 Employee e= new Employee();
	        	                    	 
	        	                    	 e.setId(rs.getInt(1));
	        	                    	 e.setName(rs.getString(2));
	        	                    	 e.setPassword(rs.getString(3));
	        	                    	 e.setEmail(rs.getString(4));
	        	                    	 e.setCountry(rs.getString(5));
	        	                    	 list.add(e);
	        	                     }
	        	                    
	        	
	        	
	        	
	        	
	        	} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	
	        	
	        	
	        	
	        	
	        	 return list;
	        	
	        }
	          
	          
	          
	       public static Employee getEMployee(int id)
	       {
	    	   Connection con= EmpDAO.getConnection();
	    	   Employee e= new Employee();
	    	   try {
				PreparedStatement p= con.prepareStatement("select * from emp where id=?");
			
				       p.setInt(1, id);
	    	        
				ResultSet rs= p.executeQuery();
				
				
				     while(rs.next())
				     {
				    	 
				    	 e.setId(rs.getInt(1));
                    	 e.setName(rs.getString(2));
                    	 e.setPassword(rs.getString(3));
                    	 e.setEmail(rs.getString(4));
                    	 e.setCountry(rs.getString(5));
				    	    
				     }
	    	        
	    	        
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	   
	    	   
	    	   
	    	   
	    	   return e;
	       }
	          
	          
	          
	          public static int  Update(Employee e)
	          {
	        	  Connection con = EmpDAO.getConnection();
	        	  int status=0;
	        	  try {
						PreparedStatement p= con.prepareStatement("update  emp set name=? ,password=?,email=?,country=? where id=?");
						
				  p.setString(1, e.getName());
	        	  
       	       p.setString(2, e.getPassword());
       	       p.setString(3, e.getEmail());
       	       
       	       p.setString(4, e.getCountry());
	        	  
					p.setInt(5, e.getId());
					
					
					
					  status=p.executeUpdate();
	        	  
	        	  
	        	  
	        	  } catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  return status;
	          }

			public static int delete(int id) throws SQLException {
				
	        	  Connection con = EmpDAO.getConnection();
	        	  
	        	  PreparedStatement pst = con.prepareStatement("delete from emp where id=?");
	        	  pst.setInt(1, id);
	        	  
	        	 int result = pst.executeUpdate();
	        	 
				return result;
			}
	          
	          
	
}
