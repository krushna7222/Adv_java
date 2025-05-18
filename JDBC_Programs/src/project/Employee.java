package project;

public class Employee {

	private int eid;
	private String name;
	private double salary;
	private boolean isPresent;
	
	
	public Employee(int eid, String name, double salary, boolean isPresent) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.isPresent = isPresent;
	}


	public int getEid() {
		return eid;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public boolean getisPresent() {
		return isPresent;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", isPresent=" + isPresent + "]";
	}

}
