package com.noorthech.java.hw.stringClass;

public class Question10 {

	public static void main(String[] args) {
		
		Question10 obj = new Question10();
		
		boolean myResult = obj.isEndWith("java training", "ing");
		boolean myResult1 = obj.isEndWith("java training", "ng");
		boolean myResult2 = obj.isEndWith("java training", "java");
		boolean myResult3 = obj.isEndWith("java training", "train");
		
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
		
	}
	
	boolean isEndWith(String strOne, String strTwo) {
		
		boolean result = false;
		
		result = strOne.endsWith(strTwo);
		
		return result;
	}
	
}
