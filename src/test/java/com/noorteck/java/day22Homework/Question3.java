package com.noorteck.java.day22Homework;

public class Question3 {


	public static void main(String[] args) {
		
		
		Question3 obj = new Question3();
	
		String myResult = obj.threeEqual(null, 'P', 'B');
		String myResult1 = obj.threeEqual("Java Pro ", 'P', 'B');
		String myResult2 = obj.threeEqual("Lazy mode", 'm', 'C');
		String myResult3 = obj.threeEqual("Training", 'T', ' ');
		
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	
	protected String threeEqual ( String str, char oldChar, char newChar) {
		
		String result = " ";
		
		if ( str == null) {
			
			result = null;
		} else {
			
			result = str.replace(oldChar, newChar);
		}
		
		return result;
	}
}
