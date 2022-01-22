package com.noorthech.java.hw.stringClass;

public class Question11 {

	public static void main(String[] args) {
		
		
		Question11 obj = new Question11();
		
		String myResult = obj.threeEqual("Java Pro", 'P', 'B');
		String myResult1 = obj.threeEqual("Lazy mode", 'm', 'C');
		String myResult2 = obj.threeEqual("Training", 'T', ' ');
		
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		
	}
	
	
	protected String threeEqual(String str, char oldChar, char newChar) {
		
		String result = "";
		
		result= str.replace(oldChar, newChar);
		
		
		return result;
	}
}
