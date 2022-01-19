package com.noorthech.java.hw.day19;

public class HelloTO {

	public static void main(String[] args) {
		HelloTO obj = new HelloTO();

		String myResult = obj.helloTo("Denis");
		String myResult1 = obj.helloTo("Malek");
		String myResult2 = obj.helloTo("Sara");

		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);

	}

	String helloTo(String strOne) {

		String result = " ";

		result = "Hello " + strOne;

		return result;
	}

}
