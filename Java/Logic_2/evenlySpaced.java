/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Logic_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between 
small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */
public class evenlySpaced {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("evenlySpaced(2, 4, 6) → true\n");
		assertEquals("evenlySpaced(2, 4, 6) → true", true, evenlySpaced(2, 4, 6));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("evenlySpaced(4, 6, 2) → true\n");
		assertEquals("evenlySpaced(4, 6, 2) → true", true, evenlySpaced(4, 6, 2));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("evenlySpaced(4, 6, 3) → false\n");
		assertEquals("evenlySpaced(4, 6, 3) → false", false, evenlySpaced(4, 6, 3));
		i++;
	}
	
	public boolean evenlySpaced(int a, int b, int c) {
		
		int small, medium, large = 0;
		
		large = Integer.max(a, b);
		large = Integer.max(large, c);
		
		small = Integer.min(a, b);
		small = Integer.min(small, c);
		
		if (condition) {
			
		}
		
		
	}
}
