package com.noorthech.java.hw.day19;

public class IsEqual {

	public static void main(String[] args) {
		
		boolean myResult = isEqual("sdet","SDET");
		boolean myResult1 = isEqual("testing","testing");
		boolean myResult2 = isEqual("java","java");
		boolean myResult3 = isEqual("java","java programing");
		
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
		
	}
	
	
	
	static boolean isEqual(String strOne, String strTwo) {
		
		boolean result = false;
		
		if( strOne.equals(strTwo)) {
			result = true;
		}
		
		return result;
	}
	
}
