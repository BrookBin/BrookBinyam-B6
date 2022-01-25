package com.noorteck.java.day22Homework;

public class Question2 {
	
	public static void main(String[] args) {
		
		Question2 obj = new Question2();
		
		boolean endWith = obj.isEndWith("java training", "ing");
		boolean endWith1 = obj.isEndWith("java training", "ng");
		boolean endWith2 = obj.isEndWith("java training", "java");
		boolean endWith3 = obj.isEndWith("java traniing", "train");
		boolean endWith4 = obj.isEndWith(null, "java");
		boolean endWith5 = obj.isEndWith(null, null);
		boolean endWith6 = obj.isEndWith("aaaabc", "abc");
		boolean endWith7 = obj.isEndWith("abc", null);
		
		
		System.out.println(endWith);
		System.out.println(endWith1);
		System.out.println(endWith2);
		System.out.println(endWith3);
		System.out.println(endWith4);
		System.out.println(endWith5);
		System.out.println(endWith6);
		System.out.println(endWith7);
	}
	
	boolean isEndWith(String strOne, String strTwo) {
		
		boolean result = false;
		
		if( (strTwo == null || strOne == null) || (strTwo == null && strOne == null)) {
			
			result = false;
			
		} else if(strOne.endsWith(strTwo)) {
			
			result = true;
		} 
		
		
		return result;
	}

}
