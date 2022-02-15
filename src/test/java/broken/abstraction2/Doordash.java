package broken.abstraction2;

public interface Doordash {
	
	//public Doordash(String name, int duration) {	// interface deosn't have a constructor 
		//System.out.println("Name:" + name);
		//System.out.println("Duraiton:" + duration);
	//}
	
	public abstract void delivery();	
	public abstract void fee();	
	public abstract void pickUp(); // Each method in interface class is public abstract 
		
	default void getLocation() {	// change return type to void
		System.out.println("Rest Town Center");
	}
	
	public static String setLocation(String location) { // Change method return type to String 
		location = "Reston";	
		System.out.println(location);
		return location;
	}
}