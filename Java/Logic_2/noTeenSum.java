/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Logic_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given 3 int values, a b c, return their sum. 
However, if any of the values is a teen -- in the range 13..19 inclusive 
-- then that value counts as 0, except 15 and 16 do not count as a teens. 
Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. 
In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

noTeenSum(1, 2, 3) --> 6
noTeenSum(2, 13, 1) --> 3
noTeenSum(2, 1, 14) --> 3
 */
public class noTeenSum {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("noTeenSum(1, 2, 3) --> 6\n");
		assertEquals("noTeenSum(1, 2, 3) --> 6", 6, noTeenSum(1, 2, 3));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("noTeenSum(2, 13, 1) --> 3\n");
		assertEquals("noTeenSum(2, 13, 1) --> 3", 3, noTeenSum(2, 13, 1));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("noTeenSum(2, 1, 14) --> 3\n");
		assertEquals("noTeenSum(2, 1, 14) --> 3", 3, noTeenSum(2, 1, 14));
		i++;
	}
	
	
	public int fixTeen(int n) {
		
		if (n>=13 && n<=19) {
			
			if ((n!=15) && (n!=16)) {
				return 0;
			}
			
			else {
				return n;
			}
		}
		
		else {
			return n;
		}
		
	}
	
	public int noTeenSum(int a, int b, int c) {
		  
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

}
