package Student_Managment_System;



public class Student {

	private int rollno;
	private String name,education,city,email;
	private long phone;
	
	
	public Student(int rollno, String name, String education, long phone, String city, String email) {
		this.rollno = rollno;
		this.name = name;
		this.education = education;
		this.city = city;
		this.phone = phone;
		this.email =email;
	}


	public int getRollno() {
		return rollno;
	}


	public String getName() {
		return name;
	}


	public String getEducation() {
		return education;
	}

	public String getEmail() {
		return email;
	}


	public String getCity() {
		return city;
	}


	public long getPhone() {
		return phone;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setEducation(String education) {
		this.education = education;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", education=" + education + ", city=" + city
				+ ", email=" + email + ", phone=" + phone + "]";
	}


	
	
}
