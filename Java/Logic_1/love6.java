/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Logic_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**

The number 6 is a truly great number. 
Given two int values, a and b, return true if either one is 6. 
Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.


love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
 */
public class love6 {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("love6(6, 4) → true\n");
		assertEquals(true, love6(6, 4));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("love6(4, 5) → false\n");
		assertEquals(false, love6(4, 5));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("love6(1, 5) → true\n");
		assertEquals(true, love6(1, 5));
	    i++;
	}
	
	public boolean love6(int a, int b) {
		
		int newA = Math.abs(a);
		int newB = Math.abs(b);
		
		
		if (a==6 || b==6) {
			return true;
		}
		
		else if(Math.abs(newA+newB) == 6) {
			return true;
		}
		
		else if(Math.abs(newA-newB) == 6) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
