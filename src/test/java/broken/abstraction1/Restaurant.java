package broken.abstraction1;

public abstract class Restaurant {
	public final double DISCOUNT = 20.00;
	public int luckyNumber= 12;
	public  int waitTime= 20;
	public String name;
	
	public Restaurant(String name, int luckyNumber, int waitTime) {
		this.name = name;  // add this keyword to differentiate between instance variable and locatl variable
		this.luckyNumber = luckyNumber;
		this.waitTime = waitTime;
		
		System.out.println(this.name);
		System.out.println(this.waitTime);
		System.out.println(this.luckyNumber);
	}

	public abstract void location(); // abstract method can't be static, if static, it can't be accessed overridden 
	
	public  void setOperationTime() {// Static methods can't be overridden, remove static 
		System.out.println("Monday-Friday");
	}
	
	public abstract void specialMenu(); // abstract method can't be final, final keyword prevents method overriding, also include abstract keyword
	
	
	abstract void rating();
	
	public abstract void breakfastMenu(); // abstract method can't have a method body
		
	
	
	public abstract void lunchMenu();

	public abstract void dinnerMenu();
}