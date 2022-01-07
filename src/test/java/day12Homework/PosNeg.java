package day12Homework;

public class PosNeg {
public static void main (String args[]) {
		
		boolean myResult = posNeg( 1,-1, false);
		boolean myResult1 = posNeg( -1,1, false);
		boolean myResult2 = posNeg( -4,-5, true);
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		
	}
	
	
	public static boolean posNeg( int n1, int n2, boolean aNum) {
		
		boolean result = false;
		
		if ( n1<0 && n2>0 && aNum==false) {
			
			result = true;
		} else if( n1>0 && n2<0 && aNum==false ) {
			
			result = true;
		} else if ( n1< 0 && n2< 0 && aNum==true) {
			
			result = true;
		} else {
			
			result = false;
		}
		
		return result;
		
	}
}




