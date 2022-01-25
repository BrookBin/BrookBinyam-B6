package com.noorteck.java.day22Homework;

public class Question4 {

	public static void main(String[] args) {
		
		String myResult = getSubStr(null, 2, 6);
		String myResult1 = getSubStr("java training", 2, 6);
		String myResult2 = getSubStr("SoftWare Development Engineer in TEST", 11, 23);
		String myResult3 = getSubStr("SoftWare Development Engineer in TEST", 11, 23);
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
		
	}
	
	
	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		
		String result = " ";
		
		if( str == null) {
			
			result = null;
		} else {
			
			result = str.substring(startingIndex, endingIndex);
		}
		
		return result;
	}
}
