package com.noorthech.java.hw.day19;

public class CombineStr {
	
	public static void main(String[] args) {
		
		CombineStr obj = new CombineStr();
		
		String myResult = obj.combineStr("day", "ONE", "work", "HOURS");
		String myResult1 = obj.combineStr("week", "weekend", "monday", "Tuesday");
		String myResult2 = obj.combineStr("restoN", "vA", "baltiMORE", "MD");
		String myResult3 = obj.combineStr("java", "is", "fun", "LEARNING");
		
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
		
		
	}
	
	protected String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		
		String result = " ";
		
		String strOneLoc = strOne.toUpperCase();
		String strThreeLoc = strThree.toUpperCase();
		String strTwoLoc= strTwo.toLowerCase();
		String strFourLoc = strFour.toLowerCase();
		
		result = strOneLoc.concat(strTwoLoc)+strThreeLoc.concat(strFourLoc);
		
		return result;
		
	}

}
