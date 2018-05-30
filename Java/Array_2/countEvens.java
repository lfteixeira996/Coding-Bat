/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Array_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.


countEvens([2, 1, 2, 3, 4]) --> 3
countEvens([2, 2, 0]) --> 3
countEvens([1, 3, 5]) --> 0
 */
public class countEvens {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countEvens([2, 1, 2, 3, 4]) --> 3\n");
		int[] numA = {2, 1, 2, 3, 4};
		assertEquals("countEvens([2, 1, 2, 3, 4]) --> 3", 3, countEvens(numA));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countEvens([2, 2, 0]) --> 3\n");
		int[] numA = {2, 2, 0};
		assertEquals("countEvens([2, 2, 0]) --> 3", 3, countEvens(numA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countEvens([1, 3, 5]) --> 0\n");
		int[] numA = {1, 3, 5};
		assertEquals("countEvens([1, 3, 5]) --> 0", 0, countEvens(numA));
		i++;
	}
	
	public int countEvens(int[] nums) {
		
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		
		return count;
	}
}
