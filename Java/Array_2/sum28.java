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

Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) --> true
sum28([2, 3, 2, 2, 4, 2, 2]) --> false
sum28([1, 2, 3, 4]) --> false
 */
public class sum28 {

	private static int i = 1;
	
	@Test
	public void Test1()

	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sum28([2, 3, 2, 2, 4, 2]) --> true\n");
		int[] inputA = {2, 3, 2, 2, 4, 2};
		assertEquals(true, sum28(inputA));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sum28([2, 3, 2, 2, 4, 2, 2]) --> false\n");
		int[] inputA = {2, 3, 2, 2, 4, 2, 2};
		assertEquals(false, sum28(inputA));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sum28([1, 2, 3, 4]) --> false\n");
		int[] inputA = {1, 2, 3, 4};
		assertEquals(false, sum28(inputA));
		i++;
	}
	
	public boolean sum28(int[] nums) {
	
		int ret = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 2) {
				ret += nums[i];
			}
		}
		
		if (ret == 8) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
