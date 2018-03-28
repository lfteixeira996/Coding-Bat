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
 
Given an array of ints of odd length, return a new array 
length 3 containing the elements from the middle of the array.
The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]

 */
public class midThree {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("midThree([1, 2, 3, 4, 5]) → [2, 3, 4]\n");
		int[] nums = {1, 2, 3, 4, 5};
		int[] exp  = {2, 3, 4};
		assertEquals("midThree([1, 2, 3, 4, 5]) → [2, 3, 4]", exp, nums);
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]\n");
		int[] nums = {8, 6, 7, 5, 3, 0, 9};
		int[] exp  = {7, 5, 3};
		assertEquals("midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]", exp, nums);
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("midThree([1, 2, 3]) → [1, 2, 3]\n");
		int[] nums = {1, 2, 3};
		int[] exp  = {1, 2, 3};
		assertEquals("midThree([1, 2, 3]) → [1, 2, 3]", exp, nums);
		i++;
	}
	

	public int[] midThree(int[] nums) {
		  
	}

	
}
