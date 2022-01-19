package com.noorthech.java.hw.day19;

public class ToUpper {

	
	public static void main(String[] args) {
		
		ToUpper obj = new ToUpper();
		
		String myResult = obj.toUpper("pro");
		String myResult1 = obj.toUpper("java");
		String myResult2 = obj.toUpper("java training");
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		
	}
	
	String toUpper(String strOne){
		
		String result = " ";
		
		result= strOne.toUpperCase();
		
		return result;
	}
	
}
