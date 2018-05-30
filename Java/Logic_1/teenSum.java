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

Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, 
are extra lucky. So if either value is a teen, just return 19.


teenSum(3, 4) --> 7
teenSum(10, 13) --> 19
teenSum(13, 2) --> 19
 */
public class teenSum {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("teenSum(3, 4) --> 7\n");
		assertEquals(7, teenSum(3, 4));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("teenSum(10, 13) --> 19\n");
		assertEquals(19, teenSum(10, 13));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("teenSum(13, 2) --> 19\n");
		assertEquals(19, teenSum(13, 2));
	    i++;
	}
	
	
	public int teenSum(int a, int b) {
		
		if ((a>=13 && a<=19) || (b>=13 && b<=19)) {
			return 19;
		}
		
		else {
			return a+b;
		}
		
	}

}
