package day28Homework;

public class TheSon extends TheDad {

	private char grade;
	
	public final boolean IS_JAVA_FUN;  // variable has to be initialized
	public final String MY_STATE = "VA";
	static String schoolName = "GMU"; // you can't have a static variable inside of a method 

	public void setGrade(char grade) {
		this.grade = grade;
	}
	public char getGrade() {
		return grade;  // remove print method from the getmethod
	}
	
	public void trapZone() {
		
		char myGrade = 'A';
		
		int myFavNumber= 7;	// initialize myfavNnumber
		System.out.println("My FavNumber" + myFavNumber);
		
		String teamName= "Team";		// initialized teamName
		System.out.println("My Team Name: " + teamName);

				
		System.out.println("My School Name: "+ schoolName);
		
		grade = myGrade; // grade is an int not string
		System.out.println("My Grade: " + grade);
		
		
		setAge(12);		// can't access private variable or an encapsulated variable
		System.out.println("My age " + getAge());
		 
		setCountry("USA");
		System.out.println("Country :" + getCountry()); // use a getter method to access the value
		
	}
	public TheSon() {
		
			IS_JAVA_FUN = true;	
	}
	
	public void moreTrap(char grade) {

		
		this.grade = grade;
		
		//MY_STATE = "CA"; // final variable can't be reinitialized 
		
		setCountry("USA");
		System.out.println(getCountry());
		
		setCity("R"); 
		System.out.println(getCity());
		
		setAge(12); // we can't modify the inhariated method
		System.out.println(getAge());
			
		addNum(3,4);
	
		display();
		
		trapZone();
		
	}
	 
	
}