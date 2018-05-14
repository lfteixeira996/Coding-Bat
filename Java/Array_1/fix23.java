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
Given an int array length 3, if there is a 2 in the 
array immediately followed by a 3, set the 3 element to 0. Return the changed array.


fix23([1, 2, 3]) --> [1, 2, 0]
fix23([2, 3, 5]) --> [2, 0, 5]
fix23([1, 2, 1]) --> [1, 2, 1]
 */
public class fix23 {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("fix23([1, 2, 3]) --> [1, 2, 0]\n");
		int[] nums = {1, 2, 3};
		int[] exp  = {1, 2, 0};
		assertEquals("fix23([1, 2, 3]) --> [1, 2, 0]", exp, nums);
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("fix23([2, 3, 5]) --> [2, 0, 5]\n");
		int[] nums = {2, 3, 5};
		int[] exp  = {2, 0, 5};
		assertEquals("fix23([2, 3, 5]) --> [2, 0, 5]", exp, nums);
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("fix23([1, 2, 1]) --> [1, 2, 1]\n");
		int[] nums = {1, 2, 1};
		int[] exp  = {1, 2, 1};
		assertEquals("fix23([1, 2, 1]) --> [1, 2, 1]", exp, nums);
		i++;
	}
	
	public int[] fix23(int[] nums) {
		  		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 && nums[++i] == 3) {
				nums[++i] = 0;
			}
			
			System.out.println(" " + nums[i]);
		}
		
		return nums;
	}

}
