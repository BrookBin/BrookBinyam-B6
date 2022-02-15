package broken.abstraction2;

public interface Healthy {
	public static final int amount = 123; // values need to be assinged to final variables 
	 public static final String name = "Tom";	 // all instance variable need to be public static final variables 
	//public Healthy(int calorie) { interface can't have a constructor
		//System.out.println("Calorie: " + calorie );
	//}
	
	//public Healthy(int calorie, int amount) {// interface can't have a constructor
		//System.out.println("Amount: " + amount);
		//System.out.println("Calorie:" + calorie);
	//}
	
	public abstract void getCalories(); // abstract method can't have a method body, remove the argument 
	
	public abstract void setCalories();
}