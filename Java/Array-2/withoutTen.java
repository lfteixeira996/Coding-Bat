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

Return a version of the given array where all the 10's have been removed. 
The remaining elements should shift left towards the start of the array 
as needed, and the empty spaces a the end of the array should be 0.

So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.


withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
 */
public class withoutTen {

	private static int i = 1;
	
	@Test
	public void Test1()

	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]\n");
		int[] inputA  = {1, 10, 10, 2};
		int[] outputA = {1, 2, 0, 0};
		
		assertArrayEquals(outputA, withoutTen(inputA));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("withoutTen([10, 2, 10]) → [2, 0, 0]\n");
		int[] inputA  = {10, 2, 10};
		int[] outputA = {2, 0, 0};
		
		assertArrayEquals(outputA, withoutTen(inputA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("withoutTen([1, 99, 10]) → [1, 99, 0]\n");
		int[] inputA  = {1, 99, 10};
		int[] outputA = {1, 99, 0};
		
		assertArrayEquals(outputA, withoutTen(inputA));
		i++;
	}

	public int[] withoutTen(int[] nums) {
		
		int[] ret = new int[nums.length];
		int aux = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] != 10) {
				ret[aux] = nums[i];
				aux++;
			}
		}
		
		return ret;	
	}
}
