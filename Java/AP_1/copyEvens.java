/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package AP_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given an array of positive ints, return a new array of length "count" containing 
the first even numbers from the original array. The original array will contain at least "count" even numbers.


copyEvens([3, 2, 4, 5, 8], 2) --> [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) --> [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) --> [6, 2, 4]
 */
public class copyEvens {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+counter+"**********");
		System.out.println("copyEvens([3, 2, 4, 5, 8], 2) --> [2, 4]\n");
		int[] input = {3, 2, 4, 5, 8};
		int[] expected = {2, 4};		
		assertEquals("copyEvens([3, 2, 4, 5, 8], 2) --> [2, 4]", expected, copyEvens2(input, 2));
		
	}

	
	@Test
	public void Test2()
	{
		counter++;
		System.out.println("**********Test "+counter+"**********");
		System.out.println("copyEvens([3, 2, 4, 5, 8], 3) --> [2, 4, 8]\n");
		int[] input = {3, 2, 4, 5, 8};
		int[] expected = {2, 4, 8};		
		assertEquals("copyEvens([3, 2, 4, 5, 8], 3) --> [2, 4, 8]", expected, copyEvens2(input, 3));
	}
	
	@Test
	public void Test3()
	{
		counter++;
		System.out.println("**********Test "+counter+"**********");
		System.out.println("copyEvens([6, 1, 2, 4, 5, 8], 3) --> [6, 2, 4]\n");
		int[] input = {6, 1, 2, 4, 5, 8};
		int[] expected = {6, 2, 4};		
		assertEquals("copyEvens([6, 1, 2, 4, 5, 8], 3) --> [6, 2, 4]", expected, copyEvens2(input, 3));
	}
	
	public int[] copyEvens(int[] nums, int count) {
		  
		int[] ret = new int[count];
		int x = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (x == count) {
				return ret;
			}
			
			if (nums[i] % 2 == 0) {
				ret[x] = nums[i];
				System.out.println(ret[x]);
				x++;
			}
		}
		return ret;
	}
	
	
	//using "for each" loop
	public int[] copyEvens2(int[] nums, int count) {
		  
		int[] ret = new int[count];
		int x = 0;
		
		for (int ite : nums) {
			
			if (x == count) {
				return ret;
			}
			
			if (ite % 2 == 0) {
				ret[x] = ite;
				System.out.println(ret[x]);
				x++;
			}
		}
		
		return ret;
		
	}
}
