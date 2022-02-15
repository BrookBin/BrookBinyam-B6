package broken.abstraction1;

public  class FastFood extends Restaurant { //  implements is not used for abstract class, using for interface
	
	public FastFood() {
		super("Cava", 7, 20);
		
	}
	public void location() { //in order to method override, the method signature and the access modifier has to be the same
			System.out.println("Reston VA");
	}
	@Override
	public void setOperationTime() {
		System.out.println("24/7");
	}
	@Override
	public void specialMenu() {
		System.out.println("Food");
	}
	@Override
	public void lunchMenu() { // missing access modifier, and match parameter to parent class method
		System.out.println("Time");
	}
	@Override
	public void breakfastMenu() { // method need, access modifier and return type need to match parent class method
		System.out.println("Not serving...");
	}
	@Override 
	public void dinnerMenu() {// method need, access modifier and return type need to match parent class method
		System.out.println("7PM-10PM");
	}
	public void display() {
		
		// DISCOUNT = 30.00; // DISCOUNT value can't be reassigned, bc it has the non-access modifier final
		
		luckyNumber = 22; // luckyNumber is of data type int 
		
		waitTime = 0; // waitTime is of data type int
		
		//System.out.println(rating()); // we need to provide the implementation of the method rating
	}
	@Override
	void rating() {
		System.out.println( "Top Rate");
	}
	//public abstract void getInfo() { // we can't create abstract methods in concrete class 
		//System.out.println("This is info");
	//}
	//public abstract void setInfo(); // we can't create  abstract methods in concrete class 

}