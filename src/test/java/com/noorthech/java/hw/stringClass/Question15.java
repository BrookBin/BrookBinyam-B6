package com.noorthech.java.hw.stringClass;

public class Question15 {

	public static void main(String[] args) {
		
		String myResult = removeSpace(" Java Training   ");
		
		String myResult1 = removeSpace("    I   like to practice     ");
		
		System.out.println(myResult);
		System.out.println(myResult1);
	}
	
	public static String removeSpace(String strOne) {
		
		String result = " ";
		
		result = strOne.trim();
		
		return result;
		
	}
	
}
