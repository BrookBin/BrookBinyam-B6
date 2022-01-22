package com.noorthech.java.hw.stringClass;

public class Question16 {

	public static void main(String[] args) {
		
		Question16 obj = new Question16();
		
		String myResult= obj.concatString("Java", "awesome");
		String myResult1= obj.concatString("food", "door");
		String myResult2= obj.concatString("java", "training");
		String myResult3= obj.concatString("Pro", "ogress");
		
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}

	String concatString(String strOne, String strTwo) {
		
		String result = " ";
		

		if(strOne.charAt(strOne.length()-1)== strTwo.charAt(0)) {
			
		result = strOne.substring(0,strOne.length()-1).concat(strTwo);
		
		} else {
			
		result= strOne.concat(strTwo);
		}
		
		return result;
	}
}

//if(strOne.charAt(strOne.length())== strTwo.charAt(0)) {

