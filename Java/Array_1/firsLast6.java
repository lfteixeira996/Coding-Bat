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
Given an array of ints, return true if 6 appears 
as either the first or last element in the array. The array will be length 1 or more.


firstLast6([1, 2, 6]) --> true
firstLast6([6, 1, 2, 3]) --> true
firstLast6([13, 6, 1, 2, 3]) --> false
 */
public class firsLast6 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstLast6([1, 2, 6]) --> true\n");
		int[] nums = {1, 2, 6};
		assertEquals("firstLast6([1, 2, 6]) --> true", true, firstLast6(nums));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstLast6([6, 1, 2, 3]) --> true\n");
		int[] nums = {6, 1, 2, 3};
		assertEquals("firstLast6([6, 1, 2, 3]) --> true", true, firstLast6(nums));
		i++;
	}

	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstLast6([13, 6, 1, 2, 3]) --> false\n");
		int[] nums = {13, 6, 1, 2, 3};
		assertEquals("firstLast6([13, 6, 1, 2, 3]) --> false", false, firstLast6(nums));
		i++;
	}
	
	
	
	public boolean firstLast6(int[] nums) {
		  
		if (nums.length == 1) {
			
			if (nums[0] == 6) {
				return true;
			}
			
			else {
				return false;
			}
		}
		
		
		if(nums[0]==6 || nums[nums.length-1]==6)
		{
			return true;
		}
		
		return false;
	}
}
