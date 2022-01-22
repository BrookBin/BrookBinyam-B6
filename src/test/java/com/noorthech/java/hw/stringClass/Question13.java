package com.noorthech.java.hw.stringClass;

public class Question13 {

	public static void main(String[] args) {
		
		boolean myResult =isStrtWith("java training", "ing");
		boolean myResult1 =isStrtWith("java training", "ja");
		boolean myResult2 =isStrtWith("java training", "java");
		boolean myResult3 =isStrtWith("java training", "train");
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
		
	}
	
	public static boolean isStrtWith(String strOne, String strTwo) {
		
		boolean result = false;
		
		
		result= strOne.startsWith(strTwo);
		
		return result;
		
	}
	
}
