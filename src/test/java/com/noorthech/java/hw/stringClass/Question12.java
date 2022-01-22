package com.noorthech.java.hw.stringClass;

public class Question12 {

	public static void main(String[] args) {
		
		 replaceStr("I cannot do it", "cannot", "can");
		 replaceStr("Tomorrow is my day", "Tomorrow", "Today");
		 
		 
	}
	
	public static void replaceStr(String strOne, String strTwo, String strThree) {
		
		System.out.println(strOne.replaceAll(strTwo, strThree));
		
		
	}
	
}
