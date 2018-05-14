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

Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) --> true
no14([1, 2, 3, 4]) --> false
no14([2, 3, 4]) --> true
 */
public class no14 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("no14([1, 2, 3]) --> true\n");
		int[] outputA = {1, 2, 3};
		assertEquals(true, no14(outputA));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("no14([1, 2, 3, 4]) --> false\n");
		int[] outputA = {1, 2, 3, 4};
		assertEquals(false, no14(outputA));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("no14([2, 3, 4]) --> true\n");
		int[] outputA = {2, 3, 4};
		assertEquals(true, no14(outputA));
		i++;
	}
	
	public boolean no14(int[] nums) {
		  
		boolean ret = true;
		
		for (int i = 0; i < nums.length; i++) {
			
			if ((nums[i] == 1) || (nums[i] == 3)) {
				return false;
			}
		}
		
		return true;
	}
}
