package crud_Operation;

public class Emp {
	
	private int id;
	private String name,password,email,country;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getCountry() {
		return country;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", country="
				+ country + "]";
	}
}
