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
Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) --> true
no23([4, 2]) --> false
no23([3, 5]) --> false
 */
public class no23 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("no23([4, 5]) --> true\n");
		int[] nums = {4, 5};
		assertEquals("no23([4, 5]) --> true", true, no23(nums));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("no23([4, 2]) --> false\n");
		int[] nums = {4, 2};
		assertEquals("no23([4, 2]) --> false", false, no23(nums));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("no23([3, 5]) --> false\n");
		int[] nums = {3, 5};
		assertEquals("no23([3, 5]) --> false", false, no23(nums));
		i++;
	}

	public boolean no23(int[] nums) {
		  
		if ((nums[0]==2) || (nums[0]==3) || (nums[1]==2) || (nums[1]==3)) {
			return false;
		}
		
		return true;
	}

}
