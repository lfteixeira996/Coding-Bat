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
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.


unlucky1([1, 3, 4, 5]) --> true
unlucky1([2, 1, 3, 4, 5]) --> true
unlucky1([1, 1, 1]) --> false
 */
public class unlucky1 {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("unlucky1([1, 3, 4, 5]) --> true\n");
		int[] nums = {1, 2, 3, 4, 5};
		assertEquals("unlucky1([1, 3, 4, 5]) --> true", true, nums);
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("unlucky1([2, 1, 3, 4, 5]) --> true\n");
		int[] nums = {2, 1, 3, 4, 5};
		assertEquals("unlucky1([2, 1, 3, 4, 5]) --> true", true, nums);
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("unlucky1([1, 1, 1]) --> false\n");
		int[] nums = {1, 1, 1};
		assertEquals("unlucky1([1, 1, 1]) --> false", false, nums);
		i++;
	}

	public boolean unlucky1(int[] nums) {
		  
	}

}
