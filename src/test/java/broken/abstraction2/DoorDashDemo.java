package broken.abstraction2;

public class DoorDashDemo {

	public static void main(String[] args) {
		
		//DoorDash obj1 = new DoorDash("John", 123);	// we can't instantiate a interface class	
		//Healthy obj2 = new Healthy();
			
		Subway obj3 = new Subway("Name", 30);// fix spelling mistake, add arguments 
		obj3.setPrice(22.22); // unless we change the object name, we can't access the non overriden methods in Subway class
		
		
		//Subway obj4 = new Chipotle();	// subway and chipotle classes do not have a parent child relationship
		//obj4.fee();
		
		//Chipotle obj4 = new MyChoice();// MyChoice and chipotle classes do not have a parent child relationship
		//obj4.setPrice();
				
		Subway obj5 = new Subway("MD",22);
		
		//obj5.amount = 22; // these variable should be place in the arguments 
		//obj5.name = "MD"; // these variable should be place in the arguments 
		
		System.out.println(obj5.amount);
		System.out.println(obj5.name);
		
		
	}
		

}