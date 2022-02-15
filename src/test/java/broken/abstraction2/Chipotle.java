package broken.abstraction2;

//this class should inherit DoorDash && Healthy
public class Chipotle  implements Doordash, Healthy{

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