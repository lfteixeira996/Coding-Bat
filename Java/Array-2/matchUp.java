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

Given arrays nums1 and nums2 of the same length, for every element in nums1,
consider the corresponding element in nums2 (at the same index). 
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.


matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
 */
public class matchUp {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("matchUp([1, 2, 3], [2, 3, 10]) → 2\n");
		int[] inputA = {1, 2, 3};
		int[] inputB = {2, 3, 10};
		
		assertEquals(2, matchUp(inputA, inputB));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("matchUp([1, 2, 3], [2, 3, 5]) → 3\n");
		int[] inputA = {1, 2, 3};
		int[] inputB = {2, 3, 5};
		
		assertEquals(3, matchUp(inputA, inputB));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("matchUp([1, 2, 3], [2, 3, 3]) → 2\n");
		int[] inputA = {1, 2, 3};
		int[] inputB = {2, 3, 3};
		
		assertEquals(2, matchUp(inputA, inputB));
		i++;
	}

	public int matchUp(int[] nums1, int[] nums2) {
		  
	}
}
