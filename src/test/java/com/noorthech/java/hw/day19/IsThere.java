package com.noorthech.java.hw.day19;

public class IsThere {

	public static void main(String[] args) {
		
	IsThere obj = new IsThere();
	
	boolean myResult = obj.isThere("java training", "ini");
	boolean myResult1 = obj.isThere("java training", "ava");
	boolean myResult2 = obj.isThere("java training", "AVA");
	boolean myResult3 = obj.isThere("java training", "Java");
	
	System.out.println(myResult);
	System.out.println(myResult1);
	System.out.println(myResult2);
	System.out.println(myResult3);
	
		
	}
	 
	private boolean isThere(String strOne, String strTwo) {
		
		boolean result = false;
		
		if(strOne.contains(strTwo)) {
			
			result = true;
		}
		
		return result;
			
	}
		
}
