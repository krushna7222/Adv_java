package project;

public class Query {

	static String insert="insert into employee values(?,?,?,?)";
	static String updateName="update employee set name=? where eid = ?";
	static String updateSalary="update employee set salary=? where eid = ?";
	static String updatePresenty="update employee set isPresent=? where eid = ?";
	static String delete="delete from employee where eid = ?";
	static String read="select * from employee";
	
}
