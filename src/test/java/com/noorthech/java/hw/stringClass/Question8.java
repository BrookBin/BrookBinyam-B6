package com.noorthech.java.hw.stringClass;

public class Question8 {
	
	public static void main (String args[]) {
		
		char myResult = getCharacter("java training", 2);
		char myResult1 = getCharacter("java training", 5);
		char myResult2 = getCharacter("java training", 8);
		char myResult3 = getCharacter("java training", 22);
		
		
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	
	
	public static char getCharacter(String strOne, int indexNum) {
		
		char result = ' ';
		
		if( strOne.length() < indexNum) {
			
			result = '?';
		} else {
			
			result = strOne.charAt(indexNum);
		}
		
		return result;
	}

	
}
