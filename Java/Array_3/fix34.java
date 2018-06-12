/**
 * @author 	Luis Teixeira
 *
 * @data 	11 Jun 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package Array_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Return an array that contains exactly the same numbers as the given array, 
but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. 

The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.


fix34([1, 3, 1, 4]) --> [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) --> [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) --> [3, 4, 2, 2]
 */
public class fix34 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("fix34([1, 3, 1, 4]) --> [1, 3, 4, 1]\n");
		int[] input = {1, 3, 1, 4};
		int[] output = {1, 3, 4, 1};
		assertEquals("fix34([1, 3, 1, 4]) --> [1, 3, 4, 1]", output , fix34(input));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("fix34([1, 3, 1, 4, 4, 3, 1]) --> [1, 3, 4, 1, 1, 3, 4]\n");
		int[] input = {1, 3, 1, 4, 4, 3, 1};
		int[] output = {1, 3, 4, 1, 1, 3, 4};
		assertEquals("fix34([1, 3, 1, 4, 4, 3, 1]) --> [1, 3, 4, 1, 1, 3, 4]", output , fix34(input));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("fix34([3, 2, 2, 4]) --> [3, 4, 2, 2]\n");
		int[] input = {3, 2, 2, 4};
		int[] output = {3, 4, 2, 2};
		assertEquals("fix34([3, 2, 2, 4]) --> [3, 4, 2, 2]", output , fix34(input));
		i++;
	}
	
	public int[] fix34(int[] nums) {
		  
	}
}
