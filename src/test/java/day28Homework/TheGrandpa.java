package day28Homework;

class TheGrandpa { 

	private String country;
	private String city;
	
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	
	 public void setCity(String city) {//change rivet to public so it can be accessed by theson
		this.city = city;
	}
	
	 public String getCity() {//removed private access modifier to access from child class
		return city;
	}
 
 
	public void display() {// method return type void
		
		System.out.println("Country: " + country);
		System.out.println("City: " + city);
		
		addNum(11, 4); 
		
	}
	
	public int addNum(int a, int b) {// removed private accss modifier so the method can be accesed from theson
		
		int result = 0;      // return type is int 
		
		result = a+b;
		
		return result;
	}
	
}