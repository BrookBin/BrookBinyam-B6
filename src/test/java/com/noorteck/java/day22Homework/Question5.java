package com.noorteck.java.day22Homework;

public class Question5 {
	
	public static void main(String[] args) {
		
		String myResult = removeSpace(null);
		String myResult1 = removeSpace("  Java Training   ");
		String myResult2 = removeSpace("    I    like to practice   ");
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		
	}
	
	
	public static String removeSpace(String strOne) {
		
		String result = " ";
		
		if (strOne == null) {
			
			result = null;
		} else {
			
			result = strOne.trim();
		}
		
		
		return result;
	}

}
