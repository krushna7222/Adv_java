package factory_design_pattern;

public class FactoryMethod {
	
	public static Vehicle getObject(String s) {
		
		if (s.equalsIgnoreCase("Truck")) {
			return new Truck();
		}
		else if (s.equalsIgnoreCase("Bike")) {
			return new Bike();
		}
		else
		 {
			return new Bike();
		}
	}

}
