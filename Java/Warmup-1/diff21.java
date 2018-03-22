package test;
import org.junit.Test;

/*

Given an int n, return the absolute difference between 
n and 21, except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0

*/

public class diff21 {

	@Test
	public void myTest()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		int actual = diff21(19);
		System.out.println("Calculate diff21(19)");
		System.out.println("Expected: "+ 2);
		System.out.println("Received: "+ actual+'\n');
		
		/*Test 2*/
		System.out.println("**********Test 2**********");
		actual = diff21(10);
		System.out.println("Calculate diff21(11)");
		System.out.println("Expected: "+ 11);
		System.out.println("Received: "+ actual+'\n');
		
		/*Test 3*/
		System.out.println("**********Test 3**********");
		actual = diff21(21);
		System.out.println("Calculate diff21(0)");
		System.out.println("Expected: "+ 0);
		System.out.println("Received: "+ actual+'\n');
	}

	
	public int diff21(int n) {
		if (n > 21) {
			return Math.abs(n-21)*2;			
		}
		
		return Math.abs(n-21);
	}
	
}	