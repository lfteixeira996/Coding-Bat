/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Array_1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
Given an array of ints of even length, return a new array length 2 
containing the middle two elements from the original array. The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 */
public class makeMiddle {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeMiddle([1, 2, 3, 4]) → [2, 3]\n");
		int[] nums = {1, 2, 3, 4};
		int[] exp  = {2, 3};
		assertEquals("makeMiddle([1, 2, 3, 4]) → [2, 3]", exp, nums);
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]\n");
		int[] nums = {7, 1, 2, 3, 4, 9};
		int[] exp  = {2, 3};
		assertEquals("makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]", exp, nums);
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeMiddle([1, 2]) → [1, 2]\n");
		int[] nums = {1, 2};
		int[] exp  = {1, 2};
		assertEquals("makeMiddle([1, 2]) → [1, 2]", exp, nums);
		i++;
	}

	public int[] makeMiddle(int[] nums) {
		  
	}

}
