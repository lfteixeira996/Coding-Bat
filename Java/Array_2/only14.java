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

Given an array of ints, return true if every element is a 1 or a 4.


only14([1, 4, 1, 4]) --> true
only14([1, 4, 2, 4]) --> false
only14([1, 1]) --> true
 */
public class only14 {

	private static int i = 1;
	
	@Test
	public void Test1()

	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("only14([1, 4, 1, 4]) --> true\n");
		int[] inputA = {1, 4, 1, 4};
		assertEquals(true, only14(inputA));
		i++;
	}
	
	@Test
	public void Test2()

	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("only14([1, 4, 2, 4]) --> false\n");
		int[] inputA = {1, 4, 2, 4};
		assertEquals(false, only14(inputA));
		i++;
	}
	
	@Test
	public void Test()

	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("only14([1, 1]) --> true\n");
		int[] inputA = {1, 1};
		assertEquals(true, only14(inputA));
		i++;
	}

	public boolean only14(int[] nums) {
		  
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=1 && nums[i]!=4) {
				return false;
			}
		}	
		return true;
	}
}
