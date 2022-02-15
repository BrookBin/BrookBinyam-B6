package broken.abstraction2;

// this class should inert DoorDash && Healthy

public class Subway implements Doordash, Healthy { // to inherit an interface, use the keyword implements
	
	public Subway(String name, int duration) {
		//super(name, duration); // parent class deosn't have a constructor
		System.out.println("name:" + name);
		System.out.println("duration: " + duration);
	}
	
	public void setPrice(double price) {
		System.out.println("Price: "+ price);
	}
	@Override
	public void delivery() {
		System.out.println("mail");
	}
	@Override
	public void fee() {
		System.out.println("Free");
	}
	@Override
	public void pickUp() {
		System.out.println("12 Pm");
	}
	@Override
	public void getCalories() {
		System.out.println("12 Pm");
	}
	@Override
	public void setCalories() {
		System.out.println("12 Pm");
	}
}