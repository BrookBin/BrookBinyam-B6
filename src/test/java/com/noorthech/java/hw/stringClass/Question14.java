package com.noorthech.java.hw.stringClass;

public class Question14 {

	public static void main(String[] args) {
		
		String myResult = getSubStr("java training", 2,6);
		String myResult1 = getSubStr("Software Development Engineer in TEST", 11,23);
		String myResult2 = getSubStr("Software Development Engineer in TEST", 21,29);
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		
	}
	
	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		
		String result = " ";
		
		result = str.substring(startingIndex, endingIndex);
		
		
		return result;
		
	}
}
