/**
 * @author Luis Teixeira
 *
 * @date   02/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
public class array123 {

	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		System.out.println("array123([1, 1, 2, 3, 1]) → true\n");
		
		//array
		int[] array = {1, 1, 2, 3, 1};
		
		assertEquals("array123([1, 1, 2, 3, 1]) → true", true, array123(array));
	}
	
	@Test
	public void Test2()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		System.out.println("array123([1, 1, 2, 4, 1]) → false\n");
		
		//array
		int[] array = {1, 1, 2, 4, 1};
		
		assertEquals("array123([1, 1, 2, 4, 1]) → false", false, array123(array));
	}

	@Test
	public void Test3()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		System.out.println("array123([1, 1, 2, 1, 2, 3]) → true\n");
		
		//array
		int[] array = {1, 1, 2, 1, 2, 3};
		
		assertEquals("array123([1, 1, 2, 1, 2, 3]) → true", true, array123(array));
	}
	
	public boolean array123(int[] nums) {

		
		for (int i = 0; i < nums.length; i++) {
			
		}
		
	}

}
