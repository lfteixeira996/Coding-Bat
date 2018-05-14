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

Return the sum of the numbers in the array, returning 0 for an empty array. 
Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) --> 6
sum13([1, 1]) --> 2
sum13([1, 2, 2, 1, 13]) --> 6
 */
public class sum13 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sum13([1, 2, 2, 1]) --> 6\n");
		int[] numA = {1, 2, 2, 1};
		assertEquals("sum13([1, 2, 2, 1]) --> 6", 6, sum13(numA));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sum13([1, 1]) --> 2\n");
		int[] numA = {1, 1};
		assertEquals("sum13([1, 1]) --> 2", 2, sum13(numA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sum13([1, 2, 2, 1, 13]) --> 6\n");
		int[] numA = {1, 2, 2, 1, 13};
		assertEquals("sum13([1, 2, 2, 1, 13]) --> 6", 6, sum13(numA));
		i++;
	}

	public int sum13(int[] nums) {

		int ret = 0;
		
		if (nums.length == 0) {
			return 0;
		}
		
		else {
			
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 13) {
					i = i+1;
				}
				
				else {
					ret += nums[i];
				}
			}
		}
		
		return ret;
	}
}
