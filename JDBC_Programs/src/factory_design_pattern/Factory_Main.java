package factory_design_pattern;

//Q.Specify the different ways by which we can create an object fro a class?
//1. by using new keyword
//2. by using concept of object cloning
//3. by using factory methods


public class Factory_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Vehicle t1 = new Bike();
		
		Vehicle v1 = FactoryMethod.getObject("Bike");
		Vehicle v2 = FactoryMethod.getObject("Truck");
//		Vehicle v3 = FactoryMethod.getObject("Bus");

		v1.run();
		v2.run();
//		v3.run();

	}

}
