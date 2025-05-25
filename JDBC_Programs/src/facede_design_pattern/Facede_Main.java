package facede_design_pattern;

class Product
{
	void viewProduct() {
		System.out.println("You are in View Product Method...");
	}
}

class Cart
{
	void addToCart() {
		System.out.println("You are in Add to Cart Method...");
	}
}

class Payment
{
	void makePayment() {
		System.out.println("You are in Payment Method...");
	}
}

class Facade
{
	Product p1;
	Cart c1;
	Payment py;
	
	Facade(){
		p1 = new Product();
		c1 = new Cart();
		py = new Payment();
	}
	
	void callAllFacedMethods()
	{
		p1.viewProduct();
		c1.addToCart();
		py.makePayment();
	}
	
}
public class Facede_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Facade f1 = new Facade();
		f1.callAllFacedMethods();

	}

}
