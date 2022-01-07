package day12Homework;

public class multiplesOf {

public static void main (String args[]) {
		
		boolean myResult = multipleOf( 3);
		boolean myResult1 = multipleOf( 10);
		boolean myResult2 = multipleOf( 8);
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		
	}
	
	public static boolean multipleOf( int n1) {
		
		boolean result = false;
		
		if ( n1 % 3==0 || n1 % 5==0) {
			
			result = true;
		}
		
		return result;
	}
	
}

