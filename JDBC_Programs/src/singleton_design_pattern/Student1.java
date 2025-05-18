package singleton_design_pattern;

public class Student1 {
	
	public static Student1 object;
	
	private Student1() {
		
	}
	
	static Student1 getSingltonClass() {
		if (object==null) {
			
			synchronized (Student1.class) {
				if (object==null) {
					Student1 s1 = new Student1();
					object=s1;
				}
			}
			
		}
		return object;
		
	}
	
	void display() {
	System.out.println("Display method in Singleton Method...");
	}

}
