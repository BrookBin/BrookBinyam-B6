package com.noorteck.java.day22Homework;

public class Question1 {
	
	public static void main(String[] args) {
		
		Question1 obj = new Question1();
		
		
		String myResult = obj.toUpper("Pro");
		String myResult1 = obj.toUpper("java");
		String myResult2 = obj.toUpper(null);
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		
	}
	
	String toUpper(String strOne) {
		
		String result = " ";
		
		if( strOne == null) {
			
			result = null;
			
		}else {
			
			result = strOne.toUpperCase();
		}
		
		return result;
	}

}
