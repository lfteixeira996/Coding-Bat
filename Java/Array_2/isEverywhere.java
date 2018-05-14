/**
 * @author Luis Teixeira
 *
 * @date   05/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Array_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
at least one of the pair is that value. Return true if the given value is everywhere in the array.


isEverywhere([1, 2, 1, 3], 1) --> true
isEverywhere([1, 2, 1, 3], 2) --> false
isEverywhere([1, 2, 1, 3, 4], 1) --> false
 */
public class isEverywhere {

	private static int i = 1;
	
	@Test
	public void Test1()

	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("isEverywhere([1, 2, 1, 3], 1) --> true\n");
		int[] inputA = {1, 2, 1, 3};
		assertEquals(true, isEverywhere(inputA,1));
		i++;
	}

	@Test
	public void Test2()

	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("isEverywhere([1, 2, 1, 3], 2) --> false\n");
		int[] inputA = {1, 2, 1, 3};
		assertEquals(true, isEverywhere(inputA,1));
		i++;
	}
	
	@Test
	public void Test3()

	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("isEverywhere([1, 2, 1, 3, 4], 1) --> false\n");
		int[] inputA = {1, 2, 1, 3, 4};
		assertEquals(false, isEverywhere(inputA,1));
		i++;
	}
	
	
	public boolean isEverywhere(int[] nums, int val) {
		  
	}
}
