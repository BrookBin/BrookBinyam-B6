package com.noorteck.java.day22Homework;

public class Question6 {

	public static void main(String[] args) {
		
		Question6 obj = new Question6();
		boolean myResult = obj.endWithNG(null);
		boolean myResult1 = obj.endWithNG("I like to practice");
		boolean myResult2 = obj.endWithNG("Everyone is practicing");
		boolean myResult3 = obj.endWithNG(" I am studying");
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
		
	}
	
	public boolean endWithNG(String strOne) {
		
		boolean result = false;
		
		if(strOne == null) {
			
			result =false;
		} else {
			
			result= strOne.endsWith("ng");
		}
		
		
		return result;
	}
}
