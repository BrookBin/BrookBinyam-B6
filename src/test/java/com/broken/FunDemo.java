package com.broken;

public class FunDemo {
	
	public static void main(String[] args) {
		
		//The Grandpa Object	
		TheGrandpa grandpaObj = new TheGrandpa();
	
		grandpaObj.setCountry("USA");	
		System.out.println(grandpaObj.getCountry());
		
		grandpaObj.addNum(2,5);
		grandpaObj.display();   
		
	
		//TheDad object
		
		TheDad dadObj = new TheDad(); // remove the parameter int the object
		
		dadObj.setAge(66);
		System.out.println(dadObj.getAge());
		
		// dadObj.age = 12;  // age is private can't be accessed without a getter and setter method
		dadObj.setAge(33);
			
		System.out.println(dadObj.getAge()); // remove boolean 
		
		// int result = dadObj.favNumWho(7); // this method doesn't existing in theDad/grandpa/theson class
		
		 grandpaObj.setCountry("Canada"); // this method belongs to the grandpa class
		
		System.out.println(grandpaObj.getCountry()); // this method belongs to the grandpa class
		
		//TheSon object 
		
		TheSon sonObj = new TheSon(); // remove the parameter 
		
		
		sonObj.setGrade('A');
		System.out.println("passting" + sonObj.getGrade());
	
		
		sonObj.addNum(3, 5);
		
		grandpaObj.setCity("Reston");
		
		System.out.println(grandpaObj.getCity()); // this method belongs to the grandpa class
		
		sonObj.trapZone(); // trapZone is private and can't be accessed
		
		 sonObj.moreTrap('a'); // remove boolean return type, the methods doesn't have a return type
		
		System.out.println("Yes :)");
	}

}