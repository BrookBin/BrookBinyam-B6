package broken.abstraction2;

//This class should inherit Subway
public class MyChoice extends Subway { // the keyword extends is used when inheriting 
	
	public MyChoice() {
		super("Food", 20); // add constructor and provide the super reference variable with the arguments
		
	}
	@Override 
	public  void setPrice(double price) { // when method overriding, the access modfifer and the method signature needs to match exactly
		System.out.println("New : " + price);
	}

}
