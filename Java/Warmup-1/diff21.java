/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_1;
import static org.junit.Assert.assertEquals;

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
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		System.out.println("Calculate diff21(19)\n");
		assertEquals("diff21(19) = 2", 2, diff21(19));
	}

	@Test
	public void Test2()
	{
		/*Test 2*/
		System.out.println("**********Test 2**********");
		System.out.println("Calculate diff21(10)\n");
		assertEquals("diff21(10) = 11", 11, diff21(10));
	}
	
	@Test
	public void Test3()
	{
		/*Test 3*/
		System.out.println("**********Test 3**********");
		System.out.println("Calculate diff21(21)\n");
		assertEquals("diff21(21) = 2", 0, diff21(21));
	}
	
	
	
	/*********************************************************/
	public int diff21(int n) {
		if (n > 21) {
			return Math.abs(n-21)*2;			
		}
		
		return Math.abs(n-21);
	}
	
}	