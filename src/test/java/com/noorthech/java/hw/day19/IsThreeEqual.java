package com.noorthech.java.hw.day19;

public class IsThreeEqual {

	public static void main(String[] args) {
		
		IsThreeEqual obj = new IsThreeEqual();
		
		boolean myResult = obj.isThreeEqual("Day", "DAY", "DaY");
		boolean myResult1 = obj.isThreeEqual("week", "weekday", "mondy");
		boolean myResult2 = obj.isThreeEqual("java", "JAVa", "jaVa");
		boolean myResult3 =obj.isThreeEqual("javaPrograming", "java programing", "Programing in Java");
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
		
	}
	
	
	
	protected boolean isThreeEqual(String strOne, String strTwo, String strThree) {
		
		boolean result = false;
		
		if ( strOne.equalsIgnoreCase(strTwo) && strTwo.equalsIgnoreCase(strThree)) {
			
			result = true;
		}
		
		return result;
		
	}
}
