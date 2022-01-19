package com.noorthech.java.hw.day19;

public class ToLower {

	public static void main(String[] args) {
		
	ToLower obj = new ToLower();
	
	String myResult = obj.toLower("espn");
	String myResult1 = obj.toLower("SOCCER");
	String myResult2 = obj.toLower("STRING CLASS");
	
	
	System.out.println(myResult);
	System.out.println(myResult1);
	System.out.println(myResult2);
	
		
	}
	
	
	protected String toLower(String strOne) {
		
		String result = " ";
		
		result = strOne.toLowerCase();
		
		
		return result;
	}
	
}
