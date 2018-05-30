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
Return true if the given non-negative number is 1 or 2 more than a multiple of 20. 
See also: Introduction to Mod

more20(20) --> false
more20(21) --> true
more20(22) --> true
 */
public class more20 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("more20(20) --> false\n");
		assertEquals(false, more20(20));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("more20(21) --> true\n");
		assertEquals(true, more20(21));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("more20(22) --> true\n");
		assertEquals(true, more20(22));
	    i++;
	}

	public boolean more20(int n) {
		  
	}

}
