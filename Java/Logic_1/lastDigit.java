/**
 * @author Luis Teixeira
 *
 * @date   02/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Logic_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true 
 */
public class lastDigit {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lastDigit(23, 19, 13) → true\n");
		assertEquals(true, lastDigit(23, 19, 13));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lastDigit(23, 19, 12) → false\n");
		assertEquals(false, lastDigit(23, 19, 12));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lastDigit(23, 19, 3) → true\n");
		assertEquals(true, lastDigit(23, 19, 3));
	    i++;
	}
	
	public boolean lastDigit(int a, int b, int c) {
		
		int auxA = a%10;
		int auxB = b%10;
		int auxC = c%10;
				
		if (auxA == auxB || auxA == auxC || auxB == auxC) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
}
