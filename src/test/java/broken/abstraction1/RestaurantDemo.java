package broken.abstraction1;

public class RestaurantDemo {
	
	public static void main(String[] args) { // remove extra semicolon, string needs to be spelled with capital s
		
		Restaurant obj1 = new FastFood(); // we can't create an object of an abstract class
		obj1.location();
		System.out.println(obj1.DISCOUNT);
		
		
		Restaurant obj2 = new FastFood(); // restaurant -Spelling error
		//obj2.getInfo(2); // get and set mothods have been removed from FastFood class
	//	obj2.setInfo(); //get and set mothods have been removed from FastFood class
		
		FastFood obj3 = new FastFood(); // remove arguments 
		
		System.out.println(obj3.DISCOUNT); //DISCOUNT value can't be reassigned, bc it has the non-access modifier final
		
		obj3.dinnerMenu(); // remove the print command
		obj3.lunchMenu(); // remove the print command
		
		System.out.println();
		
		
		
	}
 

}