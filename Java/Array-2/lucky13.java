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

Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */
public class lucky13 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lucky13([0, 2, 4]) → true\n");
		int[] numA = {0, 2, 4};
		assertEquals("lucky13([0, 2, 4]) → true", true, lucky13(numA));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lucky13([1, 2, 3]) → false\n");
		int[] numA = {1, 2, 3};
		assertEquals("lucky13([1, 2, 3]) → false", false, lucky13(numA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lucky13([1, 2, 4]) → false\n");
		int[] numA = {1, 2, 4};
		assertEquals("lucky13([1, 2, 4]) → false", false, lucky13(numA));
		i++;
	}
	
	public boolean lucky13(int[] nums) {
		  		
		for (int i = 0; i < nums.length; i++) {
		
			if ((nums[i] == 1) || (nums[i] == 3)) {
				return false;
			}
		}
		
		return true;
	}
}
