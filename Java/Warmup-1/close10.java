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
Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie. 
Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
*/


public class close10{
	
	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		System.out.println("Calculate close10(8, 13)\n");
		assertEquals("close10(8, 13) = 8", 8, close10(8, 13));
	}
	
	@Test
	public void Test2()
	{
		/*Test 2*/
		System.out.println("**********Test 2**********");
		System.out.println("Calculate close10(13, 8)\n");
		assertEquals("close10(13, 8) = 8", 8, close10(13, 8));
	}

	@Test
	public void Test3()
	{
		/*Test 3*/
		System.out.println("**********Test 3**********");
		System.out.println("Calculate close10(13, 7)\n");
		assertEquals("close10(13, 7) = 0", 0, close10(13, 7));
	}
	
	/********************************/
	public int close10(int a, int b) {

		int val1 = Math.abs(a-10);
		int val2 = Math.abs(b-10);
		
		if(val1 == val2)
			return 0;
		
		if(val1 < val2)
			return a;
		
		else
			return b;	
	}
}	




